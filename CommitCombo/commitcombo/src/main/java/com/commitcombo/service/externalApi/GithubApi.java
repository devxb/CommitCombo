package com.commitcombo.service.externalApi;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.commitcombo.service.externalApi.token.Token;
import com.commitcombo.service.externalApi.token.GithubToken;
import com.commitcombo.service.commonUtil.DateOperator;

import java.time.LocalDate;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;

@Service
public class GithubApi{
	
	private Token token;
	
	private DateOperator dateOperator;
	
	@Autowired
	@Qualifier("githubToken")
	public void setToken(Token token){
		this.token = token;
	}
	
	@Autowired
	public void setDateOperator(DateOperator dateOperator){
		this.dateOperator = dateOperator;
	}
	
	public long getContributionCount(String username){
		return operateContributionCount(username, LocalDate.now());
	}
	
	private long operateContributionCount(String username, LocalDate localDate){
		
		long contributionCount = 0L;
		boolean[] checkCalendar = new boolean[dateOperator.dateOptimize(localDate)+5];
		String calendar = null;
		try{
			calendar = getCalendar(username, localDate);
		}catch(Exception E){
			E.printStackTrace();
		}
		if(calendar == null) return 0;
		System.out.println("calendar = " + calendar);
		JSONParser jsonParser = new JSONParser();
		Object StringToJson = null;
		try{
			StringToJson = jsonParser.parse(calendar);
		}catch(ParseException PE){
			PE.printStackTrace();
			return 0;
		}
		JSONObject edge = (JSONObject)StringToJson;
		edge = (JSONObject)edge.get("data");
			
		JSONObject rateLimit = (JSONObject)edge.get("rateLimit");
		
		edge = (JSONObject)edge.get("user");
		System.out.println(edge);
		edge = (JSONObject)edge.get("contributionsCollection");
		System.out.println(edge);
		edge = (JSONObject)edge.get("contributionCalendar");
		System.out.println(edge);
		
		JSONArray userCalendar = (JSONArray)edge.get("weeks");
		
		for(int week = userCalendar.size()-1; week >= 0; week--){
			JSONObject tempWeek = (JSONObject)userCalendar.get(week);
        	JSONArray oneWeek = (JSONArray)tempWeek.get("contributionDays");
			for(int day = oneWeek.size()-1; day >= 0; day--){
				JSONObject oneDay = (JSONObject)oneWeek.get(day);
				int thisDate = dateOperator.dateOptimize((String)oneDay.get("date"));
                String thisDateColor = (String)oneDay.get("color");
            	if(checkCalendar[thisDate]) continue;
                if(thisDateColor.equals("#ebedf0")) return contributionCount;
                checkCalendar[thisDate] = true;
                contributionCount++;
			}
		}
		return contributionCount + operateContributionCount(username, localDate.minusYears(1));
	}
	
	private String getCalendar(String username, LocalDate localDate) throws Exception{
		String date = localDate.toString();
		String query = getGithubApiQuery(username, localDate);
		URL url = new URL("https://api.github.com/graphql");
		final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
		try(AutoCloseable autoCloseable = () -> httpURLConnection.disconnect()){
			
			httpURLConnection.setRequestMethod("POST");
			httpURLConnection.setRequestProperty("Content-Type","application/json");
            httpURLConnection.setRequestProperty("Authorization", this.token.getToken());
			httpURLConnection.setDoOutput(true);
			
			try(OutputStream outputStream = httpURLConnection.getOutputStream()){
				outputStream.write(query.getBytes("utf-8"));
				try(BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"))){
					return br.readLine();
				}
			}
			
		}catch(IllegalStateException ISE){
			ISE.printStackTrace();
		}catch(NullPointerException NPE){
			NPE.printStackTrace();
		}catch(ProtocolException PE){
			PE.printStackTrace();
		}catch(MalformedURLException MFUE){
			MFUE.printStackTrace();
		}catch(IOException IOE){
			IOE.printStackTrace();
		}catch(Exception E){
			E.printStackTrace();
		}
		return null;
	}
	
	private String getGithubApiQuery(String username, LocalDate localDate){
		String date = localDate.toString();
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		sb.append("\"query\" : \"query($login: String!, $to: DateTime){ rateLimit{cost remaining limit nodeCount} user(login:$login){ name contributionsCollection(to: $to){ contributionCalendar{colors weeks{ contributionDays{ date color } } } } } }\", ");
		sb.append("\"variables\" : {\"login\" : ");
		sb.append("\"");
		sb.append(username);
		sb.append("\",");
		sb.append("\"to\" : ");
		sb.append("\"");
		sb.append(date);
		sb.append("T00:00:00Z\"");
		sb.append("}\n");
		sb.append("}\n");
		return sb.toString();
	}
	
}
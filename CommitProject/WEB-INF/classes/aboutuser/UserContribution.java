package aboutuser;

import java.util.*;
import java.net.*;
import java.io.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class UserContribution{  
    
    private boolean[] checkCalendar;
    private String userName;
    
    public int getContributions(String user){
        String serverDate = GetDate.getNowDate();
        setter(user, serverDate);
        return getContributionCount(serverDate);
    }
    
    private void setter(String user, String date){
        this.userName = user;
        int standardDay = GetDate.dateOptimizer(date); // 100만배열에 저장하기위해 날짜를 축소시킨다. -> 2021-06-05 -> 210605
        checkCalendar = new boolean[standardDay+5];
        checkCalendar[standardDay] = true; // 오늘날짜는 체크하지않으므로, true로 바꿔주고 시작
    }
    
    private int getContributionCount(String date){
        try{
            
            int contributionCount = 0;
            
            String userContributionData = getUserCalendar(date);
            JSONParser parser = new JSONParser();
            Object StringToJson = parser.parse(userContributionData);
            JSONObject edge = (JSONObject)StringToJson; // data { rateLimit{ } user{ } }
            edge = (JSONObject)edge.get("data");
            
            // rateLimit
            JSONObject rateLimit = (JSONObject)edge.get("rateLimit"); // rateLimit{ cost(Int!) remaining(Int!) limit(Int!) nodeCount(Int!) }
            // END-rateLimit 
            
            edge = (JSONObject)edge.get("user"); // user{ name(String!) contributionCollection{ } } 
            edge = (JSONObject)edge.get("contributionsCollection"); // contributionCollection{ contributionCalendar{ colors[String!] weeks[Edges!] } }
            edge = (JSONObject)edge.get("contributionCalendar"); // contributionCalendar{ color[String] weeks{ } }
            
            JSONArray userCalendar = (JSONArray)edge.get("weeks"); // weeks[{ contributionDays[{ }] }]
            
            for(int week = userCalendar.size()-1; week >= 0; week--){
                
                JSONObject tempWeek = (JSONObject)userCalendar.get(week);
                JSONArray oneWeek = (JSONArray)tempWeek.get("contributionDays"); // contributionDays[ { date color } ]
                
                for(int day = oneWeek.size()-1; day >= 0; day--){
                    JSONObject oneDay = (JSONObject)oneWeek.get(day);
                    int thisDate = GetDate.dateOptimizer((String)oneDay.get("date"));
                    String thisDateColor = (String)oneDay.get("color");
                    if(checkCalendar[thisDate]) continue;
                    if(thisDateColor.equals("#ebedf0")) return contributionCount; // #ebedf0 = no contributions this day
                    checkCalendar[thisDate] = true;
                    contributionCount++;
                }
            }
            
            return contributionCount + getContributionCount(GetDate.getOneYearsAgo(date)); 
        } catch (Exception E){
            System.out.println("parseErr");
        }
        return 0;
    }
    
    private String getUserCalendar(String date){
        try{
            
            int ret = 0;
            
            URL url = new URL("https://api.github.com/graphql");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type","application/json");
            con.setRequestProperty("Authorization","bearer `none`");
            con.setDoOutput(true);
            //makeQuery
            
            String query = "{\n";
            
            query += "\"query\" : \"query($login: String!, $to: DateTime){ rateLimit{cost remaining limit nodeCount} user(login:$login){ name contributionsCollection(to: $to){ contributionCalendar{colors weeks{ contributionDays{ date color } } } } } }\", ";
            query += "\"variables\" : {\"login\" : " + "\"" + userName + "\"," + "\"to\" : " + "\"" + date + "T00:00:00Z\"" + "}\n"; // date날짜의 00시를 기준으로 체크
            query += "}\n";
            
            OutputStream setQuery = con.getOutputStream();
            setQuery.write(query.getBytes("utf-8"));
            setQuery.close();
            System.out.println(query);
            System.out.println(con.getResponseCode());
            
            // END-makeQuery
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            String data = br.readLine();
            
            return data;
        }catch(Exception E){
            System.out.println("Error_getCommit");
            return "";
        }
    }
    
}
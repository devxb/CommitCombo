package aboutuser;

import java.util.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;

public class HTMLParser{
    
    private static final int[] daysOfMonth = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final SimpleDateFormat y = new SimpleDateFormat("yyyy");
    private static final SimpleDateFormat m = new SimpleDateFormat("MM");
    private static final SimpleDateFormat d = new SimpleDateFormat("dd");
    
    public static int getCommitCombo(String user){
        String year = y.format(new Date());
        String month = m.format(new Date());
        String day = d.format(new Date());
        return calcCommitCombo(user, year+"-01-01", year+"-"+month+"-"+day,true);
    }
    
    private static int calcCommitCombo(String user, String fromDate, String toDate, boolean trig){
        int ans = 0;
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        try{
            
            String targetURL = "https://github.com/"+user+"?tab=overview&from=" + fromDate + "&to=" + toDate;
            
            URL url = new URL(targetURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection(); 
            if(user == "" || con.getResponseCode() == 404) return -1;
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String line = null;
            int skip = 0;
            while(true){
                if(skip < 1000){ 
                    skip++; 
                    continue;
                }
                if((line = br.readLine()) == null) break;
                if(line.contains("data-count")){
                    int idx = line.lastIndexOf("data-count");
                    idx += 12;
                    ansList.add((int)line.charAt(idx)-(int)'0');
                }
            }
            
        } catch (Exception e){}
        int countingDate = 0;
        int year = Integer.parseInt(toDate.substring(0,4));
        int toMonth = Integer.parseInt(toDate.substring(5,7));
        int toDays = Integer.parseInt(toDate.substring(8,10));
        
        for(int month = 1; month <= 12; month++){
            if(month < toMonth) countingDate += daysOfMonth[month];
            if(month == 2 && (year%4==0)) countingDate++;
            if(month == toMonth) {
                countingDate += toDays;
                break;
            }
        }
        
        if(trig == true) countingDate--;
        
        for(int i = countingDate-1; i >= 0; i--){
            if(ansList.get(i) == 0) break;
            ans++;
        }
        
        return ans + (countingDate == ans ? calcCommitCombo(user, (year-1)+"-01-01", (year-1)+"-12-31", false) : 0);
    }
    
    
    
}
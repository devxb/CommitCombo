package aboutuser;

import java.util.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;

public class HTMLParser{
    
    public int getCommitCombo(String user, boolean recursion){
        return calcCommitCombo(user, GetDate.getYear()+"-01-01", GetDate.getNowDate(), true, recursion);
    }
    
    private int calcCommitCombo(String user, String fromDate, String toDate, boolean trig, boolean recursion){
        int[] daysOfMonth = GetDate.getDaysOfMonth();
        int ans = 0;
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        try{
            
            String targetURL = "https://github.com/"+user+"?tab=overview&from=" + fromDate + "&to=" + toDate;
            
            URL url = new URL(targetURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection(); 
            if(user == "" || con.getResponseCode() == 404) return -1;
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String line = null;
            while((line = br.readLine()) != null){
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
        
        if(trig == true) countingDate--; // 하루전 까지만 계산 
        
        for(int i = countingDate-1; i >= 0; i--){
            if(ansList.get(i) == 0) break;
            ans++;
        }
        if(recursion == false){ // 재귀가 비허용일시 바로 종료
            return ans;
        }
        return ans + (countingDate == ans ? calcCommitCombo(user, (year-1)+"-01-01", (year-1)+"-12-31", false, recursion) : 0); // 만약 1년동안 커밋했다면, 전년도 확인함
    }
    
}
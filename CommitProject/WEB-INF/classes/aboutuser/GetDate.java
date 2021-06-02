package aboutuser;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.net.*;
import aboutuser.HTMLParser;

public class GetDate{
    
    public static int[] getDaysOfMonth(){
        int[] daysOfMonth = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysOfMonth;
    }
    
    public static String getYear(){
        SimpleDateFormat y = new SimpleDateFormat("yyyy");
        return y.format(new Date());
    }
    
    public static String getMonth(){
        SimpleDateFormat m = new SimpleDateFormat("MM");
        return m.format(new Date());
    }
    
    public static String getDay(){
        SimpleDateFormat d = new SimpleDateFormat("dd");
        return d.format(new Date());
    }
    
    public static String getNowDate(){
        return getYear()+"-"+getMonth()+"-"+getDay();
    }
    
    
    public static String getYear(String Date){
        return Date.substring(0,4);
    }
    
    
    public static String getMonth(String Date){
        return Date.substring(5,7);
    }
    
    
    public static String getDay(String Date){
        return Date.substring(8,10);
    }
    
    public static int getDiffCommitDay(String username, String prevDay, int prevCommitCombo){ // 두 시간사이의 차이를 구함
        
        int[] daysOfMonth = getDaysOfMonth();
        
        int continuousCommitCount = -1; // 01/01월 부터 연속으로 커밋한경우 체크해줌 , 하루전까지 계산하기위해 -1해줌
        
        // 이전 시간 계산
        int previousDateCount = -1;
        previousDateCount += Integer.parseInt(getYear(prevDay))*365;
        for(int i = 1; i < Integer.parseInt(getMonth(prevDay)); i++){
            previousDateCount += daysOfMonth[i];
            continuousCommitCount += daysOfMonth[i];
        }
        previousDateCount+= Integer.parseInt(getDay(prevDay));
        continuousCommitCount += Integer.parseInt(getDay(prevDay));
        // 이전 시간 계산 종료
        
        // 현재 시간 계산
        int nowDateCount = -1;
        nowDateCount += Integer.parseInt(getYear())*365;
        for(int i = 1; i < Integer.parseInt(getMonth()); i++){
            nowDateCount += daysOfMonth[i];
        }
        nowDateCount+= Integer.parseInt(getDay());
        // 현재 시간 계산 종료
        
        int differenceDateCount = nowDateCount - previousDateCount; // 현재시간과 이전시간의 차이를 구함
        
        HTMLParser htmlParser = new HTMLParser();
        int nowCommitCount = htmlParser.getCommitCombo(username, false); // 현재 커밋콤보 계산
        System.out.println(username + " : " + prevDay + " / "+ getNowDate() + " 1년간 연속으로 커밋했을시 커밋콤보 : " + continuousCommitCount + ", 현재 커밋 콤보 : " + nowCommitCount + ", 두 날짜 차이 : " + differenceDateCount);
        System.out.println("이전까지 저장되어있던 커밋콤보 : " + prevCommitCombo);
        
        // 만약 1년동안 하루도 쉬지않고 커밋한경우
        if(continuousCommitCount <= nowCommitCount && 
        continuousCommitCount+differenceDateCount == nowCommitCount) return prevCommitCombo + differenceDateCount; // 1년동안 연속으로 커밋한 경우 체크
        
        return nowCommitCount; // 끊긴다면 현재 커밋콤보 리턴
    }
    
}
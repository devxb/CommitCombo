package aboutuser;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.net.*;

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
    
    public static String getOneYearsAgo(String date){
        int nextDate = Integer.parseInt(date.substring(0,4));
        nextDate--;
        date = Integer.toString(nextDate)+date.substring(4,date.length());
        return date;
    }
    
    public static int dateOptimizer(String date){
        String retString = "";
        for(int i = 2; i < date.length(); i++){
            if(date.charAt(i) == '-') continue;
            retString += date.charAt(i);
        }
        return Integer.parseInt(retString);
    }
    
}
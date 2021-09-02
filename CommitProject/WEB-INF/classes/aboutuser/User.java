package aboutuser;

import java.sql.*;
import aboutDB.*;

public class User{ // User정보 총괄 클래스
    
    private String username;
    private String defaultFontSize = "15px";
    private int contributionCount;
    private String contributionStartDate;
    private String contributionEndDate;
    private int rank = -1;
    private String trophyColor;
    
    public User(String username){
        this.username = username;
        defaultSet();
    }
    
    public void defaultSet(){ 
        // 기본 셋팅
        try{
            Table users = new Users();
            ResultSet rs = users.selectTable(this.username);
            if(!rs.next()){ // DB처음 등록하는 사람 이라면
                if(!users.insertTable(this.username)) return;
                this.setRank(); // 랭크 지정 (하루에 한번 업데이트)
                rs = users.selectTable(this.username);
                rs.next();
            }
            if(!GetDate.getNowDate().equals(rs.getString("contributionEndDate"))){ // 마지막 업데이트부터 하루 이상 지난경우
                users.insertTable(this.username);
                this.setRank(); // 랭크 지정 (하루에 한번 업데이트)
                rs = users.selectTable(this.username);
                rs.next();
            }
            this.contributionCount = rs.getInt("contributionCount");
            this.contributionStartDate = rs.getString("contributionStartDate");
            this.contributionEndDate = rs.getString("contributionEndDate");
            this.rank = rs.getInt("rank");
            this.trophyColor = setTrophyColor(this.contributionCount);
            rs.close();
        } catch (SQLException SQLE){
            SQLE.printStackTrace();
        }
    }
    
    private void setRank(){
        try{
            Table users = new Users();
            ResultSet rs = users.selectTable();
            int totalUserCnt = 0;
            int userRank = -1;
            while(rs.next()){
                totalUserCnt++;
                String userName = rs.getString("username");
                if(userName.equals(this.username)) userRank = totalUserCnt;
            }
            users.updateTable("rank", userRank, username);
            rs.close();
        } catch (SQLException SQLE){
            SQLE.printStackTrace();
        }
    }
    
    /* (]
        상위 1%~5% : red
        상위 6%~15% : dia
        상위 16%~35% : platinum
        상위 31%~50% : gold
        상위 51%~75% : silver;
    */
    
    /*
        red : 5 (5)
        dia : 10 (15)
        platinum : 20 (35)
        gold : 35 (70)
        silver : 25 (95)
        bronze : 5 (100)
    */
        
    private String setTrophyColor(int contributionCount){
        if(contributionCount <= 0) return "#302F2F";
        if(contributionCount <= 15) return "#8C4325";
        if(contributionCount <= 75) return "#C2CEE0";
        if(contributionCount <= 250) return "#FFBC50";
        if(contributionCount <= 700) return "#05EBB9";
        if(contributionCount <= 987654321) return "#7BBEFF";
        return "#302F2F"; // 오류 (검은색)
    }
    
    public int getRank(){
        return this.rank;
    }
    
    public String getTrophyColor(){
        return this.trophyColor;
    }
    
    public int getContributionCount(){
        return this.contributionCount;
    }
    
    public double getFontSize(String username){
        //if(username.length() >= 10) return 0.6800;
        if(username.length() > 7) return 0.8125;
        return 0.9375; // default : 16px
    }
    
    private double transEmToPx(double em){
        return (16*em)-3;
    }
    
    public double getDragLength(String username){
        int[] Alph = {11, 9, 10, 10, 9, 8, 11, 10, 3, 8, 10, 8, 11, 10, 11, 10, 11, 9, 9, 10, 10, 9, 14, 9, 10, 9};
        int[] alph = {8, 9, 8, 9, 8, 7, 9, 9, 3, 3, 9, 4, 13, 9, 9, 9, 9, 7, 8, 6, 9, 10, 13, 8, 9, 7};
        int[] numb = {8, 7, 9, 8, 9, 9, 9, 8, 8, 9};
        double ans = 0;
        double em = getFontSize(username);
        for(int i = 0; i < username.length(); i++){
            if((int)username.charAt(i) >= (int)'a' && (int)username.charAt(i) <= (int)'z') ans += alph[(int)username.charAt(i)-(int)'a']*em;
            else if((int)username.charAt(i) >= (int)'0' && (int)username.charAt(i) <= (int)'9') ans += numb[(int)username.charAt(i)-(int)'0']*em;
            else if((int)username.charAt(i) >= (int)'A' && (int)username.charAt(i) <= 'Z') ans += Alph[(int)username.charAt(i)-(int)'A']*em;
            else ans += 10*em;
            ans += 1; // jump 1px;
        }
        ans = ans-79;
        if(ans <= 0) return 0;
        return -1*ans;
    }
    
}
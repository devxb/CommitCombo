/*

main controller

*/

package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import commitcombo.*;
import aboutuser.*;
import aboutDB.*;

public class Controller extends HttpServlet{
    
    private String mappingLowerCase(String username){
        String ret = "";
        for(int i = 0; i < username.length(); i++){
            if((int)username.charAt(i) >= (int)'A' && (int)username.charAt(i) <= (int)'Z'){ // if uppderCase
                ret += (char)((int)username.charAt(i)+32);
                continue;
            }
            ret += username.charAt(i);
        }
        return ret;
    }
    
    public void setResponse(HttpServletResponse response){
        response.setHeader("Cache-Control","no-cahce");
        response.addHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cahce");
        response.setDateHeader("Expires",0);
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        // do get
        
        // 정의
        String theme = "BasicWhite-mini";
        String username = "nonamed";
        String animationController = "false";
        String rank = "YES";
        int comboCnt = -1;
        // END-정의
        
        // camo cache-control
        setResponse(response);
        // END-camo cahche-control
        
        // 변수 대입
        animationController = request.getParameter("animation");
        theme = request.getParameter("theme");
        if(theme == null) theme = "RoyalRed-mini-v2";
        rank = request.getParameter("rank");
        if(rank == null) rank = "able";
        username = request.getParameter("user");
        ThemeFactory themeFactory = new ThemeFactory();
        Theme userTheme = themeFactory.getTheme(theme);
        UserContribution userContribution = new UserContribution();
        // END-변수 대입

        // set username, contributionCount, contributionStartDate, contributionEndDate
        User user = new User(mappingLowerCase(username));
        comboCnt = user.getContributionCount();
        // END-username, contributionCount, contributionStartDate, contributionEndDate
        
        
        // display set
        request.setAttribute("userNameSize",user.getFontSize(username)+"em");
        request.setAttribute("nameTag",username); // setting user-name
        request.setAttribute("comboCnt",comboCnt); // setting combocount
        request.setAttribute("dragLength",user.getDragLength(username));
        // END-display set
        
        // theme-set
        request.setAttribute("nameTagFill", userTheme.getNameTagColor()); // setting username color
        request.setAttribute("commitComboFill", userTheme.getCommitComboColor()); // setting "commit combo" color
        request.setAttribute("comboCntFill", userTheme.getComboCntColor()); // setting combo count color
        request.setAttribute("backgroundFill", userTheme.getBackgroundColor()); // setting backgroundcolor
        request.setAttribute("gradient", userTheme.getGradient());
        request.setAttribute("comboBoxFill", userTheme.getComboBoxColor()); // setting combobox color
        // End-theme set
        
        // Extra animation
        if(animationController != null && animationController.equals("false")){
            request.setAttribute("animationController","false");
        }
        else{
            request.setAttribute("animationController","dragUsername");
        }
        request.setAttribute("extraAnimation", userTheme.getExtraAnimation()); // setting extra animation
        // END-Extra animation
        
        // 더이상 지원하지않는 테마 - 이용자가 있어서 냅둠
        /*
        if(theme.contains("calendar")){ // option - calendar theme
            // calendar theme need font-size
            if(comboCnt > 999) request.setAttribute("fontSize","3em");
            else request.setAttribute("fontSize","4.375em");
            //if(username.length() >= 14) request.setAttribute("nameTag", username.substring(0,11)+"..."); // maximum display name = 14
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calendartheme");
            requestDispatcher.forward(request, response);
        }
        */
        
        // Select View
        ThemeInterface selectedTheme = selectTheme(request, response, theme, rank, user);
        selectedTheme.defaultSetting(comboCnt);
        selectedTheme.getTheme();
        // END-Select View
    }
    
    public ThemeInterface selectTheme(HttpServletRequest request, HttpServletResponse response, String theme, String rank, User user){
        if(theme.contains("mini-v2")){
            if(!rank.equals("disable")) return new ThemeWithRank(new MiniThemeV2(request, response), user);
            return new MiniThemeV2(request, response);
        }
        if(theme.contains("mini")){
            if(!rank.equals("disable")) return new ThemeWithRank(new MiniTheme(request, response), user);
            return new MiniTheme(request, response);
        }
        return new ThemeWithRank(new MiniTheme(request, response), user);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        // do post
    }
    
}
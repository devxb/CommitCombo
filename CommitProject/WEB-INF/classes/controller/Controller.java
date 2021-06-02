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
import storage.*;

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
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        // do get
        
        // definition
        String theme = "BasicDark-mini";
        String username = "nonamed";
        String animationController = "false";
        int comboCnt = -1;
        // END-definition
        
        // camo cache-control
        response.setHeader("Cache-Control","no-cahce");
        response.addHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cahce");
        response.setDateHeader("Expires",0);
        // END-camo cahche-control
        
        // logic
        animationController = request.getParameter("animation");
        theme = request.getParameter("theme");
        if(theme == null) theme = "RoyalRed-mini-v2";
        username = request.getParameter("user");
        ThemeFactory themeFactory = new ThemeFactory();
        Theme userTheme = themeFactory.getTheme(theme);
        HTMLParser htmlParser = new HTMLParser();
        // END-logic

        // storage
        // 중요 ! 캐시,쿠키 대신 사용할 용도로급한대로 임시로 만든 저장소임 ! 나중에 DB로 바꿀것
        
        String lowerCaseUserName = mappingLowerCase(username);
        String debugname = "";
        StorageList storageList = StorageList.getInstaceOfStorageList();
        ArrayList<Storage> userList = storageList.getUserList();
        boolean existUser = false;
        for(int i = 0; i < userList.size(); i++){
            debugname += userList.get(i).getUserName();
            if(userList.get(i).getUserName().equals(lowerCaseUserName)){
                existUser = true;
                comboCnt = userList.get(i).getUserCommitCnt();
                break;
            }
        }
        if(!existUser){
            Storage user = new StorageUser(lowerCaseUserName, htmlParser.getCommitCombo(lowerCaseUserName, true),GetDate.getNowDate());
            storageList.addStorage(user);
            comboCnt = user.getUserCommitCnt();
        }
        // END-storage

        // set username
        User user = new User(username);
        // END-username
        
        
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
        
        // Select View
        if(theme.contains("mini-v2")){
            request.setAttribute("fontSize","2.1875em");
            if(comboCnt > 99) request.setAttribute("fontSize","1.875em");
            if(comboCnt > 999) request.setAttribute("fontSize","1.4625em");
            //if(username.length() >= 12) request.setAttribute("nameTag", username.substring(0,9)+"..."); // maximum display name = 12
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/minitheme-v2");
            requestDispatcher.forward(request, response);
        }
        else if(theme.contains("mini")){ // option - mini theme 
            request.setAttribute("fontSize","1.688em");
            if(comboCnt > 999) request.setAttribute("fontSize","1.3625em");
            //if(username.length() >= 12) request.setAttribute("nameTag", username.substring(0,9)+"..."); // maximum display name = 12
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/minitheme");
            requestDispatcher.forward(request, response);
        }
        else if(theme.contains("calendar")){ // option - calendar theme
            // calendar theme need font-size
            if(comboCnt > 999) request.setAttribute("fontSize","3em");
            else request.setAttribute("fontSize","4.375em");
            //if(username.length() >= 14) request.setAttribute("nameTag", username.substring(0,11)+"..."); // maximum display name = 14
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calendartheme");
            requestDispatcher.forward(request, response);
        }
        // END-Select View
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        // do post
    }
    
}
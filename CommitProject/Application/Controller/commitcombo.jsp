<!-- 

    Controller!

-->

<%@ page language="java" contentType="image/svg+xml; charset=utf-8" pageEncoding = "utf-8"%>
<%@ page import="commitcombo.*" %>
<%@ page import="aboutuser.*" %>

<% 
    //server
    
    String theme = "BasicDark-mini";
    String username = "nonamed";
    String animationController = "false";
    long comboCnt;
    
    // camo cache-control
    response.setHeader("Cache-Control","no-cache");
    response.addHeader("Cache-Control","no-store");
    response.setHeader("Pragma","no-cahce");
    response.setDateHeader("Expires",0);
    // camo
    
    animationController = request.getParameter("animation");
    
    theme = request.getParameter("theme");
    if(theme == null) theme = "MintChocolate-mini"; // theme null
    username = request.getParameter("user");
    ThemeFactory themeFactory = new ThemeFactory();
    Theme userTheme = themeFactory.getTheme(theme);
    
    if(username == null) username = "nonamed"; // username null
    if(session.getAttribute(username) == null){ // check and make session
        //To avoid burdening GitHub server!
        session.setAttribute(username, HTMLParser.getCommitCombo(username));
        session.setAttribute(username+"-timeout", System.currentTimeMillis());
    }
    comboCnt = (Integer)session.getAttribute(username);
    User user = new User(username);
    
    // delete session after 3hour
    if((System.currentTimeMillis() - (Long)session.getAttribute(username+"-timeout"))/1000 >= 60*(60*3)) session.invalidate();

    // start display set
    request.setAttribute("userNameSize",user.getFontSize(username)+"em");
    request.setAttribute("nameTag",username); // setting user-name
    request.setAttribute("comboCnt",comboCnt); // setting combocount
    request.setAttribute("dragLength",user.getDragLength(username));
    // end display set
    
    // start color set 
    request.setAttribute("nameTagFill", userTheme.getNameTagColor()); // setting username color
    request.setAttribute("commitComboFill", userTheme.getCommitComboColor()); // setting "commit combo" color
    request.setAttribute("comboCntFill", userTheme.getComboCntColor()); // setting combo count color
    request.setAttribute("backgroundFill", userTheme.getBackgroundColor()); // setting backgroundcolor
    request.setAttribute("gradient", userTheme.getGradient());
    request.setAttribute("comboBoxFill", userTheme.getComboBoxColor()); // setting combobox color
    // end color set
    
    //set animation
    if(animationController != null && animationController.equals("false")){
        request.setAttribute("animationController","false");
    }
    else{
        request.setAttribute("animationController","dragUsername");
    }
    //end animation
    
    // start extra animaiton
    request.setAttribute("extraAnimation", userTheme.getExtraAnimation()); // setting extra animation
    // end extra animation
    if(theme.contains("mini-v2")){
        request.setAttribute("fontSize","2.1875em");
        if(comboCnt > 99) request.setAttribute("fontSize","1.875em");
        if(comboCnt > 999) request.setAttribute("fontSize","1.4625em");
        //if(username.length() >= 12) request.setAttribute("nameTag", username.substring(0,9)+"..."); // maximum display name = 12
        pageContext.forward("minitheme-v2");
    }
    else if(theme.contains("mini")){ // option - mini theme 
        request.setAttribute("fontSize","1.688em");
        if(comboCnt > 999) request.setAttribute("fontSize","1.3625em");
        //if(username.length() >= 12) request.setAttribute("nameTag", username.substring(0,9)+"..."); // maximum display name = 12
        pageContext.forward("minitheme");
    }
    else if(theme.contains("calendar")){ // option - calendar theme
        // calendar theme need font-size
        if(comboCnt > 999) request.setAttribute("fontSize","3em");
        else request.setAttribute("fontSize","4.375em");
        //if(username.length() >= 14) request.setAttribute("nameTag", username.substring(0,11)+"..."); // maximum display name = 14
        
        pageContext.forward("calendartheme");
    }
%>

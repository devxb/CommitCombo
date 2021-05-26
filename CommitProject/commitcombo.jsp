<!-- 

    Controller!

-->

<%@ page language="java" contentType="image/svg+xml; charset=utf-8" pageEncoding = "utf-8"%>
<%@ page import="commitcombo.*" %>
<%@ page import="aboutuser.*" %>
<%! 
    String theme = "BasicDark-mini";
    String username = "nonamed";
    long comboCnt;
%>

<% 
    //server
    
    // camo cache-control
    response.setHeader("Cache-Control","no-cache");
    response.addHeader("Cache-Control","no-store");
    response.setHeader("Pragma","no-cahce");
    response.setDateHeader("Expires",0);
    // camo
    
    theme = request.getParameter("theme");
    username = request.getParameter("user");
    Theme userTheme = ThemeFactory.getTheme(theme);
    
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
    request.setAttribute("userNameSize",user.getFontSize(username));
    request.setAttribute("nameTag",username); // setting user-name
    request.setAttribute("comboCnt",comboCnt); // setting combocount
    // end display set
    
    // start color set 
    request.setAttribute("nameTagFill", userTheme.getNameTagColor()); // setting username color
    request.setAttribute("commitComboFill", userTheme.getCommitComboColor()); // setting "commit combo" color
    request.setAttribute("comboCntFill", userTheme.getComboCntColor()); // setting combo count color
    request.setAttribute("backgroundFill", userTheme.getBackgroundColor()); // setting backgroundcolor
    request.setAttribute("gradient", userTheme.getGradient());
    request.setAttribute("comboBoxFill", userTheme.getComboBoxColor()); // setting combobox color
    // end color set
    
    // start extra animaiton
    request.setAttribute("extraAnimation", userTheme.getExtraAnimation()); // setting extra animation
    // end extra animation
    
    if(theme == null || theme.contains("mini")){ // theme null
        if(comboCnt > 999) request.setAttribute("comboCnt",999);
        pageContext.forward("minitheme");
    }
    else if(theme.contains("calendar")){
        // calendar theme need font-size
        if(comboCnt > 999) request.setAttribute("fontSize","3em");
        else request.setAttribute("fontSize","4.375em");
        
        pageContext.forward("calendartheme");
    }
%>

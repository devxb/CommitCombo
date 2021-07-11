package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import aboutuser.User;

public class ThemeWithRank implements ThemeInterface{
    
    private String themeName = "themeWithRank.jsp";
    private int rankSheetWidth, rankSheetHeight;
    private ThemeInterface dependentTheme;
    private User user;
    private HttpServletRequest request;
    private HttpServletResponse response;
    
    public ThemeWithRank(ThemeInterface dependentTheme, User user){
        this.dependentTheme = dependentTheme;
        this.response = dependentTheme.getResponse();
        this.request = dependentTheme.getRequest();
        this.rankSheetHeight = 104;
        this.rankSheetWidth = 161;
        this.user = user;
    }
    
    @Override
    public String getThemeName(){
        return this.themeName;
    }
    
    @Override
    public void defaultSetting(int comboCnt){
        dependentTheme.setMargin();
        dependentTheme.defaultSetting(comboCnt);
        request.setAttribute("dependentThemeName", this.dependentTheme.getThemeName());
        request.setAttribute("rankSheetHeight", this.rankSheetHeight);
        request.setAttribute("rankSheetWidth", this.rankSheetWidth);
        request.setAttribute("userRank", this.user.getRank());
        request.setAttribute("trophyColor", this.user.getTrophyColor());
    }
    
    @Override
    public void getTheme() throws ServletException, IOException{
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/themeWithRank");
        requestDispatcher.forward(request, response);
    }
    
    @Override
    public void setMargin(){
        return;
    }
    
    @Override
    public HttpServletRequest getRequest(){
        return this.request;
    }
    
    @Override
    public HttpServletResponse getResponse(){
        return this.response;
    }
    
}
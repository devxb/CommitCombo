package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public interface ThemeInterface{
    
    public HttpServletRequest getRequest();
    public HttpServletResponse getResponse();
    public String getThemeName();
    public void getTheme() throws ServletException, IOException;
    public void defaultSetting(int comboCnt);
    public void setMargin();
    
}
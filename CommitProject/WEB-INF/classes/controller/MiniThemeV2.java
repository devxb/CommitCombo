package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MiniThemeV2 implements ThemeInterface{
    
    private String themeName = "minithemeV2.jsp";
    private int nameTagY, nameTagX, width, height, nameTagWidth, comboCntMarginLeft, comboCntMarginTop;
    private int commitComboMarginLeft, commitComboMarginTop, marginTop, marginLeft;
    private HttpServletRequest request;
    private HttpServletResponse response;
    
    public MiniThemeV2(HttpServletRequest request, HttpServletResponse response){
        this.nameTagY = 27;
        this.nameTagX = 0;
        this.nameTagWidth = 79;
        this.width = 153;
        this.height = 67;
        this.comboCntMarginLeft = 120;
        this.comboCntMarginTop = 35;
        this.commitComboMarginLeft = 11;
        this.commitComboMarginTop = 43;
        this.request = request;
        this.response = response;
    }
    
    public String getThemeName(){
        return this.themeName;
    }
    
    @Override
    public void setMargin(){
        int marginTop = 4;
        int marginLeft = 4;
        this.marginLeft = marginLeft;
        this.marginTop = marginTop;
        nameTagY += marginTop;
        nameTagX += marginLeft;
        nameTagWidth += marginLeft;
        width += marginLeft;
        height += marginTop;
        comboCntMarginLeft += marginLeft;
        comboCntMarginTop += marginTop;
        commitComboMarginLeft += marginLeft;
        commitComboMarginTop += marginTop;
    }
    
    @Override
    public void defaultSetting(int comboCnt){ // 기본셋팅
        request.setAttribute("nameTagY", nameTagY);
        request.setAttribute("nameTagX", nameTagX);
        request.setAttribute("miniThemeV2Width", width);
        request.setAttribute("miniThemeV2Height", height);
        request.setAttribute("nameTagHeight", height);
        request.setAttribute("nameTagWidth", nameTagWidth);
        request.setAttribute("comboCntMarginLeft", comboCntMarginLeft);
        request.setAttribute("comboCntMarginTop", comboCntMarginTop);
        request.setAttribute("commitComboMarginTop", commitComboMarginTop);
        request.setAttribute("commitComboMarginLeft", commitComboMarginLeft);
        request.setAttribute("marginLeft", marginLeft);
        request.setAttribute("marginTop", marginTop);
        request.setAttribute("fontSize","2.1875em");
        if(comboCnt > 99) request.setAttribute("fontSize","1.875em");
        if(comboCnt > 999) request.setAttribute("fontSize","1.2625em");
        //if(username.length() >= 12) request.setAttribute("nameTag", username.substring(0,9)+"..."); // maximum display name = 12
    }
    
    @Override
    public void getTheme() throws ServletException, IOException{
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/minitheme-v2");
        requestDispatcher.forward(request, response);
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
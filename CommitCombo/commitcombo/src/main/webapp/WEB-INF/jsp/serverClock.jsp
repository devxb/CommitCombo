<%@ page language="java" contentType="image/svg+xml; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%
    
    response.setHeader("Cache-Control","no-cache");
    response.addHeader("Cache-Control","no-store");
    response.setHeader("Pragma","no-cahce");
    response.setDateHeader("Expires",0);
    
    Date date = new Date();
    SimpleDateFormat monthAndDays= new SimpleDateFormat("MM/dd");
    SimpleDateFormat hms = new SimpleDateFormat("hh : mm : ss");
    pageContext.setAttribute("monthDays",monthAndDays.format(date));
    pageContext.setAttribute("time",hms.format(date));
%>

<svg width="254" height="110" viewBox="0 0 254 110" fill="none" xmlns="http://www.w3.org/2000/svg">

<style>
    <![CDATA[
        @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=block');
        
        text{
            fill : url(#sunset);
            font-family : 'Noto Sans KR', sans-serif;
        }
        
    ]]>
</style>
<defs>
<linearGradient id="sunset" gradientTransform="rotate(5)">
<stop offset="0%" stop-color="#1488CC"/>
<stop offset="100%" stop-color="#2B32B2"/>
</linearGradient>
</defs>
<g transform="translate(127, 10)"><text text-anchor="middle" dominant-baseline="middle" font-weight="400" font-size="13px"> Server Date </text></g>
<g transform="translate(127, 35)"><text text-anchor="middle" dominant-baseline="middle" font-weight="500" font-size="20px"> ${monthDays} </text></g>
<g transform="translate(127, 70)"><text text-anchor="middle" dominant-baseline="middle" font-weight="700" font-size="35px"> ${time} </text> </g>
</svg>
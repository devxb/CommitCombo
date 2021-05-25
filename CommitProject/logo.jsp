<%@ page language = "java" contentType="image/svg+xml; charset=utf-8" pageEncoding="utf-8"%>

<svg width="796" height="110" viewBox="0 0 796 110" fill="none" xmlns="http://www.w3.org/2000/svg">
    <%
        response.setHeader("Cache-Control","no-cache");
        response.addHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cahce");
        response.setDateHeader("Expires",0);
    %>
    <style>
    <![CDATA[
        @import url('https://fonts.googleapis.com/css2?family=Sarala:wght@400;700&display=swap');
     
        text{
            font-family : 'Sarala', sans-serif;
            font-weight : 400;
            font-size : 110px;
            fill : url(#Gradient);
            stroke: url(#Gradient);
            stroke-width : 3px;
            stroke-dasharray : 100%;
            animation : logoAnimation 4s ease-in-out;
        }
        
        @keyframes logoAnimation{
            0% {
                fill-opacity: 0;
                stroke-dashoffset : 100%;
            } 
            65%{
                fill : url(#Gradient);
                fill-opacity: 0;
            }
            100% {
                stroke-dashoffset : 0%;
                fill : url(#Gradient);
                fill-opacity: 1;
            }
        }
    ]]>
    </style>
    
    <defs>
        <linearGradient xmlns="http://www.w3.org/2000/svg" id="Gradient">
            <stop offset="0%" stop-color="#FFBC50"/> 
            <stop offset="100%" stop-color="#AA31BD"/> 
        </linearGradient>
    </defs>
    <g transform="translate(0,0)">
    <text text-align="center" dominant-baseline="Hanging">Commit Combo</text>
    </g>
</svg>
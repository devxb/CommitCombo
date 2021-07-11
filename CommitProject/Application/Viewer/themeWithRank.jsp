<%@ page language="java" contentType="image/svg+xml; charset=UTF-8" pageEncoding="UTF-8"%>

<svg width="${rankSheetWidth}" height="${rankSheetHeight}" viewBox="0 0 ${rankSheetWidth} ${rankSheetHeight}" fill="none" xmlns="http://www.w3.org/2000/svg">
    
    <style>
        <![CDATA[
            @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap');
        ]]>
    </style>
    
    <rect width="${rankSheetWidth}" height="${rankSheetHeight}" rx="5" fill="${backgroundFill}" fill-opacity="0.5"/>
        
        <jsp:include page="Application/Viewer/${dependentThemeName}"/> 
        <%@ include file="trophy.jsp" %>
        <%@ include file="rankTag.jsp" %>
        
</svg>

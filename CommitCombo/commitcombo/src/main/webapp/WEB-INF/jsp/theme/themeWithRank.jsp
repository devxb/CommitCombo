<%@ page language="java" contentType="image/svg+xml; charset=UTF-8" pageEncoding="UTF-8"%>

<svg width="161" height="104" viewBox="0 0 161 104" fill="none" xmlns="http://www.w3.org/2000/svg">

    <style>
        <![CDATA[
            @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap');
        ]]>
    </style>
    
    <rect width="161" height="104" rx="5" fill="${viewMapper.getBackgroundColor()}" fill-opacity="0.5"/>
        
        <jsp:include page="${viewMapper.getThemeCategory()}"/> 
        <%@ include file="trophy.jsp" %>
        <%@ include file="rankTag.jsp" %>
        
</svg>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE.html>
<html>
    <head>
        <title> complete </title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;700&family=Sarala:wght@700&display=swap');
            
            @keyframes fadeInAnimation{
                from{
                    opacity: 0;
                }to{
                    opacity: 1;
                }
            }
            
            @keyframes delayfadeInAnimation{
                0%{
                    opacity : 0;
                }
                80%{
                    opacity : 0;
                }
                100%{
                    opacity : 1;
                }
            }
            
            
            .divStyle{
                position: absolute;
                background-color : rgb(0,0,0,0);
                top : 50%;
                left : 50%;
                margin-left : -25%;
                margin-top : -160px;
                width : 50%;
                height : auto;
                align : center;
                text-align : center;
            }
            
            .textGradient{
                font-family : 'Roboto', sans-serif;
                font-weight : 700;
                background : linear-gradient(0.25turn, #FFBC50, #AA31BD);
                animation: fadeInAnimation 1s ease-in-out;
            }
            
            .userURL{
                font-family : 'Roboto', sans-serif;
                font-weight : 400;
                animation: delayfadeInAnimation 1s ease-in-out;
            }
        </style>
    </head>

    <body style = "margin:0%; background-color:#0D1117">
        <% 
            String name = (String)request.getParameter("user");
            String theme = (String)request.getParameter("theme");
            
            pageContext.setAttribute("username",name);
            pageContext.setAttribute("theme",theme);
        %>
        <div class = "divStyle">
            <h2 class = "textGradient" style = "color:white"> Copy and Paste the link below to your GitHub!  </h2>
            <h3 class = "userURL" style = "color:white"> [![commit combo](http://commitcombo.com/get?user=${username}&theme=${theme})](https://github.com/devxb/commitcombo) </h3>
            <object data = "./get?user=${username}&theme=${theme}"> </object>
        </div>
    </body>
</html>
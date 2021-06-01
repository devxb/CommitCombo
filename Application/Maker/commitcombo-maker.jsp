<%@page language = "java" contentType="text/html; charset = utf-8" pageEncoding="utf-8"%>

<!DOCTYPE.html>

<html>
    <head>
        <title> commitcombo-maker </title>
        <style>
            
            @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;700&family=Sarala:wght@700&display=swap');
        
            @keyframes fadeInAnimation{
                from {
                    opacity: 0;
                }
                to {
                    opacity: 1;
                }
            }
            
            .nameTag{
                position:absolute;
                top:43%;
                left:50%;
                margin-top:-40px;
                margin-left:-100px;
            }
            
            .themeButton{
                position:absolute;
                top:43%;
                left:50%;
                margin-top:5px;
                margin-left:-100px;
            }
            
            .font{
                font-family : "Roboto", sans-serif;
                font-weight : 400;
                font-size : 18px;
            }
            
            .inputStyle{
                background-color : rgb(0,0,0,0);
                border-image : repeating-linear-gradient(0.25turn, #FFBC50, #AA31BD) 10;
                outline-style: none;
                font-size : 15px;
                color : #C9CBC5;
                text-align: center; 
                width : 200px;
                height : 40px;
                
                animation: fadeInAnimation 1s ease-in-out;
            }
            
            .buttonStyle{
                background : linear-gradient(0.25turn, #FFBC50, #AA31BD);
                border : transparent;
                cursor: pointer;
                width : 200px;
                height : 45px;
                font-family: "Roboto", sans-serif;
                color: #FFFFFF;
                font-size: 15px;
                font-weight: 700;
                
                animation: fadeInAnimation 1s ease-in-out;
            }
            
        </style>
    </head>
    
    <body style="background-color:#0D1117; margin:0%">
        <div align="center" style="position:absolute; left: 50%; margin-left: -392px;"> 
            <!--<img src="./projectCC/logo/Commit-Combo-small.svg"/>-->
            <img src="./Application/Maker/logo/Commit-Combo.svg"/>
        </div>
        <div style="padding-top:1%;">
        
            <form method="post" action="./selecttheme"> 
                <div align="center" class="nameTag"><input type="text" name="username" class="inputStyle" placeholder="type github name"/> </div>
                <div align="center" class="themeButton"><input type="submit" name="chooseTheme" value="ChooseTheme" class="buttonStyle"/> </div>
            </form>
            
        </div>
    </body>
    
</html>
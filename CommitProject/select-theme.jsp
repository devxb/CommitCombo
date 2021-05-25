<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE.html>

<html>
    <head>
        <title> commitcombo-maker </title>
        <style>

            @keyframes fadeInAnimation{
                from{
                    opacity:0;
                }to{
                    opacity:1;
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

            .divtheme{
                position:absolute;
                background-color : rgb(255,255,255,0);
                /*border-style:solid;*/
                /*border-image : repeating-linear-gradient(0.25turn, #FFBC50, #AA31BD) 10;*/
                text-align: center;
                vertical-align: center;
                /*animation : delayfadeInAnimation 1s ease-in-out;*/
            }
            
        </style>
    </head>
    <body style="margin:0%; background-color:#0D1117">

    <%
        String name = (String)request.getParameter("username");
        if(name.equals(null) || name.equals("")){
            response.sendRedirect("/maker");
        }
        pageContext.setAttribute("username",name);
    %>

        <div class = "divtheme">
         <img src = "./projectCC/logo/Choose-your-theme.svg" style="animation: fadeInAnimation 1s ease-in-out"> <br> <br> <br> <br> <br> <br> <br> <br>
            <a href = "./displayURL?user=${username}&theme=BasicWhite-mini"> <img src = "./get?user=${username}&theme=BasicWhite-mini"></img></a>
            <a href = "./displayURL?user=${username}&theme=BasicDark-mini"> <img src = "./get?user=${username}&theme=BasicDark-mini"></a>
            <a href = "./displayURL?user=${username}&theme=BasicGray-mini"> <img src = "./get?user=${username}&theme=BasicGray-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Mocha-mini"> <img src = "./get?user=${username}&theme=Mocha-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Grape-mini"> <img src = "./get?user=${username}&theme=Grape-mini"></a>
            <a href = "./displayURL?user=${username}&theme=MintChocolate-mini"> <img src = "./get?user=${username}&theme=MintChocolate-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Orange-mini"> <img src = "./get?user=${username}&theme=Orange-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Abocado-mini"> <img src = "./get?user=${username}&theme=Abocado-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Perfume-mini"> <img src = "./get?user=${username}&theme=Perfume-mini"></a>
            <a href = "./displayURL?user=${username}&theme=CottonCandy-mini"> <img src = "./get?user=${username}&theme=CottonCandy-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Grass-mini"> <img src = "./get?user=${username}&theme=Grass-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Peach-mini"> <img src = "./get?user=${username}&theme=Peach-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Indigo-mini"> <img src = "./get?user=${username}&theme=Indigo-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Sunset-mini"> <img src = "./get?user=${username}&theme=Sunset-mini"></a>
            <br><br>
            
            <!--
            Not pretty
            <a href = "./displayURL?user=${username}&theme=BasicWhite-calendar"> <img src = "./get?user=${username}&theme=BasicWhite-calendar"></img></a>
            <a href = "./displayURL?user=${username}&theme=BasicDark-calendar"> <img src = "./get?user=${username}&theme=BasicDark-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=BasicGray-calendar"> <img src = "./get?user=${username}&theme=BasicGray-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Mocha-calendar"> <img src = "./get?user=${username}&theme=Mocha-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Grape-calendar"> <img src = "./get?user=${username}&theme=Grape-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=MintChocolate-calendar"> <img src = "./get?user=${username}&theme=MintChocolate-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Orange-calendar"> <img src = "./get?user=${username}&theme=Orange-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Abocado-calendar"> <img src = "./get?user=${username}&theme=Abocado-calendar"></a>
            -->
            
            <a href = "./displayURL?user=${username}&theme=Perfume-calendar"> <img src = "./get?user=${username}&theme=Perfume-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=CottonCandy-calendar"> <img src = "./get?user=${username}&theme=CottonCandy-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Grass-calendar"> <img src = "./get?user=${username}&theme=Grass-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Peach-calendar"> <img src = "./get?user=${username}&theme=Peach-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Indigo-calendar"> <img src = "./get?user=${username}&theme=Indigo-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Sunset-calendar"> <img src = "./get?user=${username}&theme=Sunset-calendar"></a>
        </div>
    </body>
</html>
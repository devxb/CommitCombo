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
            div{
                position:absolute;
                background-color : rgb(255,255,255,0);
                /*border-style:solid;*/
                /*border-image : repeating-linear-gradient(0.25turn, #FFBC50, #AA31BD) 10;*/
                text-align: center;
                vertical-align: center;
                width: 100vw;
                height: 100vh;
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

        <div>
         <img src = "./Application/Maker/logo/Choose-your-theme.svg" style="animation: fadeInAnimation 1s ease-in-out"> <br>
         <!--
         <p> 
            <span style="color:#FFFFFF">If you see more than one of the same theme, please refresh.</span> <br>
            <span style="color:#C4C4C4"> I will fix it as soon as possible. </span> <br>
         </p>
         -->
         <br>
         <br>
         <br>
            <a href = "./displayURL?user=${username}&theme=BasicWhite-mini"> <img src = "./get?user=${username}&theme=BasicWhite-mini"></img></a> 
            <a href = "./displayURL?user=${username}&theme=BasicWhite-mini-v2"><img src = "./get?user=${username}&theme=BasicWhite-mini-v2"></img></a> 
            <a href = "./displayURL?user=${username}&theme=MintChocolate-mini"> <img src = "./get?user=${username}&theme=MintChocolate-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=MintChocolate-mini-v2"><img src = "./get?user=${username}&theme=MintChocolate-mini-v2"></img></a>


            <a href = "./displayURL?user=${username}&theme=BasicDark-mini"> <img src = "./get?user=${username}&theme=BasicDark-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=BasicDark-mini-v2"><img src = "./get?user=${username}&theme=BasicDark-mini-v2"></img></a> 
            <a href = "./displayURL?user=${username}&theme=Orange-mini"> <img src = "./get?user=${username}&theme=Orange-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Orange-mini-v2"><img src = "./get?user=${username}&theme=Orange-mini-v2"></a><br>


            <a href = "./displayURL?user=${username}&theme=BasicGray-mini"> <img src = "./get?user=${username}&theme=BasicGray-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=BasicGray-mini-v2"><img src = "./get?user=${username}&theme=BasicGray-mini-v2"></img></a> 
            <a href = "./displayURL?user=${username}&theme=Abocado-mini"> <img src = "./get?user=${username}&theme=Abocado-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Abocado-mini-v2"><img src = "./get?user=${username}&theme=Abocado-mini-v2"></a>


            <a href = "./displayURL?user=${username}&theme=Mocha-mini"> <img src = "./get?user=${username}&theme=Mocha-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Mocha-mini-v2"><img src = "./get?user=${username}&theme=Mocha-mini-v2"></img></a> 
            <a href = "./displayURL?user=${username}&theme=Perfume-mini"> <img src = "./get?user=${username}&theme=Perfume-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Perfume-mini-v2"><img src = "./get?user=${username}&theme=Perfume-mini-v2"></a><br>


            <a href = "./displayURL?user=${username}&theme=Grape-mini"> <img src = "./get?user=${username}&theme=Grape-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Grape-mini-v2"><img src = "./get?user=${username}&theme=Grape-mini-v2"></img></a> 
            <a href = "./displayURL?user=${username}&theme=CottonCandy-mini"> <img src = "./get?user=${username}&theme=CottonCandy-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=CottonCandy-mini-v2"><img src = "./get?user=${username}&theme=CottonCandy-mini-v2"></a>



            <a href = "./displayURL?user=${username}&theme=Grass-mini"> <img src = "./get?user=${username}&theme=Grass-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Grass-mini-v2"><img src = "./get?user=${username}&theme=Grass-mini-v2"></a> 
            <a href = "./displayURL?user=${username}&theme=Peach-mini"> <img src = "./get?user=${username}&theme=Peach-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Peach-mini-v2"><img src = "./get?user=${username}&theme=Peach-mini-v2"></a><br>


            <a href = "./displayURL?user=${username}&theme=Indigo-mini"> <img src = "./get?user=${username}&theme=Indigo-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Indigo-mini-v2"><img src = "./get?user=${username}&theme=Indigo-mini-v2"></a> 
            <a href = "./displayURL?user=${username}&theme=Sunset-mini"> <img src = "./get?user=${username}&theme=Sunset-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Sunset-mini-v2"><img src = "./get?user=${username}&theme=Sunset-mini-v2"></a>


            <a href = "./displayURL?user=${username}&theme=Lake-mini"> <img src = "./get?user=${username}&theme=Lake-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Lake-mini-v2"><img src = "./get?user=${username}&theme=Lake-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=Ocean-mini"> <img src = "./get?user=${username}&theme=Ocean-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Ocean-mini-v2"><img src = "./get?user=${username}&theme=Ocean-mini-v2"></a><br>


            <a href = "./displayURL?user=${username}&theme=DeepOcean-mini"> <img src = "./get?user=${username}&theme=DeepOcean-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=DeepOcean-mini-v2"><img src = "./get?user=${username}&theme=DeepOcean-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=Cloud-mini"> <img src = "./get?user=${username}&theme=Cloud-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Cloud-mini-v2"><img src = "./get?user=${username}&theme=Cloud-mini-v2"></a>


            <a href = "./displayURL?user=${username}&theme=Emerald-mini"> <img src = "./get?user=${username}&theme=Emerald-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Emerald-mini-v2"><img src = "./get?user=${username}&theme=Emerald-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=Depths-mini"> <img src = "./get?user=${username}&theme=Depths-mini"></a> 
            <a href = "./displayURL?user=${username}&theme=Depths-mini-v2"><img src = "./get?user=${username}&theme=Depths-mini-v2"></a><br>

            <a href = "./displayURL?user=${username}&theme=DarkBlue-mini"> <img src = "./get?user=${username}&theme=DarkBlue-mini"></a>
            <a href = "./displayURL?user=${username}&theme=DarkBlue-mini-v2"> <img src = "./get?user=${username}&theme=DarkBlue-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=DarkGray-mini"> <img src = "./get?user=${username}&theme=DarkGray-mini"></a>
            <a href = "./displayURL?user=${username}&theme=DarkGray-mini-v2"> <img src = "./get?user=${username}&theme=DarkGray-mini-v2"></a>


            <a href = "./displayURL?user=${username}&theme=RoyalWhite-mini"> <img src = "./get?user=${username}&theme=RoyalWhite-mini"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalWhite-mini-v2"> <img src = "./get?user=${username}&theme=RoyalWhite-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalPurple-mini"> <img src = "./get?user=${username}&theme=RoyalPurple-mini"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalPurple-mini-v2"> <img src = "./get?user=${username}&theme=RoyalPurple-mini-v2"></a>
            <br>

            <a href = "./displayURL?user=${username}&theme=RoyalBrown-mini"> <img src = "./get?user=${username}&theme=RoyalBrown-mini"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalBrown-mini-v2"> <img src = "./get?user=${username}&theme=RoyalBrown-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalBlack-mini"> <img src = "./get?user=${username}&theme=RoyalBlack-mini"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalBlack-mini-v2"> <img src = "./get?user=${username}&theme=RoyalBlack-mini-v2"></a>


            <a href = "./displayURL?user=${username}&theme=DeepPurple-mini"> <img src = "./get?user=${username}&theme=DeepPurple-mini"></a>
            <a href = "./displayURL?user=${username}&theme=DeepPurple-mini-v2"> <img src = "./get?user=${username}&theme=DeepPurple-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalPink-mini"> <img src = "./get?user=${username}&theme=RoyalPink-mini"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalPink-mini-v2"> <img src = "./get?user=${username}&theme=RoyalPink-mini-v2"></a>
            <br>

            <a href = "./displayURL?user=${username}&theme=RoyalRed-mini"> <img src = "./get?user=${username}&theme=RoyalRed-mini"></a>
            <a href = "./displayURL?user=${username}&theme=RoyalRed-mini-v2"> <img src = "./get?user=${username}&theme=RoyalRed-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=Apricot-mini"> <img src = "./get?user=${username}&theme=Apricot-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Apricot-mini-v2"> <img src = "./get?user=${username}&theme=Apricot-mini-v2"></a> 


            <a href = "./displayURL?user=${username}&theme=Pink-mini"> <img src = "./get?user=${username}&theme=Pink-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Pink-mini-v2"> <img src = "./get?user=${username}&theme=Pink-mini-v2"></a>
            <a href = "./displayURL?user=${username}&theme=Rainbow-mini"> <img src = "./get?user=${username}&theme=Rainbow-mini"></a>
            <a href = "./displayURL?user=${username}&theme=Rainbow-mini-v2"> <img src = "./get?user=${username}&theme=Rainbow-mini-v2"></a>
            <br>
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
            <!--
            <a href = "./displayURL?user=${username}&theme=Perfume-calendar"> <img src = "./get?user=${username}&theme=Perfume-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=CottonCandy-calendar"> <img src = "./get?user=${username}&theme=CottonCandy-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Grass-calendar"> <img src = "./get?user=${username}&theme=Grass-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Peach-calendar"> <img src = "./get?user=${username}&theme=Peach-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Indigo-calendar"> <img src = "./get?user=${username}&theme=Indigo-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Sunset-calendar"> <img src = "./get?user=${username}&theme=Sunset-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Lake-calendar"> <img src = "./get?user=${username}&theme=Lake-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Ocean-calendar"> <img src = "./get?user=${username}&theme=Ocean-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=DeepOcean-calendar"> <img src = "./get?user=${username}&theme=DeepOcean-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Cloud-calendar"> <img src = "./get?user=${username}&theme=Cloud-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Emerald-calendar"> <img src = "./get?user=${username}&theme=Emerald-calendar"></a>
            <a href = "./displayURL?user=${username}&theme=Depths-calendar"> <img src = "./get?user=${username}&theme=Depths-calendar"></a>
            -->
        </div>

    </body>
</html>
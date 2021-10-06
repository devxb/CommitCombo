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
         <img src = "./chooseYourTheme.jsp" style="animation: fadeInAnimation 1s ease-in-out"> <br>
         <!--
         <p> 
            <span style="color:#FFFFFF">If you see more than one of the same theme, please refresh.</span> <br>
            <span style="color:#C4C4C4"> I will fix it as soon as possible. </span> <br>
         </p>
         -->
         <br>
         <br>
         <br>
            <a href = "/displayURL?user=${username}&theme=BasicWhite"> <img src = "/get?user=${username}&theme=BasicWhite"></img></a> 
            <a href = "/displayURL?user=${username}&theme=BasicWhite&v=2"><img src = "/get?user=${username}&theme=BasicWhite&v=2"></img></a> 
            <a href = "/displayURL?user=${username}&theme=MintChocolate"> <img src = "/get?user=${username}&theme=MintChocolate"></a> 
            <a href = "/displayURL?user=${username}&theme=MintChocolate&v=2"><img src = "/get?user=${username}&theme=MintChocolate&v=2"></img></a>


            <a href = "/displayURL?user=${username}&theme=BasicDark"> <img src = "/get?user=${username}&theme=BasicDark"></a> 
            <a href = "/displayURL?user=${username}&theme=BasicDark&v=2"><img src = "/get?user=${username}&theme=BasicDark&v=2"></img></a> 
            <a href = "/displayURL?user=${username}&theme=Orange"> <img src = "/get?user=${username}&theme=Orange"></a> 
            <a href = "/displayURL?user=${username}&theme=Orange&v=2"><img src = "/get?user=${username}&theme=Orange&v=2"></a><br>


            <a href = "/displayURL?user=${username}&theme=BasicGray"> <img src = "/get?user=${username}&theme=BasicGray"></a> 
            <a href = "/displayURL?user=${username}&theme=BasicGray&v=2"><img src = "/get?user=${username}&theme=BasicGray&v=2"></img></a> 
            <a href = "/displayURL?user=${username}&theme=Abocado"> <img src = "/get?user=${username}&theme=Abocado"></a> 
            <a href = "/displayURL?user=${username}&theme=Abocado&v=2"><img src = "/get?user=${username}&theme=Abocado&v=2"></a>


            <a href = "/displayURL?user=${username}&theme=Mocha"> <img src = "/get?user=${username}&theme=Mocha"></a> 
            <a href = "/displayURL?user=${username}&theme=Mocha&v=2"><img src = "/get?user=${username}&theme=Mocha&v=2"></img></a> 
            <a href = "/displayURL?user=${username}&theme=Perfume"> <img src = "/get?user=${username}&theme=Perfume"></a> 
            <a href = "/displayURL?user=${username}&theme=Perfume&v=2"><img src = "/get?user=${username}&theme=Perfume&v=2"></a><br>


            <a href = "/displayURL?user=${username}&theme=Grape"> <img src = "/get?user=${username}&theme=Grape"></a> 
            <a href = "/displayURL?user=${username}&theme=Grape&v=2"><img src = "/get?user=${username}&theme=Grape&v=2"></img></a> 
            <a href = "/displayURL?user=${username}&theme=CottonCandy"> <img src = "/get?user=${username}&theme=CottonCandy"></a> 
            <a href = "/displayURL?user=${username}&theme=CottonCandy&v=2"><img src = "/get?user=${username}&theme=CottonCandy&v=2"></a>



            <a href = "/displayURL?user=${username}&theme=Grass"> <img src = "/get?user=${username}&theme=Grass"></a> 
            <a href = "/displayURL?user=${username}&theme=Grass&v=2"><img src = "/get?user=${username}&theme=Grass&v=2"></a> 
            <a href = "/displayURL?user=${username}&theme=Peach"> <img src = "/get?user=${username}&theme=Peach"></a>
            <a href = "/displayURL?user=${username}&theme=Peach&v=2"><img src = "/get?user=${username}&theme=Peach&v=2"></a><br>


            <a href = "/displayURL?user=${username}&theme=Indigo"> <img src = "/get?user=${username}&theme=Indigo"></a> 
            <a href = "/displayURL?user=${username}&theme=Indigo&v=2"><img src = "/get?user=${username}&theme=Indigo&v=2"></a> 
            <a href = "/displayURL?user=${username}&theme=Sunset"> <img src = "/get?user=${username}&theme=Sunset"></a> 
            <a href = "/displayURL?user=${username}&theme=Sunset&v=2"><img src = "/get?user=${username}&theme=Sunset&v=2"></a>


            <a href = "/displayURL?user=${username}&theme=Lake"> <img src = "/get?user=${username}&theme=Lake"></a> 
            <a href = "/displayURL?user=${username}&theme=Lake&v=2"><img src = "/get?user=${username}&theme=Lake&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=Ocean"> <img src = "/get?user=${username}&theme=Ocean"></a>
            <a href = "/displayURL?user=${username}&theme=Ocean&v=2"><img src = "/get?user=${username}&theme=Ocean&v=2"></a><br>


            <a href = "/displayURL?user=${username}&theme=DeepOcean"> <img src = "/get?user=${username}&theme=DeepOcean"></a> 
            <a href = "/displayURL?user=${username}&theme=DeepOcean&v=2"><img src = "/get?user=${username}&theme=DeepOcean&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=Cloud"> <img src = "/get?user=${username}&theme=Cloud"></a> 
            <a href = "/displayURL?user=${username}&theme=Cloud&v=2"><img src = "/get?user=${username}&theme=Cloud&v=2"></a>


            <a href = "/displayURL?user=${username}&theme=Emerald"> <img src = "/get?user=${username}&theme=Emerald"></a> 
            <a href = "/displayURL?user=${username}&theme=Emerald&v=2"><img src = "/get?user=${username}&theme=Emerald&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=Depths"> <img src = "/get?user=${username}&theme=Depths"></a> 
            <a href = "/displayURL?user=${username}&theme=Depths&v=2"><img src = "/get?user=${username}&theme=Depths&v=2"></a><br>

            <a href = "/displayURL?user=${username}&theme=DarkBlue"> <img src = "/get?user=${username}&theme=DarkBlue"></a>
            <a href = "/displayURL?user=${username}&theme=DarkBlue&v=2"> <img src = "/get?user=${username}&theme=DarkBlue&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=DarkGray"> <img src = "/get?user=${username}&theme=DarkGray"></a>
            <a href = "/displayURL?user=${username}&theme=DarkGray&v=2"> <img src = "/get?user=${username}&theme=DarkGray&v=2"></a>


            <a href = "/displayURL?user=${username}&theme=RoyalWhite"> <img src = "/get?user=${username}&theme=RoyalWhite"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalWhite&v=2"> <img src = "/get?user=${username}&theme=RoyalWhite&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalPurple"> <img src = "/get?user=${username}&theme=RoyalPurple"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalPurple&v=2"> <img src = "/get?user=${username}&theme=RoyalPurple&v=2"></a>
            <br>

            <a href = "/displayURL?user=${username}&theme=RoyalBrown"> <img src = "/get?user=${username}&theme=RoyalBrown"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalBrown&v=2"> <img src = "/get?user=${username}&theme=RoyalBrown&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalBlack"> <img src = "/get?user=${username}&theme=RoyalBlack"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalBlack&v=2"> <img src = "/get?user=${username}&theme=RoyalBlack&v=2"></a>


            <a href = "/displayURL?user=${username}&theme=DeepPurple"> <img src = "/get?user=${username}&theme=DeepPurple"></a>
            <a href = "/displayURL?user=${username}&theme=DeepPurple&v=2"> <img src = "/get?user=${username}&theme=DeepPurple&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalPink"> <img src = "/get?user=${username}&theme=RoyalPink"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalPink&v=2"> <img src = "/get?user=${username}&theme=RoyalPink&v=2"></a>
            <br>

            <a href = "/displayURL?user=${username}&theme=RoyalRed"> <img src = "/get?user=${username}&theme=RoyalRed"></a>
            <a href = "/displayURL?user=${username}&theme=RoyalRed&v=2"> <img src = "/get?user=${username}&theme=RoyalRed&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=Apricot"> <img src = "/get?user=${username}&theme=Apricot"></a>
            <a href = "/displayURL?user=${username}&theme=Apricot&v=2"> <img src = "/get?user=${username}&theme=Apricot&v=2"></a> 


            <a href = "/displayURL?user=${username}&theme=Pink"> <img src = "/get?user=${username}&theme=Pink"></a>
            <a href = "/displayURL?user=${username}&theme=Pink&v=2"> <img src = "/get?user=${username}&theme=Pink&v=2"></a>
            <a href = "/displayURL?user=${username}&theme=Rainbow"> <img src = "/get?user=${username}&theme=Rainbow"></a>
            <a href = "/displayURL?user=${username}&theme=Rainbow&v=2"> <img src = "/get?user=${username}&theme=Rainbow&v=2"></a>
            <br>
            <!--
            Not pretty
            <a href = "/displayURL?user=${username}&theme=BasicWhite-calendar"> <img src = "/get?user=${username}&theme=BasicWhite-calendar"></img></a>
            <a href = "/displayURL?user=${username}&theme=BasicDark-calendar"> <img src = "/get?user=${username}&theme=BasicDark-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=BasicGray-calendar"> <img src = "/get?user=${username}&theme=BasicGray-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Mocha-calendar"> <img src = "/get?user=${username}&theme=Mocha-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Grape-calendar"> <img src = "/get?user=${username}&theme=Grape-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=MintChocolate-calendar"> <img src = "/get?user=${username}&theme=MintChocolate-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Orange-calendar"> <img src = "/get?user=${username}&theme=Orange-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Abocado-calendar"> <img src = "/get?user=${username}&theme=Abocado-calendar"></a>
            -->
            <!--
            <a href = "/displayURL?user=${username}&theme=Perfume-calendar"> <img src = "/get?user=${username}&theme=Perfume-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=CottonCandy-calendar"> <img src = "/get?user=${username}&theme=CottonCandy-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Grass-calendar"> <img src = "/get?user=${username}&theme=Grass-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Peach-calendar"> <img src = "/get?user=${username}&theme=Peach-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Indigo-calendar"> <img src = "/get?user=${username}&theme=Indigo-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Sunset-calendar"> <img src = "/get?user=${username}&theme=Sunset-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Lake-calendar"> <img src = "/get?user=${username}&theme=Lake-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Ocean-calendar"> <img src = "/get?user=${username}&theme=Ocean-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=DeepOcean-calendar"> <img src = "/get?user=${username}&theme=DeepOcean-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Cloud-calendar"> <img src = "/get?user=${username}&theme=Cloud-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Emerald-calendar"> <img src = "/get?user=${username}&theme=Emerald-calendar"></a>
            <a href = "/displayURL?user=${username}&theme=Depths-calendar"> <img src = "/get?user=${username}&theme=Depths-calendar"></a>
            -->
        </div>

    </body>
</html>
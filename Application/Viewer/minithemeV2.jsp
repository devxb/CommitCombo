<%@ page language="java" contentType="image/svg+xml; charset=utf-8" pageEncoding = "utf-8"%>

<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">

<svg width="153" height="67" viewBox="0 0 153 67" fill="none" xmlns="http://www.w3.org/2000/svg">
    <style type="text/css">
        <![CDATA[
        
            @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap');
            
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
                50%{
                    opacity : 0;
                }
                100%{
                    opacity : 1;
                }
            }
            
            @keyframes comboCountAnimation{
                0%{
                    text : 0;
                }
                100%{
                    text : ${comboCnt};
                }
                
            }
            
            ${extraAnimaiton}
            
            .commitCombo{
                font-family: 'Noto Sans KR', sans-serif;
                font-size: 0.625em;
                fill:${commitComboFill};
                font-weight: 400;
                animation: delayfadeInAnimation 0.8s ease-in-out;
            }
            
            .comboCnt{
                font-family: 'Noto Sans KR', sans-serif;
                font-size: ${fontSize};
                font-weight: 500;
                text-align: center;
                animation: delayfadeInAnimation 1.4s ease-in-out;
                fill : ${nameTagFill};
            }
        ]]>
    </style>
    <defs>
        ${gradient}
    </defs>
    <rect width="153" height="66.5217" rx="5" fill="${backgroundFill}"/>
    
    <g style = "animation: fadeInAnimation 0.8s ease-in-out" transform="translate(11,0)">
        <%@ include file="nameTag.jsp" %>
    </g>
    
    <g transform="translate(11,43)">
        <text text-anchor="left" dominant-baseline="middle" class="commitCombo">Commit Combo</text>
    </g>
    <g transform="translate(120,35)">
        <text text-anchor="middle" dominant-baseline = "middle" class = "comboCnt">${comboCnt}</text>
    </g> 
</svg>
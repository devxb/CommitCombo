<%@ page language="java" contentType="image/svg+xml; charset=UTF-8" pageEncoding = "UTF-8"%>

<svg width="${miniThemeWidth}" height="${miniThemeHeight}" viewBox="0 0 ${miniThemeWidth} ${miniThemeHeight}" fill="none" xmlns="http://www.w3.org/2000/svg">
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
                font-weight: 300;
                text-align: center;
                animation: delayfadeInAnimation 1.4s ease-in-out;
                fill : ${comboCntFill};
            }
        ]]>
    </style>
    <defs>
        ${gradient}
    </defs>
    <rect x="${marginLeft}" y="${marginTop}" width="153" height="66.5217" rx="5" fill="${backgroundFill}"/>
    <rect x="${comboBoxMarginLeft}" y="${comboBoxMarginTop}" width="53.5419" height="53.5419" rx="5" fill="${comboBoxFill}"/>
    <g style = "animation: fadeInAnimation 0.8s ease-in-out" transform="translate(11,0)">
        <%@ include file="nameTag.jsp" %>
    </g>
    <g transform="translate(${commitComboMarginLeft},${commitComboMarginTop})">
        <text text-anchor="left" dominant-baseline="middle" class="commitCombo">Commit Combo</text>
    </g>
    <g transform="translate(${comboCntMarginLeft}, ${comboCntMarginTop})">
        <text text-anchor="middle" dominant-baseline = "middle" class = "comboCnt">${comboCnt}</text>
    </g> 
</svg>
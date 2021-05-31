<%@ page language="java" contentType="image/svg+xml; charset=utf-8" pageEncoding="utf-8"%>

<svg width="147" height="180" viewBox="0 0 147 180" fill="none" xmlns="http://www.w3.org/2000/svg">
    <style>
        <![CDATA[
        
            @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=block');
            
            @keyframes fadeInAnimation{
                0%{
                    opacity:0;
                }
                100%{
                    opacity:1;
                }
            }
            
            @keyframes delayfadeInAnimation{
                0%{
                    opacity:0;
                }
                80%{
                    opacity:0;
                }
                100%{
                    opacity:1;
                }
            }
            
            @keyframes strokeAnimation{
                0%{
                    stroke-dashoffset : 150px;
                    fill-opacity : 0;
                }
                60%{
                    fill-opacity : 0;
                }
                100%{
                    stroke-dashoffset : 0px;
                    fill-opacity : 1;
                }
            }
            
            .themeCircle{
                fill : ${backgroundFill};
                stroke : ${comboBoxFill};
                stroke-width : 1px;
                stroke-dasharray : 150px;
                animation : strokeAnimation 1s ease-in-out;
            }
            
            .themeLine{
                stroke : ${comboBoxFill};
                stroke-dasharray : 150px;
                animation : strokeAnimation 1s ease-in-out;
                
            }
            
            .comboCntBox{
                fill : ${comboBoxFill};
                animation : delayfadeInAnimation 2s ease-in-out;
            }
            
            text{
                font-family : 'Noto Sans KR', sans-serif;
                fill : ${nameTagFill};
                stroke-dasharray : 150px;
                animation : fadeInAnimation 1.5s ease-in-out;
            }
            
            text.label{
                font-size : 0.625em;
                font-weight : 400;
            }
            
            text.comboCnt{
                fill : ${comboCntFill};
                font-weight : 700;
                font-size : ${fontSize};
                animation : delayfadeInAnimation 2.5s ease-in-out;
            }
        ]]>
    </style>
    <defs>
        ${gradient}
    </defs>
    <rect width="147" height="180" rx="5" class = "themeBackground" fill="${backgroundFill}"/>
    <rect x="7" y="51" width="133" height="121" rx="5" class="comboCntBox"/>
    <circle cx="16.5" cy="34.5" r="9" class="themeCircle"/>
    <line x1="6.99951" y1="17.25" x2="140" y2="17.25" class="themeLine"/>
    <g transform="translate(22.5,11)">
        <text class = "label"> github commit combo </text>
    </g>
    <g style = "animation: fadeInAnimation 1.5s ease-in-out" transform="translate(40,8)">
        <g align = "center">
            <%@ include file="nameTag.jsp" %>
        </g>
    </g>
    <g transform="translate(74,115)">
        <text dominant-baseline="middle" text-anchor="middle" class="comboCnt"> ${comboCnt} </text>
    </g>
</svg>

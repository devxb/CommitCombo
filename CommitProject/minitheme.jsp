<%@ page language="java" contentType="image/svg+xml; charset=utf-8" pageEncoding = "utf-8"%>

<svg width="153" height="67" viewBox="0 0 153 67" fill="none" xmlns="http://www.w3.org/2000/svg">
    <style type="text/css">
        <![CDATA[

            @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;700&family=Sarala:wght@400;700&display=swap');
            
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
            
            .nameTag{
                font-family: 'Sarala', sans-serif;
                font-size: ${userNameSize};
                fill: ${nameTagFill};
                font-weight: 700;
                animation: fadeInAnimation 0.8s ease-in-out;
            }
            
            .commitCombo{
                font-family: 'Roboto', sans-serif;
                font-size: 0.625em;
                fill:${commitComboFill};
                font-weight: 400;
                animation: delayfadeInAnimation 0.8s ease-in-out;
            }
            
            .comboCnt{
                font-family: 'Roboto', sans-serif;
                font-size: 1.688em;
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
    <rect width="153" height="66.5217" rx="5" fill="${backgroundFill}"/>
    <rect x="93.2926" y="6.21948" width="53.5419" height="53.5419" rx="5" fill="${comboBoxFill}"/>
    <g transform="translate(11,32)">
        <text class='nameTag'>${nameTag}</text>
    </g>
    <g transform="translate(11,47)">
        <text class="commitCombo">Commit Combo</text>
    </g>
    <g transform="translate(120,42)">
        <text text-anchor="middle" class = "comboCnt">${comboCnt}</text>
    </g> 
</svg>
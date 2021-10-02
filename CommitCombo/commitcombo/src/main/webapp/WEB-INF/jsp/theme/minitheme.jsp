<%@ page language="java" contentType="image/svg+xml; charset=UTF-8" pageEncoding = "UTF-8"%>

<svg width="157" height="71" viewBox="0 0 157 71" fill="none" xmlns="http://www.w3.org/2000/svg">
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
                    text : ${viewMapper.getContributionCount()};
                }
                
            }
            
            .commitCombo{
                font-family: 'Noto Sans KR', sans-serif;
                font-size: 0.625em;
                fill: ${viewMapper.getCommitComboColor()};
                font-weight: 400;
                animation: delayfadeInAnimation 0.8s ease-in-out;
            }
            
            .comboCnt{
                font-family: 'Noto Sans KR', sans-serif;
                font-size: ${viewMapper.getFontSize()};
                font-weight: 300;
                text-align: center;
                animation: delayfadeInAnimation 1.4s ease-in-out;
                fill: ${viewMapper.getComboCntColor()};
            }
        ]]>
    </style>
    <defs>
        ${gradient}
    </defs>
    <rect x="4" y="4" width="153" height="66.5217" rx="5" fill="${viewMapper.getBackgroundColor()}"/>
    <rect x="97.2926" y="10.21948" width="53.5419" height="53.5419" rx="5" fill="${viewMapper.getComboBoxColor()}"/>
    <g style = "animation: fadeInAnimation 0.8s ease-in-out" transform="translate(11,0)">
        <%@ include file="nameTag.jsp" %>
    </g>
    <g transform="translate(15,47)">
        <text text-anchor="left" dominant-baseline="middle" class="commitCombo">Commit Combo</text>
    </g>
    <g transform="translate(124, 39)">
        <text text-anchor="middle" dominant-baseline = "middle" class = "comboCnt">${viewMapper.getContributionCount()}</text>
    </g> 
</svg>
<%@ page language="java" contentType="image/svg+xml; charset=UTF-8" pageEncoding="UTF-8"%>

<svg width="59" height="74" viewBox="0 0 59 74" fill="none" xmlns="http://www.w3.org/2000/svg">
	<style>
		<![CDATA[
			@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap');
		]]>
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
        
		.title{
			font-family: 'Noto Sans KR', sans-serif;
            font-size: 0.875em;
            font-weight: 700;
        	text-align: center;
            animation: fadeInAnimation 1s ease-in-out;
            fill: ${viewMapper.getComboCntColor()};
		}
		
		.comboBox{
			animation: delayfadeInAnimation 1s ease-in-out;
		}
		
		.background{
			animation: fadeInAnimation 1s ease-in-out;
		}
		
		.comboCnt{
			font-family: 'Noto Sans KR', sans-serif;
			font-size: ${viewMapper.getFontSize()};
			font-weight: 700;
			text-align: center;
			animation: delayfadeInAnimation 1.5s ease-in-out;
			fill: ${viewMapper.getComboCntColor()};
		}
		
	</style>
<rect y="15" width="59" height="59" rx="5" fill="${viewMapper.getBackgroundColor()}" fill-opacity="0.5" class = "background"/>
<rect x="3" y="18" width="53" height="53" rx="5" fill="${viewMapper.getComboBoxColor()}" class = "comboBox"/>
	<g transform="translate(6,9)">
        <text text-anchor="left" dominant-baseline="middle" class="title"> combo </text>
    </g>
	<g transform="translate(29,47)">
		<text text-anchor="middle" dominant-baseline = "middle" class = "comboCnt"> ${viewMapper.getContributionCount()} </text>
	</g>
<defs>
	${viewMapper.getGradient()}
</defs>
</svg>

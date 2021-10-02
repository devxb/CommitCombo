<svg width="161" height="104" viewBox="0 0 161 104" fill="none" xmlns="http://www.w3.org/2000/svg">
    <style>
        <![CDATA[
            /*@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap');*/
            
            .rankText{
                font-family: 'Noto Sans KR', sans-serif;
                font-size: 0.78em;
                fill : ${viewMapper.getNameTagColor()};
                font-weight: 500;
                animation: delayfadeInAnimation 1.8s ease-in-out;
            }
            
        ]]>
    </style>
    <rect x="33" y="74" width="124" height="26" rx="3" fill="${viewMapper.getBackgroundColor()}"/>
    <g transform = "translate(95,89)">
        <text text-anchor="middle" dominant-baseline = "middle" class = "rankText"> Rank #${viewMapper.getRank()} </text>
    </g>
</svg>
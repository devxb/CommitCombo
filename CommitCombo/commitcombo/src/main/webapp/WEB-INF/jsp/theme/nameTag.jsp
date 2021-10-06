<%@ page language="java" contentType="image/svg+xml; charset=UTF-8" pageEncoding="UTF-8"%>

<svg width="83" height="71" viewBox="0 0 83 71" overflow = "Scroll" xmlns="http://www.w3.org/2000/svg">
    <style>
    
        <![CDATA[ 
        
            @keyframes dragUsername{
                0%{
                    -webkit-transform: translate(0px, 0px);
                    -ms-transform: translate(0px, 0px);
                    -o-transform: translate(0px, 0px);
                    -moz-transform: translate(0px, 0px);
                    transform: translate(0px, 0px);
                }
                100%{
                    -webkit-transform: translate(${viewMapper.getDragLength()}px, 0px);
                    -ms-transform: translate(${viewMapper.getDragLength()}px, 0px);
                    -o-transform: translate(${viweMapper.getDragLength()}px, 0px);
                    -moz-transform: translate(${viewMapper.getDragLength()}px, 0px);
                    transform: translate(${viewMapper.getDragLength()}px, 0px);
                }
            }
            
            .nameTag{
                font-family: 'Noto Sans KR', sans-serif;
                font-size: ${viewMapper.getUserNameSize()}em;
                fill: ${viewMapper.getNameTagColor()};
                font-weight: 700;
                animation: ${viewMapper.getAnimation()} 6s linear infinite;
                animation-delay : 1s;
            }
            
        ]]>
		
    </style>
        <g transform="translate(4, 31)">
            <g>
                <text text-anchor="left" dominant-baseline="middle" class='nameTag'>${viewMapper.getUserName()}</text>
            </g>
        </g>
</svg>
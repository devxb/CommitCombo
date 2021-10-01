<%@ page language="java" contentType="image/svg+xml; charset=UTF-8" pageEncoding="UTF-8"%>

<svg width="${nameTagWidth}" height="${nameTagHeight}" viewBox="0 0 ${nameTagWidth} ${nameTagHeight}" overflow = "Scroll" xmlns="http://www.w3.org/2000/svg">
    <style>
    
        <![CDATA[ 
        
            /*@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap');*/
            
            @keyframes dragUsername{
                0%{
                    -webkit-transform: translate(0px, 0px);
                    -ms-transform: translate(0px, 0px);
                    -o-transform: translate(0px, 0px);
                    -moz-transform: translate(0px, 0px);
                    transform: translate(0px, 0px);
                }
                100%{
                    -webkit-transform: translate(${dragLength}px, 0px);
                    -ms-transform: translate(${dragLength}px, 0px);
                    -o-transform: translate(${dragLength}px, 0px);
                    -moz-transform: translate(${dragLength}px, 0px);
                    transform: translate(${dragLength}px, 0px);
                }
            }
            
            .nameTag{
                font-family: 'Noto Sans KR', sans-serif;
                font-size: ${userNameSize};
                fill: ${nameTagFill};
                font-weight: 700;
                animation: ${animationController} 6s linear infinite;
                animation-delay : 1s;
            }
            
        ]]>
        
    </style>
        <g transform="translate(${nameTagX},${nameTagY})">
            <g>
                <text text-anchor="left" dominant-baseline="middle" class='nameTag'>${nameTag}</text>
            </g>
        </g>
</svg>
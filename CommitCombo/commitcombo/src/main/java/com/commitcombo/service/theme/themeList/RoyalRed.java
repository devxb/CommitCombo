package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class RoyalRed extends Theme{	

    public RoyalRed(){	
        this.themeName = "RoyalRed";	
        this.nameTagColor = "#FFFFFF";	
        this.commitComboColor = "#FFFFFF";	
        this.comboCntColor = "url(#Gradient)";	
        this.backgroundColor = "url(#Gradient)";	
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#A71D31\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#3F0D12\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }	

} 	

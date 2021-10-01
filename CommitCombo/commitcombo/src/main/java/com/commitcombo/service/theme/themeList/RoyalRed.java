package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class RoyalRed extends Theme{	

    public RoyalRed(){	
        this.themeName = "RoyalRed";	
        this.NameTagColor = "#FFFFFF";	
        this.CommitComboColor = "#FFFFFF";	
        this.ComboCntColor = "url(#Gradient)";	
        this.BackgroundColor = "url(#Gradient)";	
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#A71D31\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#3F0D12\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }	

} 	

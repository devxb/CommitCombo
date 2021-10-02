package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class RoyalBrown extends Theme{

    public RoyalBrown(){
        this.themeName = "RoyalBrown";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#1E130C\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#9A8478\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }

}
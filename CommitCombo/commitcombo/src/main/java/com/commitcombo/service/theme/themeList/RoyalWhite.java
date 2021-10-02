package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class RoyalWhite extends Theme{

    public RoyalWhite(){
        this.themeName = "RoyalWhite";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#8B939A\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#5B6467\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }


}
package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;
@Component
public class RoyalPurple extends Theme{

    public RoyalPurple(){
        this.themeName = "RoyalPurple";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#948E99\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#2E1437\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }


}
package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class RoyalBlack extends Theme{

    public RoyalBlack(){
        this.themeName = "RoyalBlack";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#000000\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#434343\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }


}
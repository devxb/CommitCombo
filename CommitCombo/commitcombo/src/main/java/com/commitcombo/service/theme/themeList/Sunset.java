package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Sunset extends Theme{

    public Sunset(){
        this.themeName = "Sunset";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FFBC50\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#AA31BD\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }

}
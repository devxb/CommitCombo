package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Ocean extends Theme{

    public Ocean(){
        this.themeName = "Ocean";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";

        // set Gradient
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#1488CC\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#2B32B2\"/> \n")
			.append("</linearGradient>");
		
        this.gradient = stringBuilder.toString();

    }

}
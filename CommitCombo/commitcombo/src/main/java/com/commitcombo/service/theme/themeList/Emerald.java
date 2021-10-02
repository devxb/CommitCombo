package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Emerald extends Theme{

    public Emerald(){
        this.themeName = "Emerald";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";

        // set Gradient
		this.stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#348F50\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#56B4D3\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();

    }

}
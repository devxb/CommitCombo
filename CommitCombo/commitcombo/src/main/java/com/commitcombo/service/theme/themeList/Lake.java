package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Lake extends Theme{

    public Lake(){
        this.themeName = "Lake";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";

        // set Gradient
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#7F7FD5\"/> \n")
			.append("<stop offset=\"50%\" stop-color=\"#86A8E7\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#91EAE4\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();

    }

}
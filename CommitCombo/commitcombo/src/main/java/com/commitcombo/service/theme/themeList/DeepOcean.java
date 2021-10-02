package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class DeepOcean extends Theme{

    public DeepOcean(){
        this.themeName = "DeepOcean";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";

		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#000046\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#1CB5E0\"/> \n")
			.append("</linearGradient>");
        // set Gradient
        this.gradient = stringBuilder.toString();

    }

}
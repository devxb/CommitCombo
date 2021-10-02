package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Cloud extends Theme{

    public Cloud(){
        this.themeName = "Cloud";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";

		stringBuilder.append( "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#9796F0\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#FBC7D4\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();

    }

}
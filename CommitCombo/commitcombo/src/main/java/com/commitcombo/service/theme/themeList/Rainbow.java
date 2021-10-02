package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Rainbow extends Theme{

    public Rainbow(){
        this.themeName = "Rainbow";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#9DDDF6\"/> \n")
			.append("<stop offset=\"50%\" stop-color=\"#B58DF0\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#F37FAB\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }


}
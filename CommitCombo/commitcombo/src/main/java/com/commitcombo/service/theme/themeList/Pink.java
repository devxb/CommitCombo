package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Pink extends Theme{

    public Pink(){
        this.themeName = "Pink";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#D387AB\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#E899DC\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }


}
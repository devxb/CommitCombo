package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class DeepPurple extends Theme{

    public DeepPurple(){
        this.themeName = "DeepPurple";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#5F0A87\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#A4508B\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }


}
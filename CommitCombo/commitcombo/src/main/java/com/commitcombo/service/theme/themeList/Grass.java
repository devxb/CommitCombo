package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Grass extends Theme{

    public Grass(){
        this.themeName = "Grass";
        this.nameTagColor = "#003215";
        this.commitComboColor = "#003215";
        this.comboCntColor = "#003215";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(110)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#DFFFCD\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#39F3BB\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }

}
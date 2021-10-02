package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class CottonCandy extends Theme{

    public CottonCandy(){
        this.themeName = "CottonCandy";
        this.nameTagColor = "#458FFF";
        this.commitComboColor = "#458FFF";
        this.comboCntColor = "#458FFF";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		this.stringBuilder = new StringBuilder();
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#E3FDF5\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#FFE6FA\"/> \n")
			.append("</linearGradient>");
		
        this.gradient = this.stringBuilder.toString();
    }

}
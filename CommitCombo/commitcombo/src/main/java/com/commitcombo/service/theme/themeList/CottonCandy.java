package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class CottonCandy extends Theme{

    public CottonCandy(){
        this.themeName = "CottonCandy";
        this.NameTagColor = "#458FFF";
        this.CommitComboColor = "#458FFF";
        this.ComboCntColor = "#458FFF";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		this.stringBuilder = new StringBuilder();
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#E3FDF5\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#FFE6FA\"/> \n")
			.append("</linearGradient>");
		
        this.Gradient = this.stringBuilder.toString();
    }

}
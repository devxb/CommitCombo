package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Sunset extends Theme{

    public Sunset(){
        this.themeName = "Sunset";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FFBC50\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#AA31BD\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }

}
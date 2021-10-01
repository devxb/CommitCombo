package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Ocean extends Theme{

    public Ocean(){
        this.themeName = "Ocean";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";

        // set Gradient
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#1488CC\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#2B32B2\"/> \n")
			.append("</linearGradient>");
		
        this.Gradient = stringBuilder.toString();

    }

}
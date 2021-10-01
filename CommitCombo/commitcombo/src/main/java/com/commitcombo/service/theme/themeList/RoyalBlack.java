package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class RoyalBlack extends Theme{

    public RoyalBlack(){
        this.themeName = "RoyalBlack";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#000000\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#434343\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }


}
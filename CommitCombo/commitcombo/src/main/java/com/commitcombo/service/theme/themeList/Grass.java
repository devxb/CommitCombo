package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Grass extends Theme{

    public Grass(){
        this.themeName = "Grass";
        this.NameTagColor = "#003215";
        this.CommitComboColor = "#003215";
        this.ComboCntColor = "#003215";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(110)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#DFFFCD\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#39F3BB\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }

}
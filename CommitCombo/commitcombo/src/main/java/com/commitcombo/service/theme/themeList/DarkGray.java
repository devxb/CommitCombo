package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class DarkGray extends Theme{

    public DarkGray(){
        this.themeName = "DarkGray";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#28313B\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#485461\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }


}
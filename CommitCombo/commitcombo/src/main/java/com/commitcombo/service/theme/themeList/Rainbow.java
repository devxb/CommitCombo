package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Rainbow extends Theme{

    public Rainbow(){
        this.themeName = "Rainbow";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#9DDDF6\"/> \n")
			.append("<stop offset=\"50%\" stop-color=\"#B58DF0\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#F37FAB\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }


}
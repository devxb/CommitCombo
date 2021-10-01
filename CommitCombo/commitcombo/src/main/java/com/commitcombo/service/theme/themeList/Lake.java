package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Lake extends Theme{

    public Lake(){
        this.themeName = "Lake";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";

        // set Gradient
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#7F7FD5\"/> \n")
			.append("<stop offset=\"50%\" stop-color=\"#86A8E7\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#91EAE4\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();

    }

}
package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Depths extends Theme{

    public Depths(){
        this.themeName = "Depths";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";

        // set Gradient
		this.stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#373B44\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#4286F4\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();

    }

}
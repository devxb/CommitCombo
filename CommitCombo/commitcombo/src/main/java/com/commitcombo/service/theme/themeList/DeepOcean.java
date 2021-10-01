package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class DeepOcean extends Theme{

    public DeepOcean(){
        this.themeName = "DeepOcean";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";

		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#000046\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#1CB5E0\"/> \n")
			.append("</linearGradient>");
        // set Gradient
        this.Gradient = stringBuilder.toString();

    }

}
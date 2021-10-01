package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class DeepPurple extends Theme{

    public DeepPurple(){
        this.themeName = "DeepPurple";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#5F0A87\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#A4508B\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }


}
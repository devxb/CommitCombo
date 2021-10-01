package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Cloud extends Theme{

    public Cloud(){
        this.themeName = "Cloud";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";

		stringBuilder.append( "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#9796F0\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#FBC7D4\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();

    }

}
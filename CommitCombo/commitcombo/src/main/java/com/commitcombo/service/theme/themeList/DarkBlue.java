package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class DarkBlue extends Theme{

    public DarkBlue(){
        this.themeName = "DarkBlue";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#0F2027\"/> \n")
			.append("<stop offset=\"50%\" stop-color=\"#203A43\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#2C5364\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }


}
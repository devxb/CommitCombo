package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Peach extends Theme{

    public Peach(){
        this.themeName = "Peach";
        this.NameTagColor = "#813627";
        this.CommitComboColor = "#813627";
        this.ComboCntColor = "#813627";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FFECD2\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#FCB69F\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }

}
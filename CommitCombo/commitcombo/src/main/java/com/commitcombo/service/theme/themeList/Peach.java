package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Peach extends Theme{

    public Peach(){
        this.themeName = "Peach";
        this.nameTagColor = "#813627";
        this.commitComboColor = "#813627";
        this.comboCntColor = "#813627";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FFECD2\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#FCB69F\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }

}
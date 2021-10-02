package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Indigo extends Theme{	

    public Indigo(){	
        this.themeName = "Indigo";	
        this.nameTagColor = "#FFFFFF";	
        this.commitComboColor = "#FFFFFF";	
        this.comboCntColor = "url(#Gradient)";	
        this.backgroundColor = "url(#Gradient)";	
        this.comboBoxColor = "#FFFFFF";	
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(45)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#7579FF\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#B224EF\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }	

} 	


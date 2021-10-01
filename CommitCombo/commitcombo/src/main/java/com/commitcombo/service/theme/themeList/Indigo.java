package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Indigo extends Theme{	

    public Indigo(){	
        this.themeName = "Indigo";	
        this.NameTagColor = "#FFFFFF";	
        this.CommitComboColor = "#FFFFFF";	
        this.ComboCntColor = "url(#Gradient)";	
        this.BackgroundColor = "url(#Gradient)";	
        this.ComboBoxColor = "#FFFFFF";	
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(45)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#7579FF\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#B224EF\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }	

} 	


package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Perfume extends Theme{	

    public Perfume(){	
        this.themeName = "Perfume";	
        this.NameTagColor = "#FFFFFF";	
        this.CommitComboColor = "#FFFFFF";	
        this.ComboCntColor = "url(#Gradient)";	
        this.BackgroundColor = "url(#Gradient)";	
        this.ComboBoxColor = "#FFFFFF";	
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(45)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FF1745\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#D501F8\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }	

} 	

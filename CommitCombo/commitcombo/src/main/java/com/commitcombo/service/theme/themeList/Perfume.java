package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Perfume extends Theme{	

    public Perfume(){	
        this.themeName = "Perfume";	
        this.nameTagColor = "#FFFFFF";	
        this.commitComboColor = "#FFFFFF";	
        this.comboCntColor = "url(#Gradient)";	
        this.backgroundColor = "url(#Gradient)";	
        this.comboBoxColor = "#FFFFFF";	
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(45)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FF1745\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#D501F8\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }	

} 	

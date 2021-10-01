package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Apricot extends Theme{

    public Apricot(){
        this.themeName = "Apricot";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append( "<stop offset=\"0%\" stop-color=\"#E58C8A\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#EEC0C6\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }


}
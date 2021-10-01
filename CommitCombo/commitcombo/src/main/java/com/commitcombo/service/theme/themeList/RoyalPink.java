package com.commitcombo.service.theme;
import org.springframework.stereotype.Component;

@Component
public class RoyalPink extends Theme{

    public RoyalPink(){
        this.themeName = "RoyalPink";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "url(#Gradient)";
        this.BackgroundColor = "url(#Gradient)";
        this.ComboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FFA69E\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#861657\"/> \n")
			.append("</linearGradient>");
        this.Gradient = stringBuilder.toString();
    }


}
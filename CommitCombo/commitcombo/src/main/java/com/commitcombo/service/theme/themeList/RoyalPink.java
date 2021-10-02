package com.commitcombo.service.theme;
import org.springframework.stereotype.Component;

@Component
public class RoyalPink extends Theme{

    public RoyalPink(){
        this.themeName = "RoyalPink";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "url(#Gradient)";
        this.backgroundColor = "url(#Gradient)";
        this.comboBoxColor = "#FFFFFF";
		
		stringBuilder.append("<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n")
			.append("<stop offset=\"0%\" stop-color=\"#FFA69E\"/> \n")
			.append("<stop offset=\"100%\" stop-color=\"#861657\"/> \n")
			.append("</linearGradient>");
        this.gradient = stringBuilder.toString();
    }


}
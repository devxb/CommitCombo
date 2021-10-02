package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class BasicWhite extends Theme{

    public BasicWhite(){
        this.themeName = "BasicWhite";
        this.nameTagColor = "#458FFF";
        this.commitComboColor = "#458FFF";
        this.comboCntColor = "#458FFF";
        this.backgroundColor = "#FFFEFE";
        this.comboBoxColor = "#F0F0F0";
    }
} 
	
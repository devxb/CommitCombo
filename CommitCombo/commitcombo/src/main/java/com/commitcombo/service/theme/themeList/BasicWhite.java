package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class BasicWhite extends Theme{

    public BasicWhite(){
        this.themeName = "BasicWhite";
        this.NameTagColor = "#458FFF";
        this.CommitComboColor = "#458FFF";
        this.ComboCntColor = "#458FFF";
        this.BackgroundColor = "#FFFEFE";
        this.ComboBoxColor = "#F0F0F0";
    }
} 
	
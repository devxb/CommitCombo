package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class Grape extends Theme{

    public Grape(){
        this.themeName = "Grape";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "#100F3F";
        this.backgroundColor = "#100F3F";
        this.comboBoxColor = "#F0F0F0";
    }
}
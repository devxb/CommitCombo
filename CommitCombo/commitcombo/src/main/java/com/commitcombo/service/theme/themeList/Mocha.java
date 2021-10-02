package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;
@Component
public class Mocha extends Theme{

    public Mocha(){
        this.themeName = "Mocha";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "#371E1E";
        this.backgroundColor = "#371E1E";
        this.comboBoxColor = "#F0F0F0";
    }
}
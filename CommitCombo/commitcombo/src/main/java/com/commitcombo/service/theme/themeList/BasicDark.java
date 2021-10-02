package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class BasicDark extends Theme{

    public BasicDark(){
        this.themeName = "BasicDark";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "#000000";
        this.backgroundColor = "#000000";
        this.comboBoxColor = "#F0F0F0";
    }
}
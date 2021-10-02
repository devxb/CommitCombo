package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class BasicGray extends Theme{

    public BasicGray(){
        this.themeName = "BasicGray";
        this.nameTagColor = "#FFFFFF";
        this.commitComboColor = "#FFFFFF";
        this.comboCntColor = "#263238";
        this.backgroundColor = "#263238";
        this.comboBoxColor = "#F0F0F0";
    }
}
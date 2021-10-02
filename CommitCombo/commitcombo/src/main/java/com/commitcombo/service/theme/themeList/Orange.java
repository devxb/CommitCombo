package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;
@Component
public class Orange extends Theme{

    public Orange(){
        this.themeName = "Orange";
        this.nameTagColor = "#E74C3C";
        this.commitComboColor = "#E74C3C";
        this.comboCntColor = "#E74C3C";
        this.backgroundColor = "#FFBB12";
        this.comboBoxColor = "#FFFFFF";
    }
}
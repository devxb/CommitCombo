package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;
@Component
public class Orange extends Theme{

    public Orange(){
        this.themeName = "Orange";
        this.NameTagColor = "#E74C3C";
        this.CommitComboColor = "#E74C3C";
        this.ComboCntColor = "#E74C3C";
        this.BackgroundColor = "#FFBB12";
        this.ComboBoxColor = "#FFFFFF";
    }
}
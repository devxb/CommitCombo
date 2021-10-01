package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;
@Component
public class Mocha extends Theme{

    public Mocha(){
        this.themeName = "Mocha";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "#371E1E";
        this.BackgroundColor = "#371E1E";
        this.ComboBoxColor = "#F0F0F0";
    }
}
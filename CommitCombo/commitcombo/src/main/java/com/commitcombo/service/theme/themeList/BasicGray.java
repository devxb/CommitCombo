package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public class BasicGray extends Theme{

    public BasicGray(){
        this.themeName = "BasicGray";
        this.NameTagColor = "#FFFFFF";
        this.CommitComboColor = "#FFFFFF";
        this.ComboCntColor = "#263238";
        this.BackgroundColor = "#263238";
        this.ComboBoxColor = "#F0F0F0";
    }
}
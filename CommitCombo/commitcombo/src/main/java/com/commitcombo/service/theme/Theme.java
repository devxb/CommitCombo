package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public abstract class Theme{
	
    protected String themeName;
    protected String NameTagColor;
    protected String CommitComboColor;
    protected String ComboCntColor;
    protected String BackgroundColor;
    protected String ComboBoxColor;
    protected String Gradient;
    protected String ExtraAnimation;
	protected StringBuilder stringBuilder = new StringBuilder();
	
	public String getThemeName(){
		return this.themeName;
	}
	
    public String getNameTagColor(){
        return this.NameTagColor;
    }
    
	public String getCommitComboColor(){
        return this.CommitComboColor;
    }
    
	public String getComboCntColor(){
        return this.ComboCntColor;
    }
    
	public String getBackgroundColor(){
        return this.BackgroundColor;
    }
    
	public String getComboBoxColor(){
        return this.ComboBoxColor;
    }
    
	public String getGradient(){
        return this.Gradient;
	}
	
    public String getExtraAnimation(){
        return this.ExtraAnimation;
    }

}
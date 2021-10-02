package com.commitcombo.service.theme;

import org.springframework.stereotype.Component;

@Component
public abstract class Theme{
	
    protected String themeName;
    protected String nameTagColor;
    protected String commitComboColor;
    protected String comboCntColor;
    protected String backgroundColor;
    protected String comboBoxColor;
    protected String gradient;
	
	protected StringBuilder stringBuilder = new StringBuilder();
	
	public String getThemeName(){
		return this.themeName;
	}
	
    public String getNameTagColor(){
        return this.nameTagColor;
    }
    
	public String getCommitComboColor(){
        return this.commitComboColor;
    }
    
	public String getComboCntColor(){
        return this.comboCntColor;
    }
    
	public String getBackgroundColor(){
        return this.backgroundColor;
    }
    
	public String getComboBoxColor(){
        return this.comboBoxColor;
    }
    
	public String getGradient(){
        return this.gradient;
	}

}
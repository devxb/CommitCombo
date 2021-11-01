package com.commitcombo.service.viewDTO;

import com.commitcombo.domain.User;
import com.commitcombo.service.commonUtil.ViewOperator;
import com.commitcombo.service.theme.Theme;
import com.commitcombo.service.Option;

public class ViewMapper{
	
	// init
	private StringBuilder sb = new StringBuilder();
	private String themeCategory = "minitheme.jsp";
	
	// User
	private String userName;
	private long contributionCount;
	private long rank;
	private double userNameSize;
	
	// Theme
    private String nameTagColor;
    private String commitComboColor;
    private String comboCntColor;
    private String backgroundColor;
    private String comboBoxColor;
    private String trophyColor;
	private String gradient;
	private double dragLength;
	private String fontSize;
	
	// Option
	private String animation;
	
	
	private ViewMapper flipThemeCategory(){
		if(this.themeCategory.equals("minitheme.jsp")) this.themeCategory = "minithemeV2.jsp";
		else this.themeCategory = "minitheme.jsp";
		return this;
	}
	
	public ViewMapper(User user, Theme theme, Option option, String version){
		setUser(user);
		setTheme(theme);
		setOption(option);
		if(version.equals("2")) flipThemeCategory();
	}
	
	private void setUser(User user){
		this.userName = user.getUserName();
		this.contributionCount = user.getContributionCount();
		this.rank = user.getRank();
		this.dragLength = ViewOperator.getDragLength(this.userName);
		this.fontSize = ViewOperator.getContributionFontSize(user.getContributionCount());
		this.userNameSize = ViewOperator.getFontSize(this.userName);
		this.trophyColor = ViewOperator.getTrophyColor(user.getContributionCount());
	}
	
	private void setTheme(Theme theme){
		this.nameTagColor = theme.getNameTagColor();
		this.commitComboColor = theme.getCommitComboColor();
		this.comboCntColor = theme.getComboCntColor();
		this.backgroundColor = theme.getBackgroundColor();
		this.comboBoxColor = theme.getComboBoxColor();
		this.gradient = theme.getGradient();
	}
	
	private void setOption(Option option){
		this.animation = option.getAnimation();
	}
	
	// Getter
	
	public String getAnimation(){
		return this.animation;
	}
	
	public String getGradient(){
		return this.gradient;
	}
	
	public String getComboBoxColor(){
		return this.comboBoxColor;
	}
	
	public String getBackgroundColor(){
		return this.backgroundColor;
	}
	
	public String getComboCntColor(){
		return this.comboCntColor;
	}
	
	public String getCommitComboColor(){
		return this.commitComboColor;
	}
	
	public String getNameTagColor(){
		return this.nameTagColor;
	}
	
	public String getFontSize(){
		return this.fontSize;
	}
	
	public double getDragLength(){
		return this.dragLength;
	}
	
	public long getRank(){
		return this.rank;
	}
	
	public long getContributionCount(){
		return this.contributionCount;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public String getThemeCategory(){
		return this.themeCategory;
	}
	
	public double getUserNameSize(){
		return this.userNameSize;
	}
	
	public String getTrophyColor(){
		return this.trophyColor;
	}
	
}
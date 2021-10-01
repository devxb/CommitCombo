package com.commitcombo.service;

import com.commitcombo.domain.User;
import com.commitcombo.service.commonUtil.ViewOperator;
import com.commitcombo.service.theme.Theme;

public class ViewMapper{
	
	// init
	private StringBuilder sb = new StringBuilder();
	
	// User
	private String userName;
	private long contributionCount;
	private long rank;
	private double dragLength;
	private String fontSize;
	
	// Theme
	private String gradient;
	private String nameTagColor;
	private String commitComboColor;
	private String contributionCountColor;
	private String backgroundColor;
	private String comboBoxColor;
	
	public ViewMapper(User user, Theme theme){
		setUser(user);
		setTheme(theme);
	}
	
	private void setUser(User user){
		this.userName = user.getUserName();
		this.contributionCount = user.getContributionCount();
		this.rank = user.getRank();
		this.dragLength = ViewOperator.getDragLength(this.userName);
		this.fontSize = sb.append(ViewOperator.getFontSize(this.userName)).append("em").toString();
	}
	
	private void setTheme(Theme theme){
		
	}
	
}
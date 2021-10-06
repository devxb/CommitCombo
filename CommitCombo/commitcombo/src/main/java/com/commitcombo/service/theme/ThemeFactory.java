package com.commitcombo.service.theme;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ThemeFactory{
	
	private List<Theme> themes;
	
	@Autowired
	public ThemeFactory(List<Theme> themes){
		this.themes = themes;
	}
	
	public Theme getTheme(String themeName){
		String[] themeArr = themeName.split("-"); // deprecate된 -mini api대응하기 위해 남겨놓음
		for(Theme theme : themes) if(themeArr[0].equals(theme.getThemeName())) return theme;
		return themes.get(0);
	}
	
}
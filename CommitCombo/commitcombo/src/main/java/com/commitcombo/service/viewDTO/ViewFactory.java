package com.commitcombo.service.viewDTO;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.commitcombo.service.theme.Theme;
import com.commitcombo.domain.User;
import com.commitcombo.service.Option;
import com.commitcombo.service.theme.ThemeFactory;
import com.commitcombo.service.UserService;

@Service
public class ViewFactory{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ThemeFactory themeFactory;
	
	public ViewMapper getViewMapper(String userName, String themeName, String animation, String version){
		User user = userService.findUserByUserName(userService.saveUserByUserName(userName));
		Theme theme = themeFactory.getTheme(themeName);
		theme = hook(user, theme);
		return new ViewMapper(user, theme, new Option(animation), version);
	}
	
	public ViewMapper getViewMapper(String userName, String themeName){
		User user = userService.findUserByUserName(userService.saveUserByUserName(userName));
		Theme theme = themeFactory.getTheme(themeName);
		theme = hook(user, theme);
		return new ViewMapper(user, theme, new Option("dragUserName"), "1");
	}
	
	protected Theme hook(User user, Theme theme){
		return theme;
	}
	
}
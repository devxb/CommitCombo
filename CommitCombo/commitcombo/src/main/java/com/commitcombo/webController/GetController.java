package com.commitcombo.webController;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.commitcombo.service.Option;
import com.commitcombo.service.theme.Theme;
import com.commitcombo.service.theme.ThemeFactory;
import com.commitcombo.service.UserService;
import com.commitcombo.service.ViewMapper;
import com.commitcombo.domain.User;

@Controller
public class GetController{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ThemeFactory themeFactory;
	
	@GetMapping("/get")
	public ModelAndView get(
		@RequestParam String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required = false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		
		User findedUser = userService.findUserByUserName(userService.saveUserByUserName(user));
		Theme getTheme = themeFactory.getTheme(theme);
		
		ViewMapper viewMapper = new ViewMapper(findedUser, getTheme, new Option(animation));
		if(version.equals("2")) viewMapper.flipThemeCategory();
			
		return new ModelAndView("theme/themeWithRank", "viewMapper", viewMapper);
	}
	
	@GetMapping("get/norank")
	public ModelAndView noRankGet(
		@RequestParam String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required = false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		
		User findedUser = userService.findUserByUserName(userService.saveUserByUserName(user));
		Theme getTheme = themeFactory.getTheme(theme);
		
		ViewMapper viewMapper = new ViewMapper(findedUser, getTheme, new Option(animation));
		if(version.equals("2")) viewMapper.flipThemeCategory();
		
		return new ModelAndView(viewMapper.getThemeCategory(), "viewMapper", viewMapper);
	}
	
}
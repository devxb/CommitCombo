package com.commitcombo.webController;

import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.commitcombo.service.Option;
import com.commitcombo.service.theme.Theme;
import com.commitcombo.service.theme.ThemeFactory;
import com.commitcombo.service.viewDTO.ViewFactory;
import com.commitcombo.service.UserService;
import com.commitcombo.service.viewDTO.ViewMapper;
import com.commitcombo.domain.User;
import com.commitcombo.service.errors.InvalidUserException;

@Slf4j
@Controller
public class ThemeController{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ThemeFactory themeFactory;
	
	@Autowired
	private ViewFactory viewFactory;
	
	@GetMapping("/theme")
	public ModelAndView miniTheme(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required = false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		return this.get(user, theme, animation, version, model);
	}
	
	@GetMapping("/theme/norank")
	public ModelAndView norankMiniTheme(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required =  false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		return this.noRankGet(user, theme, animation, version, model);
	}
	
	@GetMapping("/theme/box")
	public ModelAndView boxTheme(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required =  false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		return this.boxGet(user, theme, model);
	}
	
	/*
		----------------------------------
		deprecated
		-----------------------------------
	*/
	
	@GetMapping("/get")
	public ModelAndView get(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required = false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		if(user == null) throw new InvalidUserException("Null user");
		
		log.info("username : " + user);
		
		ViewMapper viewMapper = getViewMapper(user, theme, animation, version);
		
		return new ModelAndView("theme/themeWithRank", "viewMapper", viewMapper);
	}
	
	@GetMapping("/norank/get")
	public ModelAndView noRankGet(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required =  false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		if(user == null) throw new InvalidUserException("Null user");
		
		log.info("username : " + user);
		
		ViewMapper viewMapper = getViewMapper(user, theme, animation, version);
		
		return new ModelAndView("theme/themeNoRank", "viewMapper", viewMapper);
	}
	
	@GetMapping("box/get")
	public ModelAndView boxGet(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		Model model
	){
		if(user == null) throw new InvalidUserException("Null user");
		
		log.info("username : " + user);
		
		ViewMapper viewMapper = getViewMapper(user, theme);
		
		return new ModelAndView("theme/boxtheme", "viewMapper", viewMapper);
	}
	
	private ViewMapper getViewMapper(String user, String theme, String animation, String version){
		
		User findedUser = userService.findUserByUserName(userService.saveUserByUserName(user));
		Theme getTheme = themeFactory.getTheme(theme);
		
		ViewMapper viewMapper = viewFactory.getViewMapper(findedUser, getTheme, new Option(animation), version);
		
		return viewMapper;
		
	}
	
	private ViewMapper getViewMapper(String user, String theme){
		return getViewMapper(user, theme, "dragUsername", "1");
	}
	
}
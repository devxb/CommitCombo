package com.commitcombo.webController;

import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.commitcombo.service.viewDTO.ViewFactory;
import com.commitcombo.service.viewDTO.ViewMapper;
import com.commitcombo.service.errors.InvalidUserException;

@Slf4j
@Controller
public class ThemeController{
	
	@Autowired
	private ViewFactory viewFactory;

	@GetMapping(value={"/get", "/theme"})
	public ModelAndView get(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required = false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		if(user == null) throw new InvalidUserException("Null user");
		
		log.info("username : " + user);
		
		ViewMapper viewMapper = viewFactory.getViewMapper(user, theme, animation, version);
		
		return new ModelAndView("theme/themeWithRank", "viewMapper", viewMapper);
	}
	
	@GetMapping(value={"/norank/get","/theme/norank"})
	public ModelAndView noRankGet(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		@RequestParam(value = "animation", required =  false, defaultValue = "dragUsername") String animation,
		@RequestParam(value = "v", required = false, defaultValue = "1") String version,
		Model model
	){
		if(user == null) throw new InvalidUserException("Null user");
		
		log.info("username : " + user);
		
		ViewMapper viewMapper = viewFactory.getViewMapper(user, theme, animation, version);
		
		return new ModelAndView("theme/themeNoRank", "viewMapper", viewMapper);
	}
	
	@GetMapping(value={"/box/get", "/theme/box"})
	public ModelAndView boxGet(
		@RequestParam(required = false) String user,
		@RequestParam(value = "theme", required = false, defaultValue = "Rainbow") String theme,
		Model model
	){
		if(user == null) throw new InvalidUserException("Null user");
		
		log.info("username : " + user);
		
		ViewMapper viewMapper = viewFactory.getViewMapper(user, theme);
		
		return new ModelAndView("theme/boxtheme", "viewMapper", viewMapper);
	}
	
}
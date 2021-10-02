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
public class MainController{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ThemeFactory themeFactory;
	
	@GetMapping("/get")
	public ModelAndView get(
		@RequestParam String user,
		@RequestParam(required = false) String theme, 
		@RequestParam(required = false) Option option,
	HttpServletResponse response,
	Model model){
		
		theme = (theme == null) ? "Mocha-mini" : theme;
		option = (option == null) ? new Option() : option;
		
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Connection", "keep-alive");
		response.setHeader("keep-alive", "time-out=10, max=5");
		
		User findedUser = userService.findUserByUserName(userService.saveUserByUserName(user));
		Theme the = themeFactory.getTheme(theme);
		
		ViewMapper viewMapper = new ViewMapper(findedUser, the, option);
		
		return new ModelAndView("theme/themeWithRank", "viewMapper", viewMapper);
	}
	
}
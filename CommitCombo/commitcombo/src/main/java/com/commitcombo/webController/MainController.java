package com.commitcombo.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class MainController{
	
	@GetMapping("/")
	public String index(){
		return "index";
	}
	
	@GetMapping("/logo")
	public String logo(){
		return "logo";
	}
	
	@GetMapping("/chooseYourThemeLogo")
	public String chooseYourThemeLogo(){
		return "chooseYourTheme";
	}
	
	@GetMapping("/maker")
	public String maker(){
		return "commitcomboMaker";
	}
	
	@GetMapping("/displayURL")
	public String displayURL(
		@RequestParam(value = "user") String userName,
		@RequestParam String theme,
		@RequestParam(value = "v", defaultValue = "1") String version,
		Model model
	){
		model.addAttribute("username", userName);
		model.addAttribute("theme", theme);
		model.addAttribute("v", version);
		return "displayUserURL";
	}
	
	@PostMapping("/selecttheme")
	public String selectTheme(
		@RequestParam(value = "username", required = false) String userName,
		Model model
	){
		model.addAttribute("username", userName);
		return "selectTheme";
	}
	
}
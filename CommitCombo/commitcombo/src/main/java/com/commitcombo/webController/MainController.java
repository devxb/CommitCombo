package com.commitcombo.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController{
	
	@GetMapping("/get")
	public String get(){
		return "get";
	}
	
}
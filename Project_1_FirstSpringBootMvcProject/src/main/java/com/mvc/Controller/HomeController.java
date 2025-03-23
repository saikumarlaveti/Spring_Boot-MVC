package com.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String wish() {
		return "welcome";
	}
	
	@RequestMapping("/home1")
	public String greet() {
		return "Saikumar";
	}
}

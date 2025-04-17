package com.viewResolver.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewResolver {

	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	
	@GetMapping("/wish")
	public String mainPage() {
		return "show_result";
	}
}

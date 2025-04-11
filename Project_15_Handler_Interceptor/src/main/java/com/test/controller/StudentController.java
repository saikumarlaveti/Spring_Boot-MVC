package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController{
	
	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/result")
	public String reportPage() {
		return "result";
	}
	
	

}

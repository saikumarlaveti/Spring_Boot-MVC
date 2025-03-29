package com.test.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.Model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String show_Welcome() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String registerForm(@ModelAttribute("std") Student s1) {
		s1.setAge(24);
		return "register"; 
	}
	
	@PostMapping("/register")
	public String saveDetails(Map<String,Object> map,
			@ModelAttribute Student st) {
		System.out.println(st);
		return "result";
	}

}


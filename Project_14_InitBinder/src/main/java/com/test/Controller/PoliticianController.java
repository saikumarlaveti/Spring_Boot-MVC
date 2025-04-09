package com.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PoliticianController {

	@GetMapping("/")
	public String HomeScreen() {
		return "home";
	}
}

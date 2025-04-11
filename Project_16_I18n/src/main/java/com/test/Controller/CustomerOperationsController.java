package com.test.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.test.Model.Customer;

@Controller
public class CustomerOperationsController {

	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showCustomerFormPage(@ModelAttribute("cust") Customer cust,
			Map<String,Object> map) {
		return "customer_register";
	}
}

package com.mvc.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.Service.NameService;

@Controller
public class Show_names_Controller {

	@Autowired
	private NameService service;

	
	@RequestMapping("/")
	public String Name() {
		return "welcome";
	}
	
	@RequestMapping("/FamilyDetails")
	public  String Family() {
		return "FamilyDetails";
	}

	@RequestMapping("/Saikumar Laveti")
	public String SaikumarDetails(Map<String,Object> map) {
		String[] msg = service.NameAndDate();
		map.put("Id", msg[0]);
		map.put("Name" ,msg[1]);
		map.put("Group", msg[2]);
		map.put("Village", msg[3]);
		

		return "SaikumarDetails";
	}
	/*
	@RequestMapping("/report")
	public  String Report_1() {
		return "check";
	}
	
	@RequestMapping("/report1")
	public  String Report_2() {
		return "check";
	}
	@RequestMapping({"/report2","/report3","/report4"})
	public  String Report() {
		return "check";
	}
	*/
	@GetMapping("/resend")
	public String getMapping() {
		System.out.println("From GetMapping");
		return "check";
	}
	@PostMapping("/resend")
	public String postMapping() {
		System.out.println("From PostMapping");
		return "forward:Details/classDetails";
	}
}

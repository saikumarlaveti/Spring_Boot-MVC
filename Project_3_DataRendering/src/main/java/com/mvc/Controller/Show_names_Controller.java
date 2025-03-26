package com.mvc.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.Service.NameService;

@Controller
public class Show_names_Controller {

	@Autowired
	private NameService service;

	@RequestMapping("/wish")
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
}

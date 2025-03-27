package com.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Details")
public class WishMessage_Controller {
	
	@Autowired
	private ServletContext sc;
	
	@Autowired
	private ServletConfig cg;
	@Autowired
	private HttpSession ses;
	
	@RequestMapping("/classDetails")
	public String checkServlet() {
		System.out.println("WishMessage Controller show all data");
		System.out.println("Web applicaion name : " + sc.getContextPath());
		System.out.println("Session Id " + ses.getId());
		System.out.println("DS logical name" + cg.getServletName());
		return "classDetails";
	}
}

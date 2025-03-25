package com.mvc.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.service.GenerateWishMessage;

@Controller
public class WishMessageController {
	
	@Autowired
	private GenerateWishMessage service;
	
	@RequestMapping("/home")
	public String displayHomePage() {
		return "welcome";
	}
	
	@RequestMapping("/wish")
	public ModelAndView fetchWishMessage() {
		String msg = service.wishMessage();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("wish", msg);
		mav.addObject("sysDate",new Date());
		mav.setViewName("Show_Result");
		return mav;
	}

}

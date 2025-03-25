package com.mvc.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
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
//method - 1	
/*	@RequestMapping("/wish")
	public ModelAndView fetchWishMessage() {
		String msg = service.wishMessage();
		ModelAndView mav = new ModelAndView();
		mav.addObject("wish", msg);
		mav.addObject("sysDate",new Date());
		mav.setViewName("Show_Result");
		return mav;
	}
*/
	
//method - 2
	
/*	@RequestMapping("/wish")
	public String fetchWishMessage(Map<String ,Object> map) {
		System.out.println("shared memory obj class Name :" + map.getClass());
		String msg = service.wishMessage();
		map.put("wish", msg);
		map.put("sysDate",new Date());
		return "Show_Result";
		
	}
*/
	
//method - 3
/*	@RequestMapping("/wish")
	public String fetchWishMessage(Model model) {
		System.out.println("shared Memory obj class name :" + model.getClass());
		String msg = service.wishMessage();
		model.addAttribute("wish",msg);
		model.addAttribute("sysDate", new Date());
		return "Show_Result";
	}

	*/
	//method - 4
	/*
	@RequestMapping("/wish")
	public String fetchWishMessage(ModelMap model) {
		System.out.println("shared Memory obj class name :" + model.getClass());
		String msg = service.wishMessage();
		model.addAttribute("wish",msg);
		model.addAttribute("sysDate", new Date());
		return "Show_Result";
	}
	*/
	//method - 5
	//if no logical view name is taken then request path of the handler method by excluding "/"
	//becomes logical view name .. For example if the request path is "/wish" .. 
	//the logical view name will be "wish". For this It internally uses RequestToViewNameTranslator comp.
/*	@RequestMapping("/wish")
	public ModelMap fetchWishMessage() {
		ModelMap map = new BindingAwareModelMap();
		System.out.println("shared memory obj class Name :" + map.getClass());
		String msg = service.wishMessage();
		map.put("wish", msg);
		map.put("sysDate",new Date());
		return map;	
	}
	*/
	
	//method - 6
/*	@RequestMapping("/wish")
	public Model fetchWishMessage() {
		Model model = new BindingAwareModelMap();
		System.out.println("shared memory obj class Name :" + model.getClass());
		String msg = service.wishMessage();
		model.addAttribute("wish", msg);
		model.addAttribute("sysDate",new Date());
		return model;	
	}
*/
	//method - 7
	/*
	@RequestMapping("/wish")
	public Map<String,Object> fetchWishMessage() {
		Map<String,Object> map = new HashMap();
		System.out.println("shared memory obj class Name :" + map.getClass());
		String msg = service.wishMessage();
		map.put("wish", msg);
		map.put("sysDate",new Date());
		return map;	
	}
	*/
	//best one
	@RequestMapping("/wish")
	public String fetchWishMessage(Map<String ,Object> map) {
		System.out.println("shared memory obj class Name :" + map.getClass());
		String msg = service.wishMessage();
		map.put("wish", msg);
		map.put("sysDate",new Date());
		return "Show_Result";
		
	}
}

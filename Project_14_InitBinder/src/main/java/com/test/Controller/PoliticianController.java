package com.test.Controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.Model.PoliticianProfile;

@Controller
public class PoliticianController {

    @GetMapping("/")
    public String HomeScreen() {
        System.out.println("Home page is launched:");
        return "home";
    }

    @GetMapping("/register")
	public String showFromPage(@ModelAttribute("pp") PoliticianProfile profile) {
		System.out.println("Politician Profile form page :");
		return "politician_register";
	}

    @PostMapping("/register")
    public String registerPolitic(@ModelAttribute("pp") PoliticianProfile profile) {
        System.out.println("Politician Profile form page:");
        System.out.println("Model class obj data :: " + profile);
        return "showResult";
    }
    @InitBinder
    public void myDateBinder(WebDataBinder binder) {
    	System.out.println("Politician Operations Controller.myDataBinder()");
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sdf,true));
    }
}

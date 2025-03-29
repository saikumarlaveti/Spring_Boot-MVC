package com.test.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.Model.Student;

@Controller
public class StudentController {

	/*
	@GetMapping("/data")
	public String process(@RequestParam("sno") int no,@RequestParam("sname") String name) {
		System.out.println(no + " " + name);
		return "result";
	}
	
	*/
	
	/*
	@GetMapping("/data")
	public String process(@RequestParam int sno,@RequestParam(required=false,defaultValue="SKL") String sname) {
		System.out.println(sno + " " + sname);
		return "result";
	}
	*/

	@GetMapping("/data")
	public String process(
			@RequestParam(required=false,defaultValue="40") int sno,
			@RequestParam String name,
			@RequestParam String[] address,
			@RequestParam Set<String> num,
			@RequestParam List<String> colors) {
		System.out.println(sno + " " + name + " " + Arrays.toString(address)
		+" " + (num) + " " + colors);
		return "result";
	}
			
}


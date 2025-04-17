package com.BeanName.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BeanName.Model.Employee;
import com.BeanName.Service.EmpServiceIMPL;

@Controller
public class EmployeeController {

	@Autowired
	private EmpServiceIMPL emp;
	
	
	@GetMapping("/")
	public String HomePage() {
		return "welcome";
	}
	
	@GetMapping("/report")
	public String showReport(Map<String,Object> map,
			@RequestParam("type") String type) {
		
		List<Employee> emplist = emp.getAllEmployee();
		
		map.put("empslist", emplist);
		
		if(type.equalsIgnoreCase("excel"))
			return "excel_report";
		else
			return "pdf_report";
	}
}

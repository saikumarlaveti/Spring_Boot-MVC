package com.test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.Model.Employee;
import com.test.Service.EmployeeServiceManagement;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServiceManagement service;
	
	@GetMapping("/")
	public String welcomePage() {
		return "home";
	}
	
	@GetMapping("/report")
	public String showEmployeeReport(Map<String,Object> map) 
	{
		List<Employee> list = service.getAllEmployees();
		map.put("empsData", list);
		return "employee_report";
	}
	
	@GetMapping("/add")
	public String ShowaddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		emp.setSalary(20000);
		return "empRegister";
	}
	
	@PostMapping("/add")
	public String addEmployeeForm(Map<String,Object >map,@ModelAttribute("emp") Employee emp) {
		String result = service.saveEmployee(emp);
		List<Employee> list = service.getAllEmployees();
		map.put("resultMsg",result);
		map.put("empsData", list);
		emp.setSalary(20000);
		return "redirect:/report";
	}


}

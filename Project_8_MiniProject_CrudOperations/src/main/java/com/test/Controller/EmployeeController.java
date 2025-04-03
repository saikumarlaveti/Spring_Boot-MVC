package com.test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/edit")
	public String showEditEmployeeForm(@RequestParam("no") int no,@ModelAttribute("emp") Employee emp) {
		Employee emp1 = service.getEmployeeByNo(no);
		BeanUtils.copyProperties(emp1, emp);
		return "employee_edit";
	}

	@PostMapping("/edit")
	public String EditEmployeeForm(@ModelAttribute("emp") Employee emp,
			Map<String,Object> map) {
		String msg = service.editEmployee(emp);
		List<Employee> list = service.getAllEmployees();
		map.put("resultMsg", msg);
		map.put("empsData", list);
		return "employee_report";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("no") int no,Map<String,Object> map) {
		String msg = service.deleteById(no);
		List<Employee> list = service.getAllEmployees();
		map.put("resultMsg", msg);
		map.put("empsData",list);
		return "employee_report";
	}
	
	
}

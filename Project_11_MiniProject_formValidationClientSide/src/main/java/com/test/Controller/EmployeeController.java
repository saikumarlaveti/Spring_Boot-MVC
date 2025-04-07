 package com.test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.Model.Employee;
import com.test.Service.EmployeeServiceManagement;
import com.test.Validations.EmployeeValidatior;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServiceManagement service;
	
	@Autowired
	private EmployeeValidatior empValidator;
	
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
	public String addEmployeeForm(RedirectAttributes attrs,
			@ModelAttribute("emp") Employee emp,
			BindingResult errors) {
		System.out.println("EmployeeOperationsController.addEmployee()");
		//Business logic are called application logic errors
		
		//checking type mismatch error
		if(emp.getVflag().equalsIgnoreCase("no")) {
		if(errors.hasFieldErrors()) {
			return "empRegister";
		}
		//checking form validation errors
		if(empValidator.supports(emp.getClass())) {
			empValidator.validate(emp, errors);
			if(errors.hasErrors())
				return "empRegister";
		}
		}
		if(emp.getJob().equalsIgnoreCase("hacker")) {
			errors.rejectValue("job","job.reject");
			return "empRegister";
		}
//		empValidator.validate(emp, errors);
//		if(errors.hasErrors()) {
//		    return "empRegister";
//		}

		String result = service.saveEmployee(emp);
		//List<Employee> list = service.getAllEmployees();
		//map.put("resultMsg",result);
		attrs.addFlashAttribute("resultMsg",result);
		return "redirect:report";
		
	}
	/*
	@PostMapping("/add")
	public String addEmployeeForm(HttpSession ses,@ModelAttribute("emp") Employee emp) {
		String result = service.saveEmployee(emp);
		//List<Employee> list = service.getAllEmployees();
		//map.put("resultMsg",result);
		ses.setAttribute("resultMsg",result);
		return "redirect:report";
	}
*/
	@GetMapping("/edit")
	public String showEditEmployeeForm(@RequestParam("no") int no,@ModelAttribute("emp") Employee emp) {
		Employee emp1 = service.getEmployeeByNo(no);
		BeanUtils.copyProperties(emp1, emp);
		return "employee_edit";
	}

	@PostMapping("/edit")
	public String EditEmployeeForm(@ModelAttribute("emp") Employee emp,
			RedirectAttributes attrs,
			BindingResult errors) {
		if(emp.getVflag().equalsIgnoreCase("no")) {
			if(errors.hasFieldErrors())
				return "employee_edit";
		}
		if(empValidator.supports(emp.getClass())) {
			empValidator.validate(emp, errors);
			if(errors.hasErrors())
				return "employee_edit";
		}
		String msg = service.editEmployee(emp);
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("no") int no,RedirectAttributes attrs) {
		String msg = service.deleteById(no);
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}
	
	
}

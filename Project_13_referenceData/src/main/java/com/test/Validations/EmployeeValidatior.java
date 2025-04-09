package com.test.Validations;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.test.Model.Employee;


@Component
public class EmployeeValidatior implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
	
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
	    System.out.println("EmployeeValidator.validate()");
	    Employee emp = (Employee) target;

	    if (emp.getEname() == null || emp.getEname().trim().isEmpty()) 
	        errors.rejectValue("ename", "ename.required");
	    else if (emp.getEname().length() > 20) 
	        errors.rejectValue("ename", "ename.max");
	    else if (emp.getEname().length() < 3) 
	        errors.rejectValue("ename", "ename.min");

	    if (emp.getJob() == null || emp.getJob().trim().isEmpty()) 
	        errors.rejectValue("job", "job.required");
	    else if (emp.getJob().length() < 3) 
	        errors.rejectValue("job", "job.title");

	    if (emp.getSalary() <= 0) 
	        errors.rejectValue("salary", "salary.required");
	    else if (emp.getSalary() >= 100000) 
	        errors.rejectValue("salary", "salary.max");
	}

	
}

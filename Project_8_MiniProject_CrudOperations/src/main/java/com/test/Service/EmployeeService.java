package com.test.Service;

import java.util.List;

import com.test.Model.Employee;

public interface EmployeeService {
	
	public String saveEmployee(Employee e);
	
	public List<Employee> getAllEmployees();

}

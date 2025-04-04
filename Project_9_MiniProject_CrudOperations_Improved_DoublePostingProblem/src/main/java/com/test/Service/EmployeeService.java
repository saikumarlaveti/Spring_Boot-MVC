package com.test.Service;

import java.util.List;

import com.test.Model.Employee;

public interface EmployeeService {
	
	public String saveEmployee(Employee e);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByNo(int no);
	
	public String editEmployee(Employee emp);
	
	public String deleteById(int id);

}

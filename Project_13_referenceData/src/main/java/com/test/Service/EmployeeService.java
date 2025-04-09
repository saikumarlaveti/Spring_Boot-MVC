package com.test.Service;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;

import com.test.Model.Employee;
import org.springframework.data.domain.Pageable;


public interface EmployeeService {
	
	public String saveEmployee(Employee e);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByNo(int no);
	
	public String editEmployee(Employee emp);
	
	public String deleteById(int id);
	
	public Page<Employee> getEmployeesPageData(Pageable pageable); // pages are not getting update status column into active employee table

	public Set<String> getAllCountries();
	
	public List<String> getStatesByCountry(String country);
}

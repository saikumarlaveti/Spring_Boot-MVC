package com.test.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.test.Model.Employee;
import com.test.Repo.EmployeeRepo;

@Service("empService")
public class EmployeeServiceManagement implements EmployeeService {

	@Autowired
	private EmployeeRepo emp;
	@Override
	public List<Employee> getAllEmployees() {
		return emp.findAll();
	}
	@Override
	public String saveEmployee(Employee e) {
		return emp.save(e).getEmpno() + "Employee Details is Saved";
	}
	@Override
	public Employee getEmployeeByNo(int no) {
		Employee employee = emp.findById(no).get();//get optional class
		return employee;
	}
	@Override
	public String editEmployee(Employee emp1) {
		int idVal = emp.save(emp1).getEmpno();
		return idVal+"Employee is updated";
	}
	@Override
	public String deleteById(int id) {
		emp.deleteById(id);
		return "deleted Employee Id:" + id;
	}
	@Override
	public Page<Employee> getEmployeesPageData(Pageable pageable) {
		Page<Employee> page = emp.findAll(pageable);
		return page;
	}
	@Override
	public Set<String> getAllCountries() {
		Locale locale[] = Locale.getAvailableLocales();
		Set<String> countrySet = new TreeSet();
		for(Locale l:locale) {
			if(l!=null)
				countrySet.add(l.getDisplayCountry());
		}
		return  countrySet;
	}
	@Autowired
	public Environment env;
	@Override
	public List<String> getStatesByCountry(String country) {
		String statesInfo = env.getRequiredProperty(country);
		List<String> statesList = Arrays.asList(statesInfo.split(","));
		Collections.sort(statesList);
		return statesList;
	}
	
	
	
	

}

package com.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	

}

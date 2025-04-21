package com.test.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Model.Employee;
import com.test.Repo.EmployeeRepo;
import com.test.exception.EmployeeNotFoundException;

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
		//Employee employee = emp.findById(no).get();//get optional class
		Optional<Employee> opt = emp.findById(no);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			throw new EmployeeNotFoundException("Problem is getting employee");
		}
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

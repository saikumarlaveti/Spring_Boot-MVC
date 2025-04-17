package com.BeanName.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeanName.Model.Employee;
import com.BeanName.Repository.EmployeeRepository;

@Service
public class EmpServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	@Override
	public List<Employee> getAllEmployee() {
		return emprepo.findAll();
	}

}

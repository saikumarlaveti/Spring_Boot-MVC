package com.BeanName.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BeanName.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

package com.test.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

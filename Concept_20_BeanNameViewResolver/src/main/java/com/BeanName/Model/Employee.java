package com.BeanName.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity()
@Table(name="Employee")
@Data
public class Employee {

	@Id
	@GeneratedValue
	private Integer empNo;
	
	private String empName;
	
	private String Job;
	
	private String deptName;
	
	private double salary;
}

package com.test.Model;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Employee")
@Data
@SQLDelete(sql="update employee set status='inactive' where empno=? ")
@Where(clause="STATUS<>'inactive'")
public class Employee {

	@Id
	@SequenceGenerator(name="gen1",sequenceName="emp_id_seq")
	@GeneratedValue(generator = "gen1",strategy=GenerationType.SEQUENCE)
	private Integer empno;
	
	@Column(length=20)
	private String ename;
	@Column(length=20)
	private String job;
	
	private float salary;
	
	}

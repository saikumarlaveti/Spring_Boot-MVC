package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}

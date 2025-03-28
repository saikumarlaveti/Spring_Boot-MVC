package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.Student;
import com.example.Repo.StudentRepo;

@Controller
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/save")
	public void saveEntity(Student s) {
		System.out.println(" Waiting for saving student Details");
		repo.save(s);
	}

}

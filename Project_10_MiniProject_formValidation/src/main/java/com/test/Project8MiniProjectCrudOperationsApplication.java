package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:Validation.properties")
public class Project8MiniProjectCrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project8MiniProjectCrudOperationsApplication.class, args);
	}

}

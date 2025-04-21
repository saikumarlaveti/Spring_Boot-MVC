package com.test.exception;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(String string) {

		System.out.println("Employee Not found exception class");
	}
	
	public EmployeeNotFoundException() {

		System.out.println("Employee Not found exception class : 0 param");
	}
	
	

}

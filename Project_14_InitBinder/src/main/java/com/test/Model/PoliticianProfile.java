package com.test.Model;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PoliticianProfile {
	private Integer pid;
	
	private String pname;
	
	private String party;
	
	private Date dob = new Date(2000,07,10); //deflaut value
	
	private Date year;
	
	private boolean married;

}

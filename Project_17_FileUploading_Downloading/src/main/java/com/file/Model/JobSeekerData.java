package com.file.Model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class JobSeekerData {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private MultipartFile resume;
	
	private MultipartFile photo;
	
}

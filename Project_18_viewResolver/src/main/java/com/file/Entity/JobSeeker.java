package com.file.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JobSeeker")
@Data
public class JobSeeker {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String address;
	@Column(length=200)
	private String resumePath;
	@Column(length=200)
	private String photoPath;
	
}

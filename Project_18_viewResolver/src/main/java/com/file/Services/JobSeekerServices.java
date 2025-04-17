package com.file.Services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.file.Entity.JobSeeker;
import com.file.Model.JobSeekerData;

public interface JobSeekerServices {

	public String JobSeekerRegister(JobSeeker js);
	
	public List<JobSeeker> jobseekerDetails();
	
	public String fetchResumePathById(Integer Id);
	

	public String fetchPhotoPathById(Integer Id);
}

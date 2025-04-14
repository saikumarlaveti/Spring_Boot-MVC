package com.file.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.file.Entity.JobSeeker;
import com.file.Model.JobSeekerData;
import com.file.Repository.JobSeekerRepo;

@Service
public class JobSeekerServicesIMPL implements JobSeekerServices{

	@Autowired
	private JobSeekerRepo jsrepo;

	@Override
	public String JobSeekerRegister(JobSeeker js) {
		return "js seeker is saved :"+jsrepo.save(js).getId() + " with id Value";
	}

	@Override
	public List<JobSeeker> jobseekerDetails() {
		List<JobSeeker> employee = jsrepo.findAll();
		return employee;
	}

	@Override
	public String fetchResumePathById(Integer Id) {
		return jsrepo.getResumePathById(Id);
	}

	@Override
	public String fetchPhotoPathById(Integer Id) {
		return jsrepo.getPhotoPathById(Id);
	}
	
	

}

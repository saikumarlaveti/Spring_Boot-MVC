package com.file.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.file.Entity.JobSeeker;
import com.file.Repository.JobSeekerRepo;

@Service
public class JobSeekerServicesIMPL implements JobSeekerServices{

	@Autowired
	private JobSeekerRepo jsrepo;

	@Override
	public String JobSeekerRegister(JobSeeker js) {
		return "js seeker is saved :"+jsrepo.save(js).getId() + " with id Value";
	}
	
	

}

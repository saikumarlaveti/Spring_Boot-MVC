package com.file.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.file.Entity.JobSeeker;

public interface JobSeekerRepo extends JpaRepository<JobSeeker, Integer> {
	
	@Query("select resumePath from JobSeeker where id=:Id")
	public String getResumePathById(Integer Id);
	

	@Query("select photoPath from JobSeeker where id=:Id")
	public String getPhotoPathById(Integer Id);
}

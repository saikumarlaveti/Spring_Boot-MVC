package com.file.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.file.Entity.JobSeeker;

public interface JobSeekerRepo extends JpaRepository<JobSeeker, Integer> {

}

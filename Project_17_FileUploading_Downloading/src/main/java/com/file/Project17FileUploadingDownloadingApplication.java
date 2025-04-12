package com.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;


@SpringBootApplication
public class Project17FileUploadingDownloadingApplication {
	/*
	@Bean(name="multipartResolver")
	public CommonsMultipartResolver createCMResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setMaxUploadSizePerFile(50*1024*1024);
		resolver.setMaxUploadSize(-1);
		return resolver;	
	} nataraz told this method */  
	@Bean(name = "multipartResolver")
	public MultipartResolver multipartResolver() {
	    return new StandardServletMultipartResolver();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Project17FileUploadingDownloadingApplication.class, args);
	}

}

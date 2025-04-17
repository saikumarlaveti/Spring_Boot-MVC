package com.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@SpringBootApplication
public class Project17FileUploadingDownloadingApplication {
	/*
	@Bean
	public ViewResolver createIRVR() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	*/
	
	@Bean(name = "multipartResolver")
	public MultipartResolver multipartResolver() {
	    return new StandardServletMultipartResolver();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Project17FileUploadingDownloadingApplication.class, args);
	}

}

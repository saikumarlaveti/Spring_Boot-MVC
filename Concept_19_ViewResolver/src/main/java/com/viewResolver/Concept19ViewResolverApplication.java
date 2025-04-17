package com.viewResolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@SpringBootApplication
public class Concept19ViewResolverApplication {

	@Bean
	public ViewResolver createRBVResolver() {
	System.out.println("create RBVR resolver");
	ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
	resolver.setBasename("com/viewResolver/commons/views");
	return resolver;
	}
	public static void main(String[] args) {
		SpringApplication.run(Concept19ViewResolverApplication.class, args);
	}

}

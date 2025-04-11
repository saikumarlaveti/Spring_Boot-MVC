package com.test.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.test.interceptor.TimeCheckInterceptor;

@Component
public class MyWebMVCConfigurer implements WebMvcConfigurer{

	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("MywebmvcConfigurer.addinterceptors()");
		registry.addInterceptor(new TimeCheckInterceptor());
	}
}

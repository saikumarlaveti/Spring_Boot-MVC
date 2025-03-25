package com.mvc.service;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@Service("wishService")
public class GenerateWishMessageIMPl implements GenerateWishMessage {

	@Override
	public String wishMessage() {
		LocalDateTime date = LocalDateTime.now();
		int hour = date.getHour();
		if(12>=hour) {
			return "Good Morning Saikumar Laveti"; 
		}
		else if(16>hour) {
			return "Good Evening Saikumar Laveti";
		}
		else
			return "Good Night Saikumar Laveti";
	}

}

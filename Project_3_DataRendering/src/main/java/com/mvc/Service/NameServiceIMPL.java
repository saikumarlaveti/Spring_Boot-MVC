package com.mvc.Service;

import org.springframework.stereotype.Service;

@Service("NameService")
public class NameServiceIMPL implements NameService{

	@Override
	public String[] NameAndDate() {
		String[] arr = {"40","Saikumar Laveti","MCA","Guravam"};
		return arr;

	}



}

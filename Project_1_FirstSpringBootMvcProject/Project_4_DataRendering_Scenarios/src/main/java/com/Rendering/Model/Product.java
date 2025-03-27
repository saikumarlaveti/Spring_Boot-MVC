package com.Rendering.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private Integer id;
	
	private String name;
	
	private double price;
	
	private String company;
}

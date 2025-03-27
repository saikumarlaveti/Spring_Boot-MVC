package com.Rendering.Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Rendering.Model.Product;

@Controller
public class DataRenderingController {
	
	@GetMapping("/showDetails")
	public String showReportData(Map<String,Object>map) {
		map.put("Name","Saikumar");
		map.put("Age", "24");
		map.put("Dream", "Hacker");	
		return "Student";
	}
	
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		map.put("favColors",new String[] {"Red","Green","Yellow","White"});
		map.put("nickNames", List.of("chinna","Sanju","sai"));
		map.put("phoneNumbers", Set.of(799566L,850190L));
		map.put("idDetails", Map.of("aadhar",66292120L,"voterId","SaivoterId"));
	return "Details";
	}
	
	@GetMapping("/product")
	public String showProduct(Map<String,Object> map) {
		Product p1 = new Product(1,"Fan",5000.5,"USHA");
		map.put("Pro1",p1);
		return "product";
	}
	@GetMapping("/productList")
	public String listOfProducts(Map<String,Object> map) {
		List<Product> prodList = List.of(new Product(1,"Fan",5000.5,"USHA"),new Product(2,"Chair",8000.5,"TATA"));
		map.put("products", prodList);
		return "ProductList";
	}
}

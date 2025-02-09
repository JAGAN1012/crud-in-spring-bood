package com.jagan.simplewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jagan.simplewebapp.models.Products;
import com.jagan.simplewebapp.services.ProductServices;

@RestController
	
public class ProductController {
	@Autowired
	ProductServices services;
	@GetMapping("/products")
	public List<Products> getProductds() {
	
		return services.getProducts();	
	}
	
	@GetMapping("/products/{prodId}")
	public Products getProductById(@PathVariable int prodId) {
    	return services.getProductById(prodId);
    }
	@PostMapping("/products") 
	public void addproduct(@RequestBody Products prod) {
		System.out.println(prod);
    	services.addproduct(prod);
    }
	@PutMapping("/products") 
	public void updateproduct(@RequestBody Products prod) {
    	services.updateproduct(prod);
    }
	@DeleteMapping("/products/{prod}") 
	public void deleteproduct(@PathVariable int prod) {
    	services.deleteproduct(prod);
    }
}

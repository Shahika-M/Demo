package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/")

public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/createProduct")
	public Product addProduct(@RequestBody Product product) {
		System.out.println("hello world.......");
		return productRepository.save(product); 
	}
	
   
}

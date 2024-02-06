package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/findAllProducts
	
	@GetMapping(value = "findAllProducts",produces = MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(value = "findAllProduct",method = RequestMethod.GET)
	public List<Product> findAllProducts() {
		return productService.findAllProduct();
	}
	
	@GetMapping(value = "findProductById/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Product findProduct(@PathVariable("pid") int pid) {
		return productService.findProductById(pid);
	}
	
	
}

package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAllProduct(){
		try {
			Thread.sleep(5000);   // it pause for 5 seconds 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return productRepository.findAll();
	}
	
	
	public Product findProductById(int pid){
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			return p;
		}else {
			return null;
		}
	}
}

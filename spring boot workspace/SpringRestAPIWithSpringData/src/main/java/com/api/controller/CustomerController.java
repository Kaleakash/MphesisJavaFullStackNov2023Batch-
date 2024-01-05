package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Customer;
import com.api.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "findAllCustomer",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> findAllCustomer() {
		return customerService.findAllCustomer();
	}
	// http://localhost:8080/storeCustomer   need to pass the data in json format 
	@RequestMapping(value = "storeCustomer",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomer(@RequestBody Customer customer) {	//@RequestBody annotation is use to extract json data from request body 
		System.out.println(customer);     // toString method 
		return customerService.storeCustomer(customer);
	}
}






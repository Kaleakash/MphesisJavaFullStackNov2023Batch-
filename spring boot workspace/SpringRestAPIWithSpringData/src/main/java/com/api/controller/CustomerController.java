package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
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
	// {"cid":102,"cname":"Raju","age":21,"add":{"city":"Mysore","state":"Kar"}}
	@RequestMapping(value = "storeCustomer",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomer(@RequestBody Customer customer) {	//@RequestBody annotation is use to extract json data from request body 
		System.out.println(customer);     // toString method 
		return customerService.storeCustomer(customer);
	}
	
	// http://localhost:8080/deleteCustomer/100
	// http://localhost:8080/deleteCustomer/1000
	
	@RequestMapping(value = "deleteCustomer/{cid}",method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable("cid") int cid) {
		return customerService.deleteCustomerInfo(cid);
	}
	// http://localhost:8080/updateCustomer  data as {"cid":100,"age":34}
	@RequestMapping(value = "updateCustomer",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCustomer(@RequestBody Customer customer) {	//@RequestBody annotation is use to extract json data from request body 
		System.out.println(customer);     // toString method 
		return customerService.updateCustomer(customer);
	}
	
}






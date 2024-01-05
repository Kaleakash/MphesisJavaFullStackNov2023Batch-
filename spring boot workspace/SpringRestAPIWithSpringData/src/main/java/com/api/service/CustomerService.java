package com.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Customer;
import com.api.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public String storeCustomer(Customer customer) {
		Optional<Customer> result = customerRepository.findById(customer.getCid());
		if(result.isPresent()) {
			return "Customer id must be unique";
		}else {
			customerRepository.save(customer);
			return "Customer details stored successfully";
		}
	}
	
	public List<Customer> findAllCustomer() {
		return customerRepository.findAll();
	}
	
	public String deleteCustomerInfo(int cid) {
		Optional<Customer> result = customerRepository.findById(cid);
		if(result.isPresent()) {
			customerRepository.deleteById(cid);
			return "Customer details deleted successfully";
		}else {
			
			return "Customer not present";
		}
	}
}

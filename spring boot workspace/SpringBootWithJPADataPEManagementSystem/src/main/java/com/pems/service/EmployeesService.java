package com.pems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pems.entity.Employees;
import com.pems.repository.EmployeesRepository;

@Service
public class EmployeesService {

	
	@Autowired
	EmployeesRepository employeeRepository;
	
	public String storeEmployees(Employees employee) {
		Optional<Employees> result	= employeeRepository.findById(employee.getId());
		if(result.isPresent()) {
			return "Employee id must be unique";
		}else {
			employeeRepository.save(employee);
			return "Employee record stored successfully";
		}
	}
	
	public List<Employees> findAllEmployees() {
		return employeeRepository.findAll();
	}
	
	
}

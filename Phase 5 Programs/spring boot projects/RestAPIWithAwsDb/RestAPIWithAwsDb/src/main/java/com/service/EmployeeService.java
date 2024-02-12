package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public String storeEmployee(Employee emp) {
		employeeRepository.save(emp);
		return "Employee record stored";
	}
	
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
}

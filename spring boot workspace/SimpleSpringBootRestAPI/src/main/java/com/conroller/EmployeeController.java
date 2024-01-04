package com.conroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// http://localhost:8080/employee
	@RequestMapping(value = "employee",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeInfo() {
		Employee emp = new Employee(100, "Ravi", 12000);
		return emp;
	}
	
	// http://localhost:8080/employees
	
	@RequestMapping(value = "employees",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeInfo(){
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Ravi", 15000));
		listOfEmp.add(new Employee(101, "Ramesh", 18000));
		listOfEmp.add(new Employee(102, "Lokesh", 19000));
		listOfEmp.add(new Employee(103, "Raju", 25000));
		return listOfEmp;
	}
}

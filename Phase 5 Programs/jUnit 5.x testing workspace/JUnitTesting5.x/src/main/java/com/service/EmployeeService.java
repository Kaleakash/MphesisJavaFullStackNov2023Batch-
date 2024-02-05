package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {
	
	public Employee getEmployee() {
		// we can retrieve employee details from database. 
		Employee emp1 = new Employee(100, "Ravi", 12000);
		return emp1;
	}
	
	public List<Employee> getAllEmployee() {
		// we can retrieve employee details from database. 
		Employee emp1 = new Employee(100, "Ravi", 12000);
		Employee emp2 = new Employee(101, "Raju", 16000);
		Employee emp3 = new Employee(102, "Ramesh", 14000);
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
	
	public float updateEmployee(Employee emp) {
		// condition 
		return emp.getSalary()+5000;
	}
	
	public Employee getEmployeeObject(int id, String name, float salary) {
		Employee emp1 = new Employee(id, name, salary);
		return emp1;
	}
}

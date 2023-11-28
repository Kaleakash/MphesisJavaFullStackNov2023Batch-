package com.service;

import com.bean.Employee;

public class EmployeeService {
	Employee emp = new Employee();
	
	public void disEmployeeInfo() {
		//System.out.println("id "+emp.id);		private 
		//System.out.println("name "+emp.name); default 
		//System.out.println("salary "+emp.salary); protected. 
		System.out.println("designation "+emp.designation);	// we can access. public 
	}
}

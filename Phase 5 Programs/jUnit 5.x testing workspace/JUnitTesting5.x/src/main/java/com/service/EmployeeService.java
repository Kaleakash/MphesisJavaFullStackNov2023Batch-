package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {
	Employee emp1 = new Employee(100, "Ravi", 12000);
	Employee emp2 = new Employee(101, "Raju", 16000);
	Employee emp3 = new Employee(102, "Ramesh", 14000);
	List<Employee> listOfEmp = new ArrayList<>();
	public EmployeeService() {
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
	}
	public Employee getEmployee() {
		// we can retrieve employee details from database. 
		Employee emp1 = new Employee(100, "Ravi", 12000);
		return emp1;
	}
	public List<Employee> getAllEmployee() {
		// we can retrieve employee details from database. 
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
	public boolean deleteEmployeeById(int id) {
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			if(emp.getId()==id) {
				li.remove();
				return true;
			}
		}
		return false;
	}
}

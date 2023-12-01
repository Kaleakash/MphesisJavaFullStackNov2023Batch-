package com;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("how many record do you want to store");
	int n = sc.nextInt();
	Employee employees[]=new Employee[n];	// array is known as fixed memory 
	System.out.println("Plz enter all employee details one by one");
	for(int i=0;i<n;i++) {
		employees[i]=new Employee();
		System.out.println("Enter the id");
		int id = sc.nextInt();
		employees[i].setId(id);
		System.out.println("Enter the name");
		String name = sc.next();
		employees[i].setName(name);
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		employees[i].setSalary(salary);
	}
	// business logic
	System.out.println("All employee records");
	
	for(Employee emp:employees) {
		System.out.println(emp);    // toString()
	}
	
	}

}

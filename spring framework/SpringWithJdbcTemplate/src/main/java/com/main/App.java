package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class App {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String con = "";
	int id;
	String name;
	float salary;
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	Employee emp = (Employee)ac.getBean("employee");
	String result;
		do {
			System.out.println("1:Add 2: Update 3: Delete");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("Enter the name");
					name = sc.next();
					System.out.println("Enter the salary");
					salary = sc.nextFloat();
					emp.setId(id);
					emp.setName(name);
					emp.setSalary(salary);
					result = es.storeEmployee(emp);
					System.out.println(result);
				break;
			case 2:System.out.println("Enter the id");
			id = sc.nextInt();
			
			System.out.println("Enter the salary");
			salary = sc.nextFloat();
			emp.setId(id);
			
			emp.setSalary(salary);
			result = es.updateEmployee(emp);
			System.out.println(result);
					break;
			case 3:System.out.println("Enter the id");
			id = sc.nextInt();
			
			result = es.deleteEmployee(id);
			System.out.println(result);
			break;
			default:System.out.println("Wrong choice");
				break;
			}
			
			System.out.println("do you want to continue?");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));

	}

}

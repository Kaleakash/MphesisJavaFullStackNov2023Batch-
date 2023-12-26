package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
			System.out.println("1:Add 2: Update 3: Delete 4: Find Employee in map 5 : Find Employee in List");
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
			case 4:System.out.println("All employee in map");
			     List<Map<String, Object>> ll = es.findEmployeeInMapFormat();
			     Iterator<Map<String, Object>> li = ll.iterator();
			     while(li.hasNext()) {
			    	 Map<String, Object> mm = li.next();
			    	 System.out.println(mm);		// in string format as map 
			     }
			     break;
			case 5:System.out.println("All Employee in list");
			     List<Employee> ll1 = es.findEmployeeInListFormat();
			     Iterator<Employee> li1 = ll1.iterator();
			     while(li1.hasNext()){
			    	Employee emp1 =  li1.next();
			    	System.out.println(emp1);
			     }
			     break;
			default:System.out.println("Wrong choice");
				break;
			}
			
			System.out.println("do you want to continue?");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));

	}

}

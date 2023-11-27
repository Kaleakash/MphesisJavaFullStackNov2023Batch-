package com;

import java.util.Scanner;

public class Employee {
private int id;
private String name;
private float salary;
	Scanner sc = new Scanner(System.in);
void readEmp() {
	System.out.println("Enter the id");
	id = sc.nextInt();
	System.out.println("Enter the name");
	name = sc.next();
	System.out.println("Enter the salary");
	salary = sc.nextFloat();
}
void calSalary() {
	float hra = salary*0.10f;		// hra = 10%
	float da = salary *0.05f;		// da = 5%
	float pf = salary* 0.07f;		// pf = 7%
	salary = salary+hra +da-pf;
}
void disEmp() {
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
}

}

package com;

public class Employee {
private int id;
private String name;
private float salary;

	public Employee() {
		System.out.println("Object created...");
	}

	public void display() {
		System.out.println("Employee class method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

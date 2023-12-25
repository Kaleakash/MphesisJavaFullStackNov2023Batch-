package com;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;			// employee has a address. 
	public Employee() {
		System.out.println("Object created using empty");
	}
	
	public Employee(int id, String name, float salary) {
		System.out.println("object created using parameter");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee class method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	
}

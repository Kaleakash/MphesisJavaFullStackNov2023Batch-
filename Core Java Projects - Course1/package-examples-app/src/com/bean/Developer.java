package com.bean;

public class Developer extends Employee{

	public void disDev() {
		//System.out.println("id "+id);		id is private 
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		System.out.println("designation "+designation);
	}
}

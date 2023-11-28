package com.entity;

import com.bean.Employee;

public class Manager extends Employee{

	public void disMgr() {
		//System.out.println("id "+id);		id private 
		//System.out.println("name "+name);	name default 
		System.out.println("salary "+salary);
		System.out.println("designation "+designation);
	}

}

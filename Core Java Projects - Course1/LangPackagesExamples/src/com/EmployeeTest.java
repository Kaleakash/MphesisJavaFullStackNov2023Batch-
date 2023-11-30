package com;

public class EmployeeTest {

	public static void main(String[] args) {
//	Employee emp1 = new Employee();
//	emp1.setId(100);
//	emp1.setName("Ravi");
//	emp1.setSalary(12000);
//	
//	Employee emp2 = new Employee(101, "Raju", 14000);
//	
//	System.out.println("id is "+emp1.getId());
//	System.out.println("name is "+emp1.getName());
//	System.out.println("salary is "+emp1.getSalary());
//	
//	System.out.println(emp2);	// it will call toString method automatically. 
		
		Employee emp1 = new Employee(100, "Ravi", 12000);	// different memory 
	Employee emp2 = new Employee(101, "Rajesh", 14000);		// different memory 
		Employee emp3 = new Employee(100, "Ravi", 13000);	// different memory 
	Employee emp4 = emp1;			// same memory two reference
	if(emp1.equals(emp3)) {
		System.out.println("Equal ");
	}else {
		System.out.println("Not Equal");
	}
	
	}

}

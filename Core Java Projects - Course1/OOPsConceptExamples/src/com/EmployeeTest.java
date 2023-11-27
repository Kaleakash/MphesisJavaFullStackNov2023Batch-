package com;

public class EmployeeTest {

	public static void main(String[] args) {
	Employee emp = new Employee();
		//emp.id=100;
		//emp.name="Ravi";
		//emp.salary=-12000;
		emp.setValue(100, "Ravi", -12000);
		emp.dis();

		Customer c1 = new Customer();
		c1.setCid(100);
		c1.setName("Ravi");
		c1.setAge(21);
		
		Customer c2 = new Customer(101,"Lokesh",23);
		
		System.out.println("Customer info");
		System.out.println("CId is "+c1.getCid());
		System.out.println("CName is "+c1.getName());
		System.out.println("CAge is "+c1.getAge());
		
		System.out.println("Customer info");
		System.out.println("CId is "+c2.getCid());
		System.out.println("CName is "+c2.getName());
		System.out.println("CAge is "+c2.getAge());
	}

}

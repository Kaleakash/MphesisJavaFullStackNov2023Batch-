package com;

public class EmployeeTest {

	public static void main(String[] args) {
	Employee emp = new Employee();
		//emp.id=100;
		//emp.name="Ravi";
		//emp.salary=-12000;
		emp.setValue(100, "Ravi", -12000);
		emp.dis();

	}

}

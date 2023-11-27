package com;

public class Manager extends Employee{
private int numberOfEmp;
void readMgr() {
	readEmp();
	System.out.println("Enter the number of emp working under him");
	numberOfEmp = sc.nextInt();
}
void disMgr() {
	disEmp();
	System.out.println("Number of employee working under him"+numberOfEmp);
}
}

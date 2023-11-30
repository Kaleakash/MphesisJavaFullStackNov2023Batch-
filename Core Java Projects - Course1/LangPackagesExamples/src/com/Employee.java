package com;

import java.util.Objects;

public class Employee {
private int id;
private String name;
private float salary;
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
public Employee() {
	super();
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
//@Override
//public String toString() {
//	return "Employee class object";
//}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return id == other.id && Objects.equals(name, other.name)
			&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
}

//@Override
//public boolean equals(Object obj) {
//	Employee emp = (Employee)obj;		// type casting or downlevel type casting. 
//	if(this.id==emp.id) {
//		return true;
//	}else {
//		return false;
//	}
//}


}

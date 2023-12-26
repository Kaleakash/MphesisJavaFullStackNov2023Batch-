package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component							//<bean class="com.Employee"></bean>
public class Employee {					// id is employee 
@Value(value = "100")
private int id;
@Value(value = "Ravi")
private String name;
@Value(value = "34000")
private float salary;

@Autowired						// this annotation for complex property 
private Address add;
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
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
}

}

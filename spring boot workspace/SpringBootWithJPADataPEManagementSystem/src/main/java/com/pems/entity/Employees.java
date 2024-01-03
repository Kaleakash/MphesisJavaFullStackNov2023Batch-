package com.pems.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
@Id
private int id;
private String name;
private int age;
private int pid;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
@Override
public String toString() {
	return "Employees [id=" + id + ", name=" + name + ", age=" + age + ", pid=" + pid + "]";
}
public Employees() {
	super();
	// TODO Auto-generated constructor stub
}
public Employees(int id, String name, int age, int pid) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.pid = pid;
}

}

package com.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
private int cid;
private String cname;
private int age;
@OneToOne(cascade = CascadeType.ALL)// to do all crud operation on address 
@JoinColumn(name = "addid")
private Address add;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", age=" + age + ", add=" + add + "]";
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cid, String cname, int age, Address add) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.age = age;
	this.add = add;
}

}

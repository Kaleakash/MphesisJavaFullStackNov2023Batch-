package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int addid;
private String city;
private String state;
public int getAddid() {
	return addid;
}
public void setAddid(int addid) {
	this.addid = addid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [addid=" + addid + ", city=" + city + ", state=" + state + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int addid, String city, String state) {
	super();
	this.addid = addid;
	this.city = city;
	this.state = state;
}


}

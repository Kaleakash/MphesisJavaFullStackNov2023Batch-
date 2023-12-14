package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
@Id
private int addid;
private String city;
private String state;
private Integer eid;
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

public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
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

}

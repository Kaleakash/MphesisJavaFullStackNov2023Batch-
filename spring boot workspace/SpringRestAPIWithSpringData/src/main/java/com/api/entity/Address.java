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
private String stte;
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
public String getStte() {
	return stte;
}
public void setStte(String stte) {
	this.stte = stte;
}

}

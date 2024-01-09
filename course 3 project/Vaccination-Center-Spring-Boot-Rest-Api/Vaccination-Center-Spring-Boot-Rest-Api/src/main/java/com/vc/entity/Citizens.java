package com.vc.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Citizens {
@Id
private int cid;
private String cname;
private int age;
private String gender;
private String phonenumber;
private String city;
private String state;
private String pincode;
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name = "cid")
private List<VaccinationCenter> listofvc;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
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
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public List<VaccinationCenter> getListofvc() {
	return listofvc;
}
public void setListofvc(List<VaccinationCenter> listofvc) {
	this.listofvc = listofvc;
}

@Override
public String toString() {
	return "Citizens [cid=" + cid + ", cname=" + cname + ", age=" + age + ", gender=" + gender + ", phonenumber="
			+ phonenumber + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}
public Citizens() {
	super();
	// TODO Auto-generated constructor stub
}
public Citizens(int cid, String cname, int age, String gender, String phonenumber, String city, String state,
		String pincode, List<VaccinationCenter> listofvc) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.age = age;
	this.gender = gender;
	this.phonenumber = phonenumber;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	this.listofvc = listofvc;
}

}

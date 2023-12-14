package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Projects {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)		// auto_increment 
private int pid;
private String pname;
@OneToMany
@JoinColumn(name="pid")			// FK in employee table 
private List<Employees> listOfEmp;
public Projects(int pid, String pname, List<Employees> listOfEmp) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.listOfEmp = listOfEmp;
}
public Projects() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public List<Employees> getListOfEmp() {
	return listOfEmp;
}
public void setListOfEmp(List<Employees> listOfEmp) {
	this.listOfEmp = listOfEmp;
}

}

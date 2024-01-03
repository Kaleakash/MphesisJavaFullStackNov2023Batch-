package com.pems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Scope("prototype")
@Component
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
private String pname;
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
@Override
public String toString() {
	return "Project [pid=" + pid + ", pname=" + pname + "]";
}
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int pid, String pname) {
	super();
	this.pid = pid;
	this.pname = pname;
}

}

package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainer {
@Id
private int tid;
private String tname;

@OneToMany(cascade = CascadeType.ALL)		// 						// one trainer handle more than one students. 
@JoinColumn(name = "tsid")			// join column is use to link student class fk column 
private List<Student> listOfStudents;
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}

public List<Student> getListOfStudents() {
	return listOfStudents;
}

public void setListOfStudents(List<Student> listOfStudents) {
	this.listOfStudents = listOfStudents;
}

public Trainer(int tid, String tname) {
	super();
	this.tid = tid;
	this.tname = tname;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", listOfStudents=" + listOfStudents + "]";
}

}

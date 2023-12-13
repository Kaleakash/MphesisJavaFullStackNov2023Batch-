package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
@Id
private int tid;
private String tname;
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
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
	return "Trainer [tid=" + tid + ", tname=" + tname + "]";
}

}

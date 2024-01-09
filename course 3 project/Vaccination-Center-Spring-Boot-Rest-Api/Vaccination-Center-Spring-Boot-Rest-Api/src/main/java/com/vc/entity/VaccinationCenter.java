package com.vc.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccinationcenter")
public class VaccinationCenter {
@Id
private int vcid;
private String hcname;
private String vcname;
private LocalDateTime	vdate;
private Integer cid;
public int getVcid() {
	return vcid;
}
public void setVcid(int vcid) {
	this.vcid = vcid;
}
public String getHcname() {
	return hcname;
}
public void setHcname(String hcname) {
	this.hcname = hcname;
}
public String getVcname() {
	return vcname;
}
public void setVcname(String vcname) {
	this.vcname = vcname;
}
public LocalDateTime getVdate() {
	return vdate;
}
public void setVdate(LocalDateTime vdate) {
	this.vdate = vdate;
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
@Override
public String toString() {
	return "VaccinationCenter [vcid=" + vcid + ", hcname=" + hcname + ", vcname=" + vcname + ", vdate=" + vdate
			+ ", cid=" + cid + "]";
}
public VaccinationCenter() {
	super();
	// TODO Auto-generated constructor stub
}
public VaccinationCenter(int vcid, String hcname, String vcname, LocalDateTime vdate, Integer cid) {
	super();
	this.vcid = vcid;
	this.hcname = hcname;
	this.vcname = vcname;
	this.vdate = vdate;
	this.cid = cid;
}

}

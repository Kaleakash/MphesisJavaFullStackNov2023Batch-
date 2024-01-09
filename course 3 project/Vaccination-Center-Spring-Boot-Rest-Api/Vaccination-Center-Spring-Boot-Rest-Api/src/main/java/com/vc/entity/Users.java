package com.vc.entity;

import jakarta.persistence.Entity;		//javax. package replace by jakarta in spring boot 3
import jakarta.persistence.Id;

@Entity
public class Users {
@Id
private String emailid;
private String password;
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}

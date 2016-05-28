package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetail")
public class UserDetail {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

private String uname;
private String upass;
private String urole;
public UserDetail()
{}
public UserDetail(int id, String uname, String upass, String urole) {
	super();
	this.id = id;
	this.uname = uname;
	this.upass = upass;
	this.urole = urole;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public String getUrole() {
	return urole;
}
public void setUrole(String urole) {
	this.urole = urole;
}


}

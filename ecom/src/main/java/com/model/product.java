package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
String desc;
int price;
public product()
{id=0;
name=null;
desc=null;
price=0;
	}
public product(int id, String name, String desc, int price) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "product[ id="+id+", productname="+name+
			",description="+ desc+",price="+price+"]";
}
 
}


package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //maps this class with the Customer table
 //maps all instance variables with table cols
@Table(name="CUSTOMER_DATA") //optional (default table name is class name)
public class Customer {
	@Id//for PK (its mandatory)
 private int custId;
	@Column(name="cname",length = 50) //optional
 private String custName;
 private String address;
 @Column(name="contactNo",unique = true)
 private int phoneNo;
 
public int getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
 
 
}

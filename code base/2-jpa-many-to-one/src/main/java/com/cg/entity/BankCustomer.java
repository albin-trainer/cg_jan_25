package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BankCustomer {
	@Id
private int accNo;
private String custName;
private float bankBalance;
@ManyToOne
//@JoinColumn(name="ifsccode")
private Bank bank;

public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public float getBankBalance() {
	return bankBalance;
}
public void setBankBalance(float bankBalance) {
	this.bankBalance = bankBalance;
}
public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}


}

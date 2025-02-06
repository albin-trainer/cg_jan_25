package com.cg;

public class SavingsAccRepoImpl  implements AccountRepository{
	public SavingsAccRepoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor savings");
	}
	public String credit(float amt) {
		//update the DB
		return "Hi your salary of "+amt+" credited in ur savings Account";
	}
}

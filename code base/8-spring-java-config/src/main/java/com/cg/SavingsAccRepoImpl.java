package com.cg;
import org.springframework.stereotype.Component;
@Component
public class SavingsAccRepoImpl  implements AccountRepository{
	public SavingsAccRepoImpl() {
		System.out.println("constructor savings");
	}
	public String credit(float amt) {
		//update the DB
		return "Hi your salary of "+amt+" credited in ur savings Account";
	}
}

package com.cg;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl  implements AccountService{
	@Autowired
	private AccountRepository accRepo;
	public AccountServiceImpl() {
		System.out.println("constructor acc service");
	}
	/*@Autowired
	public void setAccRepo(AccountRepository accRepo) {
		System.out.println("setter");
		this.accRepo = accRepo;
	}*/
	public String creditService(float amt) {
		//calling repository
		return accRepo.credit(amt);
	}
}

package com.cg;
public class AccountServiceImpl  implements AccountService{
	private AccountRepository accRepo;
	public AccountServiceImpl() {
		System.out.println("constructor acc service");
	}
	public void setAccRepo(AccountRepository accRepo) {
		System.out.println("setter");
		this.accRepo = accRepo;
	}
	public String creditService(float amt) {
		//calling repository
		return accRepo.credit(amt);
	}
}

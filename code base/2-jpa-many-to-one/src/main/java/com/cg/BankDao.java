package com.cg;

import java.util.List;

import com.cg.entity.Bank;
import com.cg.entity.BankCustomer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
public class BankDao {
static EntityManagerFactory emf=
Persistence.createEntityManagerFactory("jpaPU");
	public static void main(String[] args) {
System.out.println("test table creation");
//addNewBank();
 //addBankCustomer("HDFC0012");
//readAllCustomersBalGreaterThan(200000);

//searchCustomersByIfsc("HDFC0012");
//searchCustomerByAccountNo(8869);
searchBankByIfsc("HDFC0012");
	}
  static void searchBankByIfsc(String ifsc) {
		EntityManager em=emf.createEntityManager();
		Bank b=em.find(Bank.class, ifsc);
		if(b!=null) {
			System.out.println(b.getBankName());
			System.out.println(b.getBranch());
		}
	}
static void searchCustomerByAccountNo(int accNo) {
		EntityManager em=emf.createEntityManager();
	BankCustomer c=em.find(BankCustomer.class, accNo);
	if(c!=null) {
		System.out.println("Acc No "+c.getAccNo());
		System.out.println("Acc holder name : "+c.getCustName());
		System.out.println("Bank balance : "+c.getBankBalance());
		Bank b=c.getBank();
		System.out.println("Bank Name : "+b.getBankName());
		System.out.println("Bank branch : "+b.getBranch());
	}
	}
private static void searchCustomersByIfsc(String ifscCode) {
	EntityManager em=emf.createEntityManager();
	//parameterized query ....
	String jpql="select c from BankCustomer c where c.bank.ifscCode= :ifsc";
	TypedQuery<BankCustomer> q=em.createQuery(jpql, BankCustomer.class);
	q.setParameter("ifsc", ifscCode); //binding the param
	
	List<BankCustomer> list=q.getResultList();
	list.forEach(c->
	System.out.println(c.getCustName()+" "+c.getBankBalance()+" "+c.getBank().getBankName()));	
	}
static void readAllCustomersBalGreaterThan(float balanceAmt) {
	EntityManager em=emf.createEntityManager();
	//parameterized query ....
	String jpql="select c from BankCustomer c where c.bankBalance > :amt";
	TypedQuery<BankCustomer> q=em.createQuery(jpql, BankCustomer.class);
	q.setParameter("amt", balanceAmt); //binding the param
	
	List<BankCustomer> list=q.getResultList();
	list.forEach(c->
	System.out.println(c.getCustName()+" "+c.getBankBalance()+" "+c.getBank().getBankName()));
}
	 static void addBankCustomer(String ifscCode) {
		 
	EntityManager em=emf.createEntityManager();
	Bank bank=em.find(Bank.class, ifscCode);
	if(bank!=null) {
		em.getTransaction().begin();
		BankCustomer c=new BankCustomer();
		c.setAccNo(8869);
		c.setCustName("Varshini");
		c.setBankBalance(300000);
		c.setBank(bank);
		em.persist(c);
		em.getTransaction().commit();
		System.out.println("Added :)");
	}
	else {
		//throw exception
		System.out.println("invalid ifsccode");
	}
	}

	static void addNewBank() {
		Bank bank=new Bank();
		bank.setIfscCode("CNRB009");
		bank.setBankName("Canara");
		bank.setBranch("Bangalore");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(bank);
		em.getTransaction().commit();
		System.out.println("Bank added");
		em.close();
	}
}

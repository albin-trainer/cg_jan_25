package com.cg;
import java.util.List;
import java.util.function.Consumer;

import com.cg.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
public class Main {
	//reads META-INF/persistence.xml
	static EntityManagerFactory emf=
	Persistence.createEntityManagerFactory("jpaPU");
	public static void main(String[] args) {
		System.out.println("Hello ....");
		//addNewCustomer();
		//searchCustomerById(107);
		allCustomers();
	}
	 static void allCustomers() {
	EntityManager em=emf.createEntityManager();
	String jpql="select c from Customer c"; //here c is alias name of Customer
	
	TypedQuery<Customer> q=  em.createQuery(jpql, Customer.class);
	
	 List<Customer>clist=  q.getResultList();
	 Consumer<Customer> consumer=
			 c->System.out.println(c.getCustId()+" "+c.getCustName()+" "+c.getAddress());
	 clist.forEach(consumer);
	 em.close();
	}
	static void searchCustomerById(int cid) {
		EntityManager em=emf.createEntityManager();
		Customer c=em.find(Customer.class, cid); //manged state
		if(c!=null) {
			System.out.println("Name is "+c.getCustName()+" address is "+c.getAddress());
		}
		else
			System.out.println("Record not found ...");
		em.close();
	}
	static void addNewCustomer() {
		Customer c1=new Customer();
		c1.setCustId(105);
		c1.setCustName("Chandu");
		c1.setAddress("Hyd");
		c1.setPhoneNo(98775689);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();//start the transaction
		em.persist(c1); //saving customer in Database
		em.getTransaction().commit(); // transaction closed
		System.out.println("ADDED :)");
		em.close();
		
	}
}

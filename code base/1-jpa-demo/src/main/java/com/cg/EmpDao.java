package com.cg;

import com.cg.entity.Address;
import com.cg.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class EmpDao {
	static EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("jpaPU");
	public static void main(String[] args) {
System.out.println("Embeddable Demo");
	//addNewEmployee();
 // searchEmployee(101);
	//updateEmpName(101, "Raj Kumar ....");
	deleteEmp(101);
	}
	static void updateEmpName(int eid,String newName) {
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class, eid); //managed state
		if(e!=null) {
			em.getTransaction().begin();
			e.setEmpName(newName);
			em.getTransaction().commit();
			System.out.println("updated ....");
		}
	}
	static void deleteEmp(int eid) {
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class, eid); //managed state
		if(e!=null) {
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			System.out.println("Deleted ...");
		}
	}
	private static void searchEmployee(int eid) {
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class, eid);
		if(e!=null) {
			System.out.println("Name : "+e.getEmpName());
			Address a=e.getAddress();
			System.out.println("Door No : "+a.getDoorNo());
			System.out.println("Place name "+a.getPlaceName());
			System.out.println("Pin code : "+a.getPinCode());
		}
	}
	static void addNewEmployee() {
		Employee e=new Employee(); //transient state
		e.setEmpId(102);
		e.setEmpName("Karthik");
		Address a=new Address();
		a.setDoorNo("A-101");
		a.setPlaceName("Bangalore");
		a.setPinCode(989834);
		e.setAddress(a);
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(e); //managed /persistent state
		e.setEmpName("Karthick pai");
		em.getTransaction().commit(); //Detached ....
		e.setEmpName("abcd");
		System.out.println("Added :)");
		em.close();
		
	}
}

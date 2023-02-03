package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aniket");
		   EntityManager entityManager=entityManagerFactory.createEntityManager();
		   EntityTransaction entityTransaction=entityManager.getTransaction();
		   
		   Pan pan = new Pan();
//		   pan.setId(1); 
		   pan.setPanno("23456P891"); 
		   
		   Person person = new Person();
		   person.setName("milind"); 
		   person.setDob("14/08/1988");
		   person.setPan(pan);
		   
		   entityTransaction.begin();
		   entityManager.persist(person);
		   entityManager.persist(pan);
		   entityTransaction.commit();
		   
	}

}

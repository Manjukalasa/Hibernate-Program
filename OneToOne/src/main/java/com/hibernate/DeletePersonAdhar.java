package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePersonAdhar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		AdharCard adharCard=entityManager.find(AdharCard.class, 12345);
		
		if(adharCard!=null)
		{
			entityTransaction.begin();
			entityManager.remove(adharCard);  //Delete the data
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Data Already Deleted");
		}
	}
}
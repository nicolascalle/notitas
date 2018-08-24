package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

public class Runner {

	public static void main(String[] args) {
		
		//new Fixture().run();
		
		
//		EntityTransaction transaction = em.getTransaction();
//		transaction.begin();
//		Tarea tarea= new Tarea(new Date(), "notitas");
//		em.persist(tarea);
//		transaction.commit();
		
		EntityManager em = PerThreadEntityManagers.getEntityManager();

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			Tarea tarea = em.find(Tarea.class,new Long(1));
			tarea.setEnunciado("otrotp");
			transaction.commit();}
		catch(Exception e) {
			transaction.rollback();
		}
	}

}
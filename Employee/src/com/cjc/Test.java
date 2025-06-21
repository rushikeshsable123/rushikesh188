package com.cjc;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		e.setRollno(1);
		e.setName("abc");
		
	//create object of SessionFactory
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.persist(e);
		
		session.beginTransaction().commit();
	}

}

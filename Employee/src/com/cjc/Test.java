package com.cjc;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		e.setRollno(1);
		e.setName("abc");

		Employee1 e1 = new Employee1();
		e1.setRollno(2);
		e1.setName("xyz");
		
		
	//create object of SessionFactory
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.persist(e);
		
		session.beginTransaction().commit();
	}

}

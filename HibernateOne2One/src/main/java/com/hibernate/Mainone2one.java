package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainone2one {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session se = factory.openSession();
		Transaction tx = se.beginTransaction();
		Que q = new Que();
		q.setId(1);
		q.setQue_Name("What is Hibernate?");
		
		Que q1 = new Que();
		q1.setId(2);
		q1.setQue_Name("What is java?");
		
		Ans an = new Ans();
		an.setAns_Id(101);
		an.setAns_Solution("Hibernate is an object-relational mapping tool for java");		
		q.setAnsID(an);
		
		Ans an1 = new Ans();
		an1.setAns_Id(102);
		an1.setAns_Solution("Java is a programming language");		
		q1.setAnsID(an1);
			
		se.save(q);
		se.save(an);
		se.save(an1);
		se.save(q1);
				
		tx.commit();
		se.close();
		factory.close();
	}
}

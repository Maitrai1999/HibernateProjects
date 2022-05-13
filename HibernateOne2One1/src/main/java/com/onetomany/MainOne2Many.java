package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOne2Many {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory Factory = new Configuration().configure().buildSessionFactory();
		Session se = Factory.openSession();

		Question qu = new Question();
		qu.setId(1);
		qu.setQu_name("What are the features of java?");
		
		Answer an = new Answer();
		an.setA_id(101);
		an.setA_name("Object-oriented");
		an.setQu(qu);

		Answer an1 = new Answer();
		an1.setA_id(102);
		an1.setA_name("Platform Independent");
		an1.setQu(qu);
		

		Answer an2 = new Answer();
		an2.setA_id(103);
		an2.setA_name("Simple");
		an2.setQu(qu);
		
	
		List<Answer> list=new ArrayList<Answer>();
		 list.add(an);
		 list.add(an1);
		 list.add(an2);
		
		 qu.setAn(list);
	
	   Transaction tx= se.beginTransaction();
	   se.save(qu);
		se.save(an);
		se.save(an1);
		se.save(an2);		
		
		tx.commit();
		se.close();
		Factory.close();
		}

	}



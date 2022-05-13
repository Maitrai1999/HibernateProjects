package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session se = factory.openSession();
		Transaction tx = se.beginTransaction();
		
		Product p = new Product();
		p.setProdID(1);
		p.setName("Java Book");
		p.setPrice(100);
		
	/*	Product p1 = new Product();
		p1.setProdID(2);
		p1.setName("Jfs");
		p1.setPrice(500);*/
		
		Product p2 = new Product();
		p2.setProdID(3);
		p2.setName("hibernate");
		p2.setPrice(600);
			
			
		Supplier s = new Supplier();
		s.setSupplierId(105);
		s.setName("maitrai");
		s.setAddress("Eluru");
		s.setPhone(1234);
		p.setSupplierID(s);
			
		
		/*Supplier s1 = new Supplier();
		s1.setSupplierId(103);
		s1.setName("yamini");
		s1.setAddress("vij");
		s1.setPhone(123456);
		p1.setSupplierID(s1);*/
		

		Supplier s2 = new Supplier();
		s2.setSupplierId(104);
		s2.setName("munni");
		s2.setAddress("hyd");
		s2.setPhone(1456);
		p2.setSupplierID(s2);
					
		
		se.save(s);
		se.save(p);
		//se.save(p1);
	//	se.save(s1);
		se.save(p2);
		se.save(s2);
	
		tx.commit();
		se.close();
		factory.close();
	}
	}



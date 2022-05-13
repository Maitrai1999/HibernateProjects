package com.hibernate.namedquery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.util.HibernateUtil;

public class Main {
public static void main(String[] args) {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session se = factory.openSession();
	
	Query query=se.getNamedQuery("findemByID");
	query.setInteger("eid", 1);
	List<Em> list=query.list();
	for(int i=0; i<list.size(); i++) {
		System.out.println("Name:"+list.get(i).getEname());
		}
	        	System.out.println(">>>>>"+list.size());
	        	if(!list.isEmpty()) {
	        		Em e=(Em) list.get(0);
	        		System.out.println(e);
	        		}

}
}
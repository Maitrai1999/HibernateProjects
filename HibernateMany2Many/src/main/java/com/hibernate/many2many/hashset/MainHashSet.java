package com.hibernate.many2many.hashset;

	import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	
	public class MainHashSet {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session se = factory.openSession();

			Prjt2 p1 = new Prjt2();
			p1.setP_Id(1);
			p1.setP_Title("finance");

			Prjt2 p2 = new Prjt2();
			p2.setP_Id(2);
			p2.setP_Title("management");
			
			Emp3 e1 = new Emp3();
			e1.setEid(11);
			e1.setEname("maitrai");

			Emp3 e2 = new Emp3();
			e2.setEid(12);
			e2.setEname("keerthi");

			HashSet<Emp3> set1 = new HashSet<Emp3>();
			HashSet<Prjt2> set2 = new HashSet<Prjt2>();
			
			set1.add(e1);
			set1.add(e2);

			set2.add(p1);
			set2.add(p2);
			e1.setProje(set2);

			p2.setEmp(set1);
			
			Transaction tx = se.beginTransaction();
			se.save(e1);
			se.save(e2);
			se.save(p1);

			se.save(p2);
			tx.commit();
			se.close();
			factory.close();
		}

	}



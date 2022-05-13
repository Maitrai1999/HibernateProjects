package com.hibernate.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEx {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		
		Emp1 e1=new Emp1(); 
     	 e1.setEid(1);
		 e1.setEname("Yamini");
		 e1.setEcity("Hyderabad");
		 e1.setEsal(350000);
		 e1.setEdeg("Project Leader");
		 
		 Emp1 e2=new Emp1(); 
     	 e2.setEid(2);
		 e2.setEname("Maitrai");
		 e2.setEcity("Banglore");
		 e2.setEsal(350000);
		 e2.setEdeg("Team Leader");
		 
		 Emp1 e3=new Emp1(); 
     	 e3.setEid(3);
		 e3.setEname("Irfana");
		 e3.setEcity("Chennai");
		 e3.setEsal(300000);
		 e3.setEdeg("Software Engg");
		 
		 Emp1 e4=new Emp1(); 
     	 e4.setEid(4);
		 e4.setEname("Keerthi");
		 e4.setEcity("Pune");
		 e4.setEsal(250000);
		 e4.setEdeg("Junior Engg");
		 
		 Emp1 e5=new Emp1(); 
     	 e5.setEid(5);
		 e5.setEname("Nisha");
		 e5.setEcity("Mumbai");
		 e5.setEsal(200000);
		 e5.setEdeg("Analyst"); 
		 
		List<Emp1> l1=new ArrayList<Emp1>();
		l1.add(e1);
	    l1.add(e2);
	    l1.add(e3);
	    l1.add(e4);
	    l1.add(e5); 
	    
		Transaction tx = ses.beginTransaction();
	    ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5); 
		
	/*	Query query = ses.createQuery("update Emp1 set ename=:name where eid=:id");
		query.setParameter("name", "Kader");
		query.setInteger("id", 5);
		int result=query.executeUpdate();
		System.out.println("emp1 updated"+result); */
		
	/*	Query query1 = ses.createQuery("delete Emp1 where eid=:id");
		query1.setInteger("id", 4);
		int result1=query1.executeUpdate();
		System.out.println("emp deleted"+result1); */
		
	/*	Query query2 = ses.createQuery("select count(eid) from Emp1");
		Iterator count = query2.iterate();
		System.out.println("No.of rows :"+count.next());
		
		Query query3 = ses.createQuery("Select max(esal) from Emp1");
		Iterator count1 = query3.iterate();
		System.out.println("Maximum id: "+count.next());
		
		Query query4 = ses.createQuery("from Emp1 where esal between 200000 and 300000 ");
		List<Emp1> list = query1.list();
		for(Emp1 ep:list)
		{
			System.out.println(" ename: " + ep.getEname() + "  " );
		} 
		
		Query query5 = ses.createQuery("from Emp1 order by ename asc ");
		List<Emp1> list1 = query1.list();
		for(Emp1 ep:list1)
		{
			System.out.println("eid: " + ep.getEid() + " ename: " + ep.getEname() + " esal: " + ep.getEsal() + " ecity: " + ep.getEcity() +  " edeg: " + ep.getEdeg());
		}
		
		Query query6 = ses.createQuery("from Emp1 order by ename asc ");
		List<Emp1> list2 = query1.list();
		for(Emp1 ep:list2)
		{
			System.out.println("eid: " + ep.getEid() + " ename: " + ep.getEname() + " esal: " + ep.getEsal() + " ecity: " + ep.getEcity() +  " edeg: " + ep.getEdeg());
		}
		
		Query query7 = ses.createQuery("from Emp1");
		List<Emp1> list3 = query1.list();
		for(Emp1 ep:list3)
		{
			System.out.println("eid: " + ep.getEid() + " ename: " + ep.getEname() + " esal: " + ep.getEsal() + " ecity: " + ep.getEcity() +  " edeg: " + ep.getEdeg());
		} */

		  tx.commit();
		ses.close();
		factory.close();
	}
}


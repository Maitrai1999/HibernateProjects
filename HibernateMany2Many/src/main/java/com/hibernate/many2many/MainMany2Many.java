package com.hibernate.many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMany2Many {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session se = factory.openSession();
			
			Project p1=new Project();
			p1.setPid(1);
			p1.setName("management");
			
			Project p2=new Project();
			p2.setPid(2);
			p2.setName("finance");
							
				
			Employee1 e1=new Employee1();
			e1.setEid(11);
			e1.setEname("maitrai");
			
			Employee1 e2=new Employee1();
			e2.setEid(12);
			e2.setEname("yamini");
					    
			List<Employee1> list1=new ArrayList<Employee1>();
			List<Project> list2=new ArrayList<Project>();
						
			list1.add(e1);
			list1.add(e2);
			list2.add(p1);
			list2.add(p2);
					
			e1.setProject(list2);
			p2.setEmployee1(list1);	
			
		  Transaction tx= se.beginTransaction();
			   se.save(e1);
			   se.save(e2);
			   se.save(p1);
		     	se.save(p2);
		     	
				tx.commit();
				se.close();
				factory.close();
				}

			}
			
			

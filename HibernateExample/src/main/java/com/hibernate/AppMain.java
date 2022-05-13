package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMain {
   
    public static void main(String[] args) {
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	
  	Session ses= factory.openSession();
	/*Employee item1=new Employee();
	item1.setId(1);
	item1.setName("Maitrai");
	item1.setCity("banglore");
	
/*	Employee item2=new Employee();
	item2.setId(2);
	item2.setName("munni");
	item2.setCity("mumbai");*/
	
	/*Employee item3=new Employee();
	item3.setId(3);
	item3.setName("maitrai");
	item3.setCity("eluru");*/
	
/*	Employee item4=new Employee();
	item4.setId(4);
	item4.setName("yamini");
	item4.setCity("hyderabad");*/
		
	//List<Employee> l1=new ArrayList<Employee>();
	//l1.add(item1);
	//l1.add(item2);
	//l1.add(item3);
	//l1.add(item4);
		
   ses.beginTransaction();
	//ses.save(item1);
	//ses.save(item2);
	//ses.save(item3);
	//ses.save(item4);
	// ses.delete(item2);

   /*  Employee e= (Employee)ses.get(Employee.class,1);
   //  ses.delete(e);
    // System.out.println("deleted successfully");
     e.setName("mike");
     System.out.println("updated Successfully");
    ses.getTransaction().commit();*/
   Query query =ses.createQuery("from Employee");
   List<Employee>l=query.list();
   for(Employee e:l)
   {
	   System.out.println("Employee id:"+e.getId()+",Employee Name:"+e.getName()+",Employee City:"+e.getCity());
   }
          ses.getTransaction().commit();
          
    // ses.update(item1);
    ses.close();
	//factory.close();
  }	
}



    
    
  
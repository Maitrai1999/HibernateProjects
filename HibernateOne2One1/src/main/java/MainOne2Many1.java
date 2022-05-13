
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.one2many1.Learner1;
import com.hibernate.one2many1.Trainer1;

public class MainOne2Many1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory Factory = new Configuration().configure().buildSessionFactory();
		Session se = Factory.openSession();
		
	
	/*	Trainer1 tr = new Trainer1();
		tr.setT_id(1);
		tr.setT_name("pooja");
		tr.setT_sub("jfs"); 
		
		 Learner1 lr = new Learner1();
		lr.setL_id(101);
		lr.setL_name("maitrai");
		lr.setL_course("jfs");
		lr.setTr(tr);

		Learner1 lr1 = new Learner1();
		lr1.setL_id(102);
		lr1.setL_name("yamini");
		lr1.setL_course("jfs");
		lr1.setTr(tr); 
		
		Learner1 lr2 = new Learner1();
		lr2.setL_id(103);
		lr2.setL_name("keerthi");
		lr2.setL_course("jfs");
		lr2.setTr(tr); */
		
	/*    Learner1 lr3 = new Learner1();
		lr3.setL_id(104);
		lr3.setL_name("irfana");
		lr3.setL_course("jfs");
		lr3.setTr(tr); */
	
			
		List<Learner1> list=new ArrayList<Learner1>();
		/* list.add(lr);
		 list.add(lr1);	
		 list.add(lr2);
		// list.add(lr3);
		 tr.setLr(list); */
	
	   Transaction tx= se.beginTransaction();
	   /* se.save(tr);
		se.save(lr);
		se.save(lr1);
		se.save(lr2); 
	    //se.save(lr3); */
		
		   		
		Query query = se.createQuery("from Learner1");
		List <Learner1>list1=query.list();
		for(Learner1 lr:list1)
		{
		System.out.println("lr L_id:"+lr.getL_id()+"lr L_name:"+lr.getL_name()+"lr L_course:"+lr.getL_course()); 
		
		} 
		/* Query query0 = se.createQuery("select count(l_id) from Learner1");
		Iterator count = query0.iterate();
		System.out.println("No. of rows : "+count.next()); */
	   
	   /* Query query1 = se.createQuery("Select max(l_id) from Learner1");
		Iterator count1 = query1.iterate();
		System.out.println("Maximum id: "+count1.next()); */
		
		/*Query query2 = se.createQuery("Select min(l_id) from Learner1");
		Iterator count2 = query2.iterate();
		System.out.println("Minimum id :"+count2.next()); */

		tx.commit();
		se.close();
		Factory.close();
		}

	}
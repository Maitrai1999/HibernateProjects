
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.pojo.Answ;
import com.hibernate.pojo.Ques;
import com.util.HibernateUtil;

public class Main {

		public static void main(String[] args) {

		SessionFactory Factory = HibernateUtil.getInstnce();
		Session se = Factory.openSession();

		Ques Q = new Ques();
		Q.setQues_Id(85);
		Q.setQues_Name("Hibernate?");
		
		Answ an = new Answ();
		an.setAnswId(102);
		an.setAnsw_Solution("Software");

	
		Q.setAnsw(an);

		Transaction tx = se.beginTransaction();
		se.save(an);
		se.save(Q);
		tx.commit();

		se.close();
		Factory.close();
		}
}


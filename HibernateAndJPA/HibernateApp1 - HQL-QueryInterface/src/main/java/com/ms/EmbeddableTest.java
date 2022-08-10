package com.ms;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.ms.model.Student;
import com.ms.util.HibernateUtil;
	public class EmbeddableTest {

		public static void main(String[] args) {
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();  // insert,delete,update,get 
			
			session.beginTransaction();  //insert, delete,update 
			
			Company c=new Company();
			c.setId(101);
			c.setName("TCS");
			c.setAddress("INDIA");
			ContactPerson cp=new ContactPerson();
			cp.setFirstName("Van");
			cp.setLastName("Ram");
			cp.setPhone("9878986756");
			c.setContactPerson(cp);
			
			
			session.save(c);
			session.getTransaction().commit();
			session.close();       //4 detached 
			
			

		}

	}

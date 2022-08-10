package com.ms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ms.model.Course;
import com.ms.util.HibernateUtil;

public class CourseTest {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();  
		Course c1=new Course();
		c1.setName("spring");
		c1.setDuration(3);
		Course c2=new Course();
		c2.setName("hibernate");
		c2.setDuration(3);
		Course c3=new Course();
		c3.setName("rest");
		c3.setDuration(3);
		
	    session.beginTransaction();
	    session.save(c1);
	    session.save(c2);
	    session.persist(c3);
	    session.getTransaction().commit();
	    session.close();
	}

}

package com.ms;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ms.model.Student;
import com.ms.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();  // insert,delete,update,get 
		Student student=new Student();
		student.setId("s-101"); //p-101,p-102
		student.setName("raj105");
		student.setEmail("raj105@gmail.com"); //1 transcient
		
		//Session session1=sf.getCurrentSession();
		session.beginTransaction();  //insert, delete,update 
		
		session.persist(student);  //void                       //2 persistent /managed 
		//Serializable id=session.save(student);   //insert
		//System.out.println(id);
		
		try {
	//		session.remove(student);   //3.removed state
		} catch (Exception e) {
			// TODO Auto-generated catch block
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		
		session.getTransaction().commit();
		
		//session.getTransaction();
		//session.getTransaction().commit();
		
		
		//Student s1=session.get(Student.class, 102); //null, eager ,slow, return always entity object
		//no transaction is required 
		Student s1=session.load(Student.class, "s-101");//NullPointerException, lazy ,faster, proxy object
		System.out.println(s1);
		session.beginTransaction(); 
	//	s1.setEmail("rajesh@gmail.com");
	//	s1.setName("rajesh");
		//session.merge(s1);
	//	session.saveOrUpdate(s1);
	//	session.getTransaction().commit();
		session.close();       //4 detached 
		
		

	}

}

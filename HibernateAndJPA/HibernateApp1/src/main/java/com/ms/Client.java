package com.ms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ms.model.Student;
import com.ms.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Student student=new Student();
		student.setId(105);
		student.setName("raj105");
		student.setEmail("raj105@gmail.com");
		
		session.beginTransaction();
		session.save(student);   //insert
		session.getTransaction().commit();
		
		Student s1=session.get(Student.class, 102);
		System.out.println(s1);
		
		
		
		

	}

}

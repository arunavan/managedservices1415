package com.ms.ManyToOneApp;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
SessionFactory sf=HibernateUtil.getSessionFactory();
Module module = new Module();
module.setModuleId(1001);
module.setModuleName("Hibernate");

Student student1 = new Student();
student1.setStudentId(1);
student1.setStudentName("Keerthi");
student1.setModule(module);

Student student2 = new Student();
student2.setStudentId(2);
student2.setStudentName("Nikhil");
student2.setModule(module);

 		Session session=sf.openSession();
 		session.beginTransaction();
 		
 		session.save(student1);
		session.save(student2);

 		session.getTransaction().commit();
 		//tx.commit();
 		session.close();
    }
}

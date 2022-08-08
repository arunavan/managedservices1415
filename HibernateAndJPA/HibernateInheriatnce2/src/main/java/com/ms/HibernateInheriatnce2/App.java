package com.ms.HibernateInheriatnce2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sf=HibernateUtil.getSessionFactory();
       Employee employee = new Employee();
		employee.setName("John");
		employee.setSalary(5000);
		
		Manager manager = new Manager();
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		
		Session session=sf.openSession();
		session.beginTransaction();
		//Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(employee);
		session.save(manager);
		session.getTransaction().commit();
		//tx.commit();
		session.close();
		


       
    }
}

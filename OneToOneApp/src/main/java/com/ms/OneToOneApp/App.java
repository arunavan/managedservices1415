package com.ms.OneToOneApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=HibernateUtil.getSessionFactory();
        
 		Session session=sf.openSession();
 		
 		Student s=new Student();
 		//s.setStudentId(101);
 		s.setName("Ram123");
 		
 		Address address=new Address();
 		//address.setAddressId(addressId);
 		address.setCity("hyd");
 		address.setState("Telangana");
 		address.setStreet("Hitechcity");
 		address.setZipCode("500000");
 		
 		s.setAddress(address);  //o to o one student to one address
 		
 		Address address1=new Address();
 		//address.setAddressId(addressId);
 		address1.setCity("pune123");
 		address1.setState("Maharashtra123");
 		address1.setStreet("Hinzawadi");
 		address1.setZipCode("500000");
 		s.setAddress(address1);
 		session.beginTransaction();
 		//	session.save(s);
 		Student s1=session.load(Student.class, 31);
 	//	session.delete(s1);
 		s1.getAddress().setCity("Mumbai");
 		session.getTransaction().commit();
 		//tx.commit();
 		session.close();
    }
}

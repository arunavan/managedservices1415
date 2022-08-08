package com.ms.ManyToManyApp;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
SessionFactory sf=HibernateUtil.getSessionFactory();
        
 		Session session=sf.openSession();
 		session.beginTransaction();
 		
 		
      //session.save(beer);
 		session.getTransaction().commit();
      //tx.commit();
 		session.close();
    }
}

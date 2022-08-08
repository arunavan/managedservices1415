package com.ms.OnetoManyApp;

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
 		
 		SideDish dish1 = new SideDish();
		dish1.setSideDishId(1001);
		dish1.setSidedishName("chiken65");
		
		SideDish dish2 = new SideDish();
		dish2.setSideDishId(1002);
		dish2.setSidedishName("Omlet");
		
		SideDish dish3 = new SideDish();
		dish3.setSideDishId(1003);
		dish3.setSidedishName("Applo fish");
		
		Set<SideDish> mydishes= new HashSet<SideDish>();
		
		mydishes.add(dish1);
		mydishes.add(dish2);
		mydishes.add(dish3);
		
		Beer beer= new Beer();
		beer.setBeerId(1);
		beer.setBeerName("Budwiser");
		beer.setDishes(mydishes); //one - many
       session.save(beer);
 		session.getTransaction().commit();
 		//tx.commit();
 		session.close();
    }
}

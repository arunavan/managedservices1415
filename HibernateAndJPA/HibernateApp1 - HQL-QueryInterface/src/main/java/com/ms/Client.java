package com.ms;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ms.model.Student;
import com.ms.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();  // insert,delete,update,get 
		/*
		 * Student student=new Student(); student.setId("s-101"); //p-101,p-102
		 * student.setName("raj105"); student.setEmail("raj105@gmail.com"); //1
		 * transcient
		 */	
		//Session session1=sf.getCurrentSession();
		//session.beginTransaction();  //insert, delete,update 
		
		//session.persist(student);  //void                       //2 persistent /managed 
		//Serializable id=session.save(student);   //insert
		//System.out.println(id);
		
		//try {
	//		session.remove(student);   //3.removed state
	//	} catch (Exception e) {
			// TODO Auto-generated catch block
	//		session.getTransaction().rollback();
	//		e.printStackTrace();
	//	}
		
	//	session.getTransaction().commit();
		
		//session.getTransaction();
		//session.getTransaction().commit();
		
		
		//Student s1=session.get(Student.class, 102); //null, eager ,slow, return always entity object
		//no transaction is required 
	//	Student s1=session.load(Student.class, "s-101");//NullPointerException, lazy ,faster, proxy object
	//	System.out.println(s1);
	//	session.beginTransaction(); 
	//	s1.setEmail("rajesh@gmail.com");
	//	s1.setName("rajesh");
		//session.merge(s1);
	//	session.saveOrUpdate(s1);
	//	session.getTransaction().commit();
									//from Studnet , from Student s
		
		 
		 //session.beginTransaction(); 
		// Query deleteq=session.createQuery("delete from  Student s where s.id=117");
		 
		// deleteq.executeUpdate();
		// System.out.println("deleted...");
		
		 	Query qsum=session.createQuery("select count(s.id) from Student s");  
		 	List<Integer> list=qsum.list();  
		 	System.out.println(list.get(0));  

		 
			
		//	 session.beginTransaction(); //Query
			// Query q1=session.createQuery("update Student s set s.name=:name1 where s.id=:id1");
		//	 Query q1=session.createQuery("update Student s set s.name=?1 where s.id=?2");
			 
			  //namedparameters 
			// q1.setParameter("name1","raja"); 
			 //q1.setParameter("id1","104");
			 //plac eholder
		//	 q1.setParameter(1,"RAJA"); 
		//	 q1.setParameter(2,"103");
		//	  int status=q1.executeUpdate(); 
		//	  System.out.println(status);
		//	  session.getTransaction().commit(); 
			  
			  Query q=session.createQuery("from Student");  //("select s from Student s where s.id>110"); //HQL - select * from student
				//q.setFirstResult(2);
			List<Student> slist= q.list();
				 //q.setMaxResult(6);
				 for(Student s: slist) 
					 System.out.println(s);	
				 
				 System.out.println("Named query result");
				 Query nq=session.getNamedQuery("findStudentName");
				 nq.setParameter("name", "ram");
				 List<Student> slist1= nq.list();
				 for(Student s: slist1) 
					 System.out.println(s);	
		
				 
			  /*Query
			 * q2=session.createQuery("from Student"); List<Student> slist1= q2.list();
			 * //q.setMaxResult(6); System.out.println("after update"); for(Student s:
			 * slist1) System.out.println(s);
			 * 
			 */
		/*
		 * List<String> slist=q.list(); for(String s: slist) System.out.println(s);
		 */
		/*
		 * List<Object> slist=q.list(); for(Object s: slist)
		 * 
		 * 
		 * System.out.println(s);
		 */
		
		session.close();       //4 detached 
		
		

	}

}

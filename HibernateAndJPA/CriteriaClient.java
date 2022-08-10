package com.ms;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.ms.model.Course;
import com.ms.model.Student;
import com.ms.util.HibernateUtil;

public class CriteriaClient {

	
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();  
		
			Criteria c=session.createCriteria(Student.class);  //from Student  , select * from student 
		//	c.setFirstResult(2);  
		//	c.setMaxResults(6);
			
			c.add(Restrictions.eq("id","103"));// select * from where id>103
			
			c.addOrder(Order.desc("id"));  
			c.setProjection(Projections.property("email"));  
			List<String> list=c.list();
			
			for(String s: list)
				System.out.println(s);
			
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<Student> cq = cb.createQuery(Student.class);
			Root<Student> root = cq.from(Student.class);
			cq.select(root);

			Query query = session.createQuery(cq);
			List<Student> results = query.getResultList();
			
			for(Student s: results)
				System.out.println(s);
	
			cq.select(root).where(root.get("name").in("raja", "raj"));
			cq.select(root).where(root.get("email").isNotNull());
			CriteriaBuilder cb1 = session.getCriteriaBuilder();
			CriteriaQuery<Course> cq1 = cb.createQuery(Course.class);
			Root<Course> root1 = cq1.from(Course.class);
			cq1.select(root1);

			
			Query query1 = session.createQuery(cq);
			List<Student> results1 = query1.getResultList();
			for(Student s: results1)
				System.out.println(s);
	
			//cq.select(root).where(cb.eq("id", "103"));
			
	
	}
}

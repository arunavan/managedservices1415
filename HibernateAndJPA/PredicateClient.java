package com.ms;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ms.model.Student;
import com.ms.util.HibernateUtil;

public class PredicateClient {
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();  
	
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
	      CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
	      Root<Student> student = query.from(Student.class);
	      query.select(student)
	           .where(student.get("id").in(115,116,118));
	      TypedQuery<Student> typedQuery = session.createQuery(query);
	      List<Student> resultList = typedQuery.getResultList();
	     for( Student s: resultList)
	    	 System.out.println(s);
	}

}

package com.ms.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.ms.model.Student;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
		            try {
	                Configuration configuration = new Configuration();
	                Properties settings = new Properties();
	                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	                settings.put(Environment.URL, "jdbc:mysql://localhost:3307/sms");
	                 settings.put(Environment.USER, "root");
	                settings.put(Environment.PASS, "root");
	                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
	                settings.put(Environment.SHOW_SQL, "true");
	               // settings.put(Environment.FORMAT_SQL,"true");
	                settings.put(Environment.HBM2DDL_AUTO, "update");
		                configuration.setProperties(settings);
		                configuration.addAnnotatedClass(Student.class);
		             //   configuration.addAnnotatedClass(Course.class);
		            //    configuration.addAnnotatedClass(Student.class);
		                
		                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                   .applySettings(configuration.getProperties()).build();
	              sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	
	            } catch (Exception e) {
	
	            }
	
	        }
	
	        return sessionFactory;

	    }

	
	/*
	 * public static SessionFactory getSessionFactory() {
	 *  SessionFactory sf=new
	 * Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); return
	 * sf; }
	 */
}

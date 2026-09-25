package com.luminar.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.luminar.entity.Student;

public class HibernateUtil {

	private static SessionFactory sessionFactory ;
	private static Properties hibernateSettings;

//-----------------START-------------getProperties()---------------------
	private static Properties getProperties() {
		Properties settings = new Properties();
		try {
			// Hibernate settings equivalent to hibernate.cfg.xml's properties
			// Database connection settings

			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/luminar_hibernate");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "mysql");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			settings.put(Environment.SHOW_SQL, "true");

		//	settings.put(Environment.HBM2DDL_AUTO, "create-drop");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			/*
			 * thread: This session factory API returns the current session that is
			 * associated with the current thread. (If one doesn't exist, this will create
			 * one and associate it with the current thread.)
			 */
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return settings;

	}
//-----------------END-------------getProperties()---------------------	
	
//-----------------START-------------getSessionFactory()---------------------	
	public static SessionFactory getSessionFactory() {

		ServiceRegistry serviceRegistry = null;
		Configuration configuration = new Configuration();
		hibernateSettings = getProperties();// 

		if (sessionFactory == null) { // singleton design pattern
			try {

				// method =1

				/*
				 * configuration.setProperties(settings);
				 * configuration.addAnnotatedClass(Student.class);
				 * configuration.buildSessionFactory();
				 */

				// method =2

				/*
				 * configuration.setProperties(settings) .addAnnotatedClass(Student.class)
				 * .buildSessionFactory();
				 */

				// method =3
				
	configuration.setProperties(hibernateSettings).addAnnotatedClass(Student.class);
	serviceRegistry = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties())
						.build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return sessionFactory;
	}
	
//-----------------END-------------getSessionFactory()--------------------

}

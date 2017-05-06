package com.zGuindou.ProjetManager.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
	private static Session session = null;

	private static SessionFactory buildSessionFactory() {
		try {
			// Crée une unique instance de la SessionFactory à partir de hibernate.cfg.xml
			Configuration configuration = new Configuration().configure("config/hibernate.cfg.xml");	
			
			return configuration.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Problème de configuration : " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	// Renvoie une session Hibernate
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static Session openSession() {
		return (Session) sessionFactory.openSession();
	}
	
	public Session getCurrentSession() {
		return (Session) sessionFactory.getCurrentSession();
	}

	public static void shutdown() {
		// Close caches and connection pools
		if(sessionFactory != null) sessionFactory.close();
		sessionFactory = null;
	}

}
package com.renuka.typesofemployees;

import org.hibernate.Session;

import org.hibernate.cfg.Configuration;

public class SessionUtil {
	private static org.hibernate.SessionFactory sessionFactory;
	static {
		try {
        sessionFactory = new Configuration().configure(
        		"com/renuka/typeofemployee/hibernate.cfg.xml").buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private SessionUtil() {
	}
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}
}

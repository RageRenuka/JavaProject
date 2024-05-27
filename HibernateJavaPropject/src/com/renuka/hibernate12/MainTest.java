package com.renuka.hibernate12;

import org.hibernate.Session;

public class MainTest {

	public static void main(String[] args) {
	 Student std=new Student(3,"Naresh","Kumar");

			Session session = null;
					session = SessionUtil.getSession();
					session.getTransaction().begin();
					session.save(std);
					session.getTransaction().commit();
					SessionUtil.closeSession(session);

	}
	

}

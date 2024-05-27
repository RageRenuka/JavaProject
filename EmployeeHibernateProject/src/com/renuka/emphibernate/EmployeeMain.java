package com.renuka.emphibernate;

import org.hibernate.Session;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee(4444, "TejaSree", 78900, "manju@gmail.com", "Karnuool", 782473439, 153452);
		// CURD OPERTIONS
		Session session = null;
		session = SessionUtil.getSession();
		session.getTransaction().begin();
//		session.save(emp);

//		session.delete(emp);
		session.update(emp);
//	    session.persist(emp);
//	    session.persist(emp);    
//	    session.persist(emp);  

		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}

}

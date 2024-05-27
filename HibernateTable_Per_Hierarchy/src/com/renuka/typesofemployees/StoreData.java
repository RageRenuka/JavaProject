package com.renuka.typesofemployees;

import org.hibernate.Session;
public class StoreData{

	public static void main(String[] args) {
		Employee e1=new Employee(1212,"Renuka");
		  
	    Regular_Employee e2=new Regular_Employee(3001, "Mounika", 23000, 5);   
	   
	    Contract_Employee e3=new Contract_Employee(123, "Shilpa", 1000,"15 hours");    
	     
	    
	    Session session = null;
		session = SessionUtil.getSession();
		session.getTransaction().begin();
		
		session.persist(e1);    
	    session.persist(e2);    
	    session.persist(e3);  
	
		session.getTransaction().commit();
		SessionUtil.closeSession(session);	      
	    System.out.println("success");    
	}    
		
		

	}



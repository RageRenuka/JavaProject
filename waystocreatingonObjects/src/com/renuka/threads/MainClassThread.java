package com.renuka.threads;

public class MainClassThread {

	public static void main(String[] args) {
		Thread_1 t1=new Thread_1();
		Thread t11=new Thread(t1,"Renuka");
		
		Thread_2 t2=new Thread_2();
		Thread t12=new Thread(t2,"Mounika");
	
		Thread_3 t3=new Thread_3();
		Thread t13=new Thread(t3,"Deepika");
		t11.start();
		t12.start();
		t13.start();
		

	}

}

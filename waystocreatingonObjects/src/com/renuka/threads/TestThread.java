package com.renuka.threads;

public class TestThread {

	

	public static void main(String[] args) throws InterruptedException  {
		TablePrinter tb=new TablePrinter();
	MyThread1 t1=new MyThread1(5,tb);
	t1.setName("Renuka");
//	t1.run();
	t1.start();
	MyThread1 t2=new MyThread1(6,tb);
	t2.setName("Manasa");
//	t2.run();
	t2.start();
	MyThread1 t3=new MyThread1(19,tb);
	t3.setName("Jaya");
//	t3.run();
	t3.start();
	MyThread1 t4=new MyThread1(16,tb);
	t4.setName("Manoj");
//	t4.run();
	t4.start();
	t2.wait();
	}

}

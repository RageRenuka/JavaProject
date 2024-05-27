package com.renuka.threads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		MythreadOne t1=new MythreadOne();
		MyThreadTwo t2=new MyThreadTwo();
		
		Thread ta=new Thread(t1);
		Thread tb=new Thread(t2);
		
		ta.start();
		tb.start();
//		
//		t1.run();
//	
//		t2.run();
	

	}

}

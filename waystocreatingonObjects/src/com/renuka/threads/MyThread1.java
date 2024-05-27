package com.renuka.threads;

public class MyThread1 extends Thread {
	int number;
	TablePrinter tb;
	
	public MyThread1(int number,TablePrinter tb) {
		this.number=number;
		this.tb=tb;
		
	}
	public void run() {
		tb.print(number);
		
	}
	

}

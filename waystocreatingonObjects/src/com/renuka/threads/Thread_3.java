package com.renuka.threads;

public class Thread_3 implements Runnable {

	@Override
	public void run() {
		TablePrinter tb=new TablePrinter();
		tb.print(20);
		
	}

}

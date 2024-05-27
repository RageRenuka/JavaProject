package com.renuka.threads;

public class Thread_2 implements Runnable{

	@Override
	public void run() {
		TablePrinter tb=new TablePrinter();
		tb.print(17);
		
	}

}

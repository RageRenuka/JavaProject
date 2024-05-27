package com.renuka.threads;

public class TablePrinter {
 
	public synchronized   void print(int number) {
		
		for(int i=1;i<=10;i++)
		{		try {
					Thread.sleep(500);
					String currentThread=Thread.currentThread().getName();
					System.out.println("Current thread job is executing by:"+currentThread);
					if( currentThread.equals("Mounika")&& i==4) {
						Thread.currentThread().stop();
					}
					if( currentThread.equals("Renuka")&& i==6) {
						System.out.println("Thread Id:"+Thread.currentThread());
						Thread.currentThread();
						Thread.sleep(5000 );
					}
					if( currentThread.equals("Deepika")&& i==3) {
						System.out.println("Thread Id:"+Thread.currentThread());
						Thread.currentThread().setPriority(10);
					}
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			System.out.println(number+"+"+i+"="+number*i);
		}
	}
}

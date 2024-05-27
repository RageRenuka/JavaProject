package com.renuka.threads;

public class MyThreadTwo implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ThreadTwo");
		}
		}
}

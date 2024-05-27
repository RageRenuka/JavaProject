package com.renuka.threads;

public class Thread_Two  extends Thread{

	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			Resource.methodtwo();
		}
	}
}

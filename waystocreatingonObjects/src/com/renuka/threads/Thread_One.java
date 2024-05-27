package com.renuka.threads;

public class Thread_One extends Thread {
Resource resource=new Resource();
   
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		resource.methodone();
		}
	}
}

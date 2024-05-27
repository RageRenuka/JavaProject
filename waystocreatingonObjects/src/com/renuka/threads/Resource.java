package com.renuka.threads;

public class Resource {
  public void methodone() {
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		  System.out.println("methodone");
	  
  }
  public static void methodtwo() {
	  
		  System.out.println("methodTwo");
	  
  }
}

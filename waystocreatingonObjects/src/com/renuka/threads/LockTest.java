package com.renuka.threads;

public class LockTest {
 
	public static void main(String[] args) {
		Thread_One t1=new Thread_One();
		Thread_Two t2=new Thread_Two();
		t1.start();
		t2.start();
		System.out.println("Hello Every One");
	}
}

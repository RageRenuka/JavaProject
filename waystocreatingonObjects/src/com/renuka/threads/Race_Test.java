package com.renuka.threads;

public class Race_Test {

	public static void main(String[] args) throws InterruptedException {
		Bank renuka=new Bank(100001,"Renuka",5000);
		
		Bank_1 b1=new Bank_1(renuka);
		Bank_2 b2=new Bank_2(renuka);
		
//		Bank_1 b3=new Bank_1(renuka);
//		Bank_2 b4=new Bank_2(renuka);
//		
//		Bank_1 b5=new Bank_1(renuka);
//		Bank_2 b6=new Bank_2(renuka);
		b1.setName("Renuka");
		b2.setName("Mounika");
		
		 b1.start();
		 b2.start();
		
		 
//		 b3.start();
//		 b4.start();
//		 
//		 b5.start();
//		 b6.start();
		 
		 System.out.println(renuka);
		 
		 //when multiple threads act upon single resource we passed to different threads we expect unexpected result.

	}

}

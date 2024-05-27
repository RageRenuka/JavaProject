package com.firstdemo.pacakge;

public class LogicalOperator {

	public static void main(String[] args) {
		// AND (&&),OR(||),NOT(!).
		
		//AND(&&)
		int number1=100;
		int number2=200;
		int number3;
		System.out.println(number1==number2&&number2<=number1);
		//OR(||)
		double d=9;
		char c='A';
		System.out.println(c>=1||-1<=d||d<=c);//syso()....>ctrl+space
		//NOT(!).
		long l1=120;
		int i=12;
		System.out.println(i!=0&&l1<=12||!(l1==i));
		
		
//		boolean flag=true;
//		switch(flag) {
//		case true:
//			System.out.println("true");     Error
//			default:
//				System.out.println("false");
//		}
//		

	}

}

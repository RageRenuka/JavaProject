package com.combinationofclass.packages;

public class Methodsinjava {

	public int m1()
	{
		System.out.println("m1 method");
		m3(2,1);
		return 0;
	}
	
	
	public int m2( int n1,int n2)
	{
		System.out.println("m2 method");
		
		return n1+n2;
	}
        {
        	System.out.println("this block");
	     }
		
	

	public float m3(float a,float b)
	{
		System.out.println("m3 float  method");
		
		return m2(2,1);	
	}
	
	
	{
	System.out.println("this non static block");
	
	
	}
	
	
	public static void main(String[] args) {
		Methodsinjava mj=new Methodsinjava();
		System.out.println("This is main method");
		mj.m1();
		 

	}

}

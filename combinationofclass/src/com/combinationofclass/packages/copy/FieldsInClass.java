package com.combinationofclass.packages.copy;

public class FieldsInClass {
	//fields
	int a=10;
	int b=20;
	int c=a+b;
	static int d=10;
	static int e=30;
	 static int f=d+e;
	 //blocks
	 {
		 System.out.println("welocme thje non static block");
	 }
	 static {
		 System.out.println("welocme the static block");
	 }
	 
	 //methods
	 public int m1(int a,int b) {
		 return a+b;
	 }

	 public static void  m2(int a,int b) {
		 int c=a+b;
		 System.out.println(c);
	 }
	 FieldsInClass()
	 {
		 System.out.println("default construcor");
	 }
	 FieldsInClass(int ap,int bp){
		 this.a=ap;
		 this.b=bp;
		 
	 }
	 
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	 FieldsInClass fs=new  FieldsInClass();
	System.out.println(fs.c);
	System.out.println(f);
	 {
		 System.out.println("welocme thje non static block");
	 }	 

	 System.out.println(fs.m1(4, 6));
	 m2(6,0);
	 FieldsInClass fs1=new  FieldsInClass(10,20);
	 System.out.println(fs1.a+" "+fs1.b );
	}

}

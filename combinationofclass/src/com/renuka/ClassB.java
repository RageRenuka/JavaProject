package com.renuka;

public class ClassB extends ClassA {

	
	public  int operation(int a,int b) {
		int addresult=a+b;
		System.out.println("Sum of the operation method result:"+addresult);
		return addresult;
	}

	public String operation(String str1, String str2) {
		System.out.println(str2.hashCode()+","+str1.hashCode());
		boolean str3=str1==str2;//can not compare the string values in == Operator
		System.out.println(str3);
		System.out.println(str2.hashCode()+","+str1.hashCode());
		return null;
	}

	public void evenodd(int num) {
	if(num%2==0)
	{
		System.out.println(num+"is Even Number");
	}else {
		System.out.println(num+"is Odd Number");
	}
		
	}
	public static void swaping(int a,int b)
	{
      System.out.println("After swaping the values");
      a=a+b;//ex(a=3,b=2)==>a=3+2=5(now '5' is the a value) 
      b=a-b;//b=5-2=3==>b=5-2=3(now '3'is the b value)
      a=a-b;//a=5-3=2==>a=5-3=2(finally a value is '2')(a=2,b=3)
      System.out.println("after swaping the a value is"+a);
      System.out.println("after swaping the b value is"+b);
	}

}

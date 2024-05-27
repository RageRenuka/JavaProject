package com.firstdemo.pacakge;

public class TernaryOperator {

	public static void main(String[] args) {
		// condition?value 1:value 2;
		int a=20;
		int b=30;
		int result=(a<=b)? a:b;
		System.out.println(result);
		
		String s1="Renuka1";
		String s2="Renuka1";
		String str=(s1==s2)?"true":"false";
		System.out.println(str);
	}

}

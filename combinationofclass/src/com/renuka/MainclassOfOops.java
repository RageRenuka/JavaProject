package com.renuka;

import java.util.Scanner;

public class MainclassOfOops {

	public static void main(String[] args) {
		ClassB cb=new ClassB();
//		ClassA ca=new ClassA();
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=sc.nextInt();
	System.out.println("Enter the b value");
	int b=sc.nextInt();
    cb.operation(a, b);
	System.out.println("Enter  String str1 value is");
	String str1=sc.next();
	System.out.println("Enter  String str2 value is");
	String str2=sc.next();
    cb.operation(str1, str2);
    System.out.println("Enter a number it will check even or odd");
    int num=sc.nextInt();
    cb.evenodd(num);
    System.out.println("Enter swapping the two numbers");
    System.out.println("Before Swaping the values is");
    System.out.println("Enter number1 value");
    int num1=sc.nextInt();
    System.out.println("Enter number2 value");
    int num2=sc.nextInt();
    
    cb.swaping(num1, num2);
    sc.close();
	

	}

}

package com.renuka;

import java.util.Scanner;

public class ExceptionHandlingsExamples {

	public static void main(String[] args) {
	    System.out.println("progaram Started");
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the a value");
	    int a =sc.nextInt();
	    System.out.println("Enter the b value");
	    int b =sc.nextInt();
	    try {
	    int c=a/b;//Arithmetic Exception
	    System.out.println("the result of c is:"+c);
	    }
	    catch(Exception e) {
	    	System.out.println(e.getMessage());
//	    	printStacktrace();
	    }
	    System.out.println("Enter the String Str");
	    String str=sc.next();
	    System.out.println(str);
	    
	    try {
	        int[] myNumbers = {1, 2, 3};
	        System.out.println(myNumbers[10]);
	      } catch (Exception e) {
	    	  System.out.println(e.getMessage());
	    	  
	        System.out.println("Something went wrong.");
	      }

	    
	    

	}

	
}

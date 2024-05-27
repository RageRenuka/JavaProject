package com.renuka;

import java.util.Scanner;

public class EmployeeDeatilesUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Deatiles Using The ScannerClass");
		System.out.println("Enter the employee Name");
		String name=sc.next();
		System.out.println("Enter the employee Empid");
		String empid=sc.next();
		System.out.println("Enter the employee Age");
		String age=sc.next();
		System.out.println("Enter the employee City");
		String city=sc.next();
		
		
		System.out.println("The Employee Name is: " +name);
		System.out.println("The Employee Empid is: " +empid);
		System.out.println("The Employee Age is: " +age);
		System.out.println("The Employee City is: " +city);

	}

}

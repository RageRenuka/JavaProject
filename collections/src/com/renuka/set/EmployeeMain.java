package com.renuka.set;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp=new Employee(0, null, 0, 0, 0, null);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		int empid=sc.nextInt();
		System.out.println("Enter the Employee Name");
		String empName=sc.next();
		System.out.println("Enter the Employee Age");
		int empAge=sc.nextInt();
		System.out.println("Enter the Employee Salary");
		double empSal=sc.nextDouble();
		System.out.println("Enter the Employee Gender");
		String empGender=sc.next();
		System.out.println("Enter the Employee ContactNumber");
		long empContact=sc.nextLong();
		System.out.println("Enter the Employee Country");
		String empCountry=sc.next();
		System.out.println("Display the employee Detailes");
		
		
		System.out.println(empid+","+empName+","+empAge+","+empSal+","+empGender+","+empContact+","+empCountry);
		
	}
	

}

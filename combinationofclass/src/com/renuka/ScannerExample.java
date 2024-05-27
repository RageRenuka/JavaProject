package com.renuka;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		System.out.println("welcome to Ap Power Distribution compane");
		System.out.println("Electrical bill Generated");
		Scanner sc=new Scanner(System.in);
		System.out.println("Area Selector");
		System.out.println("1.Urban");
		System.out.println("2.Rural");
		System.out.print("Enter your area");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter how maney units you consumed");
			int urbanunits=sc.nextInt();
			double urbanbillAmount=urbanBillGenerator(urbanunits);
			System.out.print("Bill is:Rs"+urbanbillAmount);
			break;
			
		case 2:
			System.out.println("Enter how maney units you consumed");
			int ruralunits=sc.nextInt();
			double ruralbillAmount=ruralBillGenerator(ruralunits);
			System.out.print("Bill is:Rs"+ruralbillAmount);
			break;
			default:System.out.println("please select any one area");
		}

	}

	private static double urbanBillGenerator(int units) {
		double amount;
		if(units<=100) {
			amount=units*12*3;
		}if(units>=100&&units<=200)
		{
			amount=units*20*5;
		}if(units>=200 && units<=500)
		{
			amount=units*50*8;
		}else {
			amount=units*100*10;
		}
		return amount;
	}

	private static double ruralBillGenerator(int units) {
		double amount;
		if(units<=100) {
			amount=units*12*3;
		}if(units>=100&&units<=200)
		{
			amount=units*20*5;
		}if(units>=200 && units<=500)
		{
			amount=units*50*8;
		}else {
			amount=units*100*10;
		}
		return amount;
		
	}

}

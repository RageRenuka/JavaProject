package com.renuka;

import java.util.Scanner;

public class EvenOddTest {
	public static String checkNumberEvenOrOdd(int i) {
		if(i%2==0)
		{
			return "even";
		}else {
			return "odd";
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		System.out.println(checkNumberEvenOrOdd(i));
				

	}

}

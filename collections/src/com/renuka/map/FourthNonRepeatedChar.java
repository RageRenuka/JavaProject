package com.renuka.map;

import java.util.Scanner;

public class FourthNonRepeatedChar {

	public static void main(String[] args) {
		System.out.println("Enter the String WIth Repeated Chars");
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		repChar(str);
	}
	public static void repChar(String str) {
		char[] arr=str.toCharArray();
		//char dummy=str.charAt(i);
		int noncount=0;
		for(int i=0;i<arr.length-1;i++) {
			char dummy=str.charAt(i);
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 	{
					noncount++;
					if(noncount==4) {
					System.out.println(arr);
				}
			}	
		}
		
	}
		 System.out.println("Repeated Chars are: " +str);
		
	}
}

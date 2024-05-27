package com.renuka.map;

import java.util.Scanner;

public class CountOfRepCharactore {
	public static void main(String[] args) {
		System.out.println("Enter the String WIth Repeated Chars");
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		repChar(str);
	}
	public static void repChar(String str) {
		char[] arr=str.toCharArray();
		char dummy=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 	{
					dummy=arr[i];
				}
			}	
		}
		int count=0;
		for(int k=arr.length-1;k>=0;k--) {
			if(arr[k]==dummy)  {
            count++;
		}
	}
		 System.out.println("Repeated Chars are: " +dummy);
		 System.out.println("Repeated count are: " +count);
	}
	
}
//abcdffffffghiiiijkkkkklm.
//dddfffuuueennnclm.
//abcdeejiklmooqrstuv


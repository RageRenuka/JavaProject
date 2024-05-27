package com.renuka.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		Array size is fixed.
//		Array is collaction of Homegeneous elements means similaer type of data.
//		Inseration order is based on index.
//		Retrivebis based on the index only.
		
	int[] arr=new int[10];
	arr[0]=17;
	arr[1]=5;
	arr[2]=7;
	arr[3]=17;
	arr[4]=76;
	arr[5]=53;
	arr[6]=2;
	arr[7]=89;
	arr[8]=5;
	arr[9]=13;
	System.out.println(arr);

	System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+","
	+arr[6]+","+arr[8]+","+arr[9]);
	
	//String array
	String[] str= {"Java","Sql","Html/Css","JavaScript","Boostrap","ReactJs"};
	System.out.println("Length of the string array is: "+str.length);
     for(int i=1;i<=str.length-1;i++) {
    	 System.out.println(str[i].toUpperCase());
     }
     
     //didplay the sum of the array .
	int [] a= {1,5,7,0,3,56,90,756,34,12,45,7,8,23,3,456};
	int sum=0;
	System.out.println("Length of array is :"+a.length);
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
		sum=sum+a[i];
	}
	System.out.println("Sum Of Give Array is : "+sum);
	
	Employee[] emparr=new Employee[5];
	emparr[0]=new 	Employee(1010, "Renuka", 30000, 23,90909090);
	emparr[1]=new 	Employee(1011, "Manoj", 35000, 20,909095090);
	emparr[2]=new 	Employee(1023, "Mounika", 15000, 21,987657654);
	emparr[3]=new 	Employee(1010, "Lavanya", 12000, 20,98761654);
	emparr[4]=new 	Employee(1010, "Chandu", 7000, 19,9871234);
	//Find whose employee salarey is lessthan 20000 and increase the salary by 20%.
	double increasesal=0;
	double newsal=0;
	for(int i=0;i<emparr.length;i++) {
	if(emparr[i].empSalarey<20000) {
		increasesal=emparr[i].empSalarey*0.2;
		newsal=emparr[i].empSalarey+increasesal;
		System.out.println(emparr[i].empName+" new salarey: "+newsal);
	}   
	}
	int[] duparray= {1,2,3,1,3,2,4,6,5,7,4,58,6};
	//Remove duplicate and sort an Array.
	Arrays.stream(duparray).distinct().sorted().forEach(System.out::println);
	
	//find out the given array length & display the even numbers into an array.
	//find out the even numbers sum
	
	int[]array= {1,5,5,1,5,8,9,535,214,121,12,1,31,3,34,689};
	System.out.println("Getting the Given Array length: "+array.length);
	System.out.println("Getting the even numbers into an Array");
	int sum1=0;
	for(int i=0;i<array.length;i++) {
		if(array[i]%2==0) {
		sum1=sum1+array[i];
		System.out.println(array[i]);
	}
 }
	System.out.println("sum even array is: "+sum1);
	//using an array display the prime number taking the inputs an user.
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an array size: ");
	int size=sc.nextInt();
	int[] scannerArray=new int[size];
	for(int i=0;i<size;i++) {
	scannerArray[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++) {
	int count=0;
	for(int j=1;j<=a[i];j++) {
	if(scannerArray[i]%j==0)
	count++;
	}
	if(count==2) {
	System.out.println(scannerArray[i]+" is a prime number");
		}
	}
	
}
}

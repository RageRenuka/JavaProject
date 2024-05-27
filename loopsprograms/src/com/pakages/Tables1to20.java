package com.pakages;

public class Tables1to20 {

	public static void main(String[] args) {
		System.out.println("display the tables from 1 to 20 ");
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println(" ");
		}
		
		System.out.println("display the tables from 20 to 1");
		for(int i=20;i>=1;i--)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println(" ");
		}

	}

}

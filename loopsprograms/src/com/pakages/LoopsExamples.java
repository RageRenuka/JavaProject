package com.pakages;

public class LoopsExamples {

	public static void main(String[] args) {
		// For Loop
	System.out.println( "Print the 1 to 10 Numbers using for loop");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	System.out.println( "Print the 10 to 1 Numbers using for loop");
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println( "Print the 1 to 10 even Numbers using for loop");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println( "Print the 1 to 10 odd Numbers using for loop");
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("print the particuler number on the console using for loop");
		for(int i=1;i<=10;i++)
		{
			if(i==8)
			{
				System.out.print(i+" ");
			}
			System.out.print("");
		}
		
		// While Loop
		System.out.println();
		System.out.println( "Print the 1 to 10  Numbers using While loop");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println("print the 20 to 10 numbers using While loop");
		int num=20;
		while(num>=10)
		{
			System.out.print(num+" ");
			num--;
		}
		
		System.out.println();
		System.out.println("print the 10 to 25 even number only using while loop");
		
		 int number=10;
		 while(number<=25)
		 {
			 if(number%2==0)
			 {
				 System.out.print(number+" ");
			 }
			 number++;
		 }
		 System.out.println();
			System.out.println("print the 10 to 25 odd number only using while loop");
			
			 int number1=10;
			 while(number1<=25)
			 {
				 if(number1%2!=0)
				 {
					 System.out.print(number1+" ");
				 }
				 number1++;
			 }
			//Do-while loop
			System.out.println();
			System.out.println("print the 50 to 100 numbers using dowhile loop");
			 
			 int n1=50;
			 do {
				 System.out.print(n1+" ");
				 n1++;
			 }
			 while(n1<=70);
			 
			 System.out.println();
			System.out.println("print the 50 to 100 numbers using dowhile loop");
				 
				 int n2=70;
				 do {
					 System.out.print(n2+" ");
					 n2--;
				 }
				 while(n2>=50);
				 
				 System.out.println();
					System.out.println("print the 50 to 100 numbers using dowhile loop");
						 
						 int n3=30;
						 do {
							 if(n3%2==0)
							 {
								 System.out.print(n3+" ");
								 }
							 n3++;
						 }
						 while(n3<=50);
	}

}

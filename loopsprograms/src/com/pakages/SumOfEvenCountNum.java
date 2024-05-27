package com.pakages;

public class SumOfEvenCountNum {

	public static void main(String[] args) {
		
		int sum=0;
		int count=0;
		int sum1=0;
		int count1=0;
		
		for(int i=1;i<=10;i++)
		{			
		if(i%2==0)
           {	sum=sum+i;
				count++;
			}	
		if(i%2!=0)
        {       sum1=sum1+i;
				count1++;
			}	
		}
		
			System.out.println("Sum of even numb er is:"+sum);
			System.out.println("Count of even number is:"+count );
			System.out.println("Sum of odd number is:"+sum1);
			System.out.println("Count of odd number is:"+count1 );
	
	}
}
		
			
			
					
			
			
				
		

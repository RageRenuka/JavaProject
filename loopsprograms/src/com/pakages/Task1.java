package com.pakages;

public class Task1 {
	//multiple of a number

	public void multiple(int n)

	{
		System.out.println("multiplication of a number is");
		for(int i=1;i<=10;i++)
		System.out.println(n+"x"+i+"="+n*i);		
	}
	//biggest of three numbers
	public void biggestOfThreeNum(int a,int b,int c) {
		
		if(a>=b&&a>=c)
		{
			System.out.println(a+"a is bg");
		}else if(b>=a&&b>=c)
		{
			System.out.println(b+ "b is bg");
		}
		else {
			System.out.println(c+"c is big");
		}
		
	}
	//count of factorial number
	public int factorialcount(int n) {
		int fact=1;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			count++;
		}
		System.out.println(fact);
		System.out.println(count);
		return count;
		
	}
	
	public char charmethod(char c)
	{
		System.out.println(+c);
		return c;
	}
	
	public int simpleinterest(int p,int r,int t)
	{
		int result=p*r*t/100; 
		System.out.println("The result of principle ,time,interest is "+result);
		return result;
	}
  
	public static void main(String[] args) {
	
		Task1 t1=new Task1();
		t1.multiple(17);
		t1.biggestOfThreeNum(15,92,23);
		t1.factorialcount(10);	
		t1.charmethod('A');
		t1.simpleinterest(1100, 10, 5);
	
	
	}
		
		

	}



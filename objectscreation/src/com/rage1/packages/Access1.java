package com.rage1.packages;

public class Access1 {
	
	
	//default,public private,protected.
	//within the class we can access all modifires
     String  day1="monday";
     String days="Friday";
    
     protected int numdays=7;
     protected int weekOfdays=2;
     
     private String officename="TCS";
     private String officeloction="Bnagolure";
	
	 public int hours=3;
	 public int minits=47;
	 
	 
	public static void main(String[]args)
	{
		Access1 a=new Access1();
		System.out.println("default spacifires:"+a.day1);
		System.out.println("default  spacifires:"+a.days);
		
		System.out.println("public spacifires:"+a.hours);
		System.out.println("public  spacifires:"+a.minits);
		
		System.out.println("private spacifires:"+a.officename);
	    System.out.println("private  spacifires:"+a.officeloction);
		
		System.out.println("protected spacifires:"+a.numdays);
		System.out.println("protected  spacifires:"+a.weekOfdays);

	}
	
	 
}



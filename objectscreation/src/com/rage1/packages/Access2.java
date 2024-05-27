package com.rage1.packages;

public class Access2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		private spacifires we canot access to the out side of a class we can acces only within the class
		 //same package we can access 3 modifires only like default,protected,public we can not access the private modifires
		
		Access1 a=new Access1();
		System.out.println("default spacifires:"+a.day1);
		System.out.println("default  spacifires:"+a.days);
		
		System.out.println("public spacifires:"+a.hours);
		System.out.println("public  spacifires:"+a.minits);
		
//		System.out.println("private spacifires:"+a.officename);
//		System.out.println("private  spacifires:"+a.officeloction);
		
		System.out.println("protected spacifires:"+a.numdays);
		System.out.println("protected  spacifires:"+a.weekOfdays);

	}

}

package com.rage2.packages;

import com.rage1.packages.Access1;

public class Access3 {

	public static void main(String[] args) {
		Access1 a=new Access1();
		//diffrent packages we can access public modifires members only remaing defult ,private,protected will not access it.

		//System.out.println("default spacifires:"+a.day1);
//		System.out.println("default  spacifires:"+a.days);
		
		System.out.println("public spacifires:"+a.hours);
		System.out.println("public  spacifires:"+a.minits);
		
//		System.out.println("private spacifires:"+a.officename);
//		System.out.println("private  spacifires:"+a.officeloction);
		
//	    System.out.println("protected spacifires:"+a.numdays);
//		System.out.println("protected  spacifires:"+a.weekOfdays);

	}

	}



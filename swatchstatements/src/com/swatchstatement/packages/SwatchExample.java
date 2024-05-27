package com.swatchstatement.packages;

import java.util.Scanner;

public class SwatchExample {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a day number:");
		  int a=sc.nextInt();
       switch(a)
       {
       case 1:System.out.println("one is monday");
       break;
       case  2:System.out.println("two is Tuesdays");
       break;
       case 3:System.out.println("Three is wendsdays");
       //break;
       case 4:System.out.println("Four is Thuesday");
       break;
       case 5:System.out.println("Five is Friday");
       break;
       case 6:System.out.println("Six is Saturday");
       //break;
       case 7:System.out.println("saven  is sunday");
       break;
       default:System.out.println("pleas enter the valid  day number");
       }
       
       for(int i=0;i<10;i++)
       {
    	   if(i%2==0)
    	   {
    		  
    		  continue;
    	   }
    	   System.out.println(i);
       }
       sc.close();
	}

}

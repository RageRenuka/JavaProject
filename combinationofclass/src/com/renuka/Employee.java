package com.renuka;

public class Employee {
	
	static  int officepincod;
	static String  empoffice; 
	static String empName;
	
	 static {
		 empoffice="Capgemini";
		 System.out.println(empoffice);
		 }
	 
     public static  void empsal()
     {
    	int sal=1000;
    	double hike=sal+sal/10+100;
    	System.out.println(hike);
     }
     public static  void empdeatils()
     {
    	 empName="Renuka";
    	 System.out.println(empName);
    	 
     }
     
    	 
     
     
	public static void main(String[] args) {
		officepincod=51425;
	 System.out.println("this main method");
     System.out.println(officepincod);
		empsal();
		empdeatils();
	}

}

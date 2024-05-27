package com.combinationofclass.packages.copy;

public class Student {
	
	int studtnum;
	String studtName;
	double studtfee;
	long studtMobilenum;
	char gender;
////	Student()
//	{
//		System.out.println("this is defult constructor");
//	}
	Student(int studtnump,String studtNamep,double studtfeep,long studtMobilenump,char genderp)
	{
 		studtnum=studtnump;
		studtName=studtNamep;
		studtfee=studtfeep;
		studtMobilenum= studtMobilenump;
		gender=genderp;
		
	}
	

	public static void main(String[] args) {
		 //Student std=new  Student();
		 Student std1=new  Student(101,"Raja",15000,879090909,'m');
		 Student std2=new  Student(102,"Raju",16000,9046357,'m');
		 System.out.println(std1);
		 

	}

}

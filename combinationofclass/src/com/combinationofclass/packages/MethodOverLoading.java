package com.combinationofclass.packages;

public class MethodOverLoading {
	
	public int student(int sno,long number)
	{
	System.out.println(sno+","+number);
		return 0;
	}
	
	public int student(int sno,long number,float fee)
	{
	System.out.println(sno+","+number+","+fee);
		return 34;
	}
	public String student(String name,String course)
	{
	System.out.println(name+","+course);
		return "java";
	}
	public void student(String name,String course,String city)
	{
	System.out.println(name+","+course+","+city);
		
	}
	




	public static void main(String[] args) {
		MethodOverLoading mol=new MethodOverLoading();
		mol.student("Renuka", "python");
		mol.student(34, 874839202, 15000);
		mol.student(12, 987665446);
		mol.student("bindu", "Java"," Anantapur");

	}

}

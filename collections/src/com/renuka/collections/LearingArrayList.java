package com.renuka.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LearingArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new String("Renuka"));
		al.add(new Scanner(System.in));
		al.add(new Object());
		al.add(new Employee(101, "Suresh", 30, 900000, 987654312));
		al.add(new StringBuffer());
		al.add(new StringBuilder());
		al.add(new LearingArrayList());
		al.add(645654);
		al.add("VishnuPriya");
		al.add(654.00);
		al.add(true);
		al.add('c');
		al.add(12,new String("Deepika"));
	
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		System.out.println(al.get(7));
		System.out.println(al.get(8));
		System.out.println(al.get(3));
		System.out.println(al.get(9));
		System.out.println(al.get(10));
		System.out.println(al.get(11));
		System.out.println(al.get(12));
		ArrayList al2=new ArrayList();
		al2.add("Java");
		al2.add("Rajkumar");
		al2.add("Html/Css");
		al2.add("pythondeveloper");
		al2.addAll(al2);
		al2.addAll(al2);
		System.out.println(al2);
		
		//How to create Homogenouse Collactions or arraylist.
		
	ArrayList<Employee> arrayListEmp=new ArrayList<Employee>();
	arrayListEmp.add(new    Employee(1010, "Renuka", 30000, 23,90909090));
	arrayListEmp.add(new 	Employee(1012, "vanaja", 30000, 20,90909090));
	arrayListEmp.add(new 	Employee(1013, "Deepika", 30000, 23,90909090));
	arrayListEmp.add(new 	Employee(1014, "Mounika", 30000, 23,90909090));
	arrayListEmp.add(new 	Employee(1015, "VishnuPriya", 30000, 23,90909090));
	arrayListEmp.add(new 	Employee(1016, "Bibin", 30000, 23,90909090));
	arrayListEmp.add(new 	Employee(1017, "Balaji", 30000, 23,90909090));
	arrayListEmp.add(new 	Employee(1018, "Suresh", 30000, 23,90909090));
	
	  System.out.println(arrayListEmp);
	  //Iterator
	  System.out.println("Iterator.........");
	  Iterator<Employee> itr=arrayListEmp.iterator();
	 System.out.println(itr.next());
	 System.out.println(itr.next());
	 System.out.println(itr.next());
	 System.out.println(itr.next());//it will print or getting the values in arraylist.
	 System.out.println(itr.next());
	 System.out.println(itr.hasNext());// it will check tbhe nect element is ther or not.
	 System.out.println(itr.hasNext());
	 System.out.println(itr.hasNext());
	 System.out.println(itr.hasNext());
	 System.out.println(itr.hasNext());
	  
	  while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
//		 System.out.println(itr.next());// exception is ther like "NoSuchElementException"
		 System.out.println(itr.hasNext());
	
	  //next()
	  //hashNaxt()
	  //remove()
		 arrayListEmp.remove(0);
		 arrayListEmp.remove(1);
	  for(Employee emp:arrayListEmp) {
		  System.out.println(emp);
	  }
	  
	  ArrayList<String> als=new   ArrayList<String>();
	  als.add("1.Java");
	  als.add("2.MySql");
	  als.add("3.Oracle");
	  als.add("4.Html/Css");
	  als.add("5.JavaScripit");
	  als.add("6.ReactJs");
	  System.out.println("Before Removeing the values............");
	  for(String s:als) {
		  System.out.println(s);
	  }
	  als.remove(4);//4 is the index position.
	  als.remove(2);
	  System.out.println("After Removeing the values............");
	  for(String s1:als) {
		  System.out.println(s1);
	  }
	  ArrayList<String> als1=new   ArrayList<String>();
	  als1.add("1.Java");
	  als1.add("2.MySql");
	  als1.add("3.Oracle");
	  als1.add("4.Html/Css");
	  als1.add("5.JavaScripit");
	  als1.add("6.ReactJs");
	
	  System.out.println(als1);
	  System.out.println("****************");
	  Iterator<String>str=als1.iterator();
	  
	  str.next();
	  str.next();
	  str.next();
	  str.remove();
	  str.next();
	  str.next();
	  str.remove();//without next method we canot remove the str object .
	  for(String str12:als1) {
	System.out.println(str12);
	}
	  //it will check the str element is there or not.
	  System.out.println("it will check the str element is there or not.");
	  Iterator<String>str10=als1.iterator();
	  while(str10.hasNext()) {
		  System.out.println(str10.next());
		  als1.remove("3.Oracle");
	  }
	  System.out.println("Arraylist String size is: "+als1.size());//====>5 bcs of we can add the remove method.
	  //1)iterator()
	  //...>next()
	 //...>hasNext()
	 //...>remove
	  
	  //2)listiterator().
	  //...>next()
	  //...>hasNext()
	//...>Previous()
	//...>hasPrevious()
	  
	  List<Employee> empOfArrayList=new ArrayList<Employee>();
	  empOfArrayList.add(new Employee(1256,"Suresh",800000,30,863959434));
	  empOfArrayList.add(new Employee(1109,"Lavanya",67260,20,906959421));
	  empOfArrayList.add(new Employee(10921,"Renuka",51900,23,656942178));
	  empOfArrayList.add(new Employee(1290,"Mounika",800000,36,863959434));
	  empOfArrayList.add(new Employee(1856,"Mallika",89024,21,909090909));
	  System.out.println(empOfArrayList.get(3));
	 
	//now we can create ListIterator.
	 ListIterator<Employee> listIterator= empOfArrayList.listIterator();
	 System.out.println("previouse index "+ listIterator.previousIndex());
	 
	Employee emp_next= listIterator.next();
	System.out.println(emp_next);
	Employee emp_next2= listIterator.next();
	System.out.println(emp_next2);
	boolean emp_hasnext1= listIterator.hasNext();
	System.out.println(emp_hasnext1);
	Employee emp_Previous= listIterator.previous();
	System.out.println(emp_Previous);
	System.out.println("previouse index "+ listIterator.previousIndex());
	boolean emp_hasPrevious= listIterator.hasPrevious();
	System.out.println(emp_hasPrevious);
	 //it is forword and backword Direction.
	 while( listIterator.hasNext())
		 System.out.println( listIterator.next());
	 
	 while( listIterator.hasPrevious())
		 System.out.println( listIterator.previous());
	 ArrayList a12=new ArrayList();
	 a12.add("java");
	 boolean bn=a12.add("ReactJs");
	
	 System.out.println(bn);
	 
	 
	}
	


	

	
}

package com.renuka.set;

import java.util.Iterator;
import java.util.TreeSet;

public class LearingTreeSet {

	public static void main(String[] args) {
	TreeSet<String> tset=new TreeSet<String>();
	tset.add("Java");
	tset.add("JavaScripit");
	tset.add("Spring");
	tset.add("MicroServices");
	tset.add("Jdbc");
	tset.add("Html/Css");
	for(String str:tset) {
		System.out.println(str);
	}
	System.out.println("Above String it will print the Alphabetical order");
	TreeSet<Integer> tset1=new TreeSet<Integer>();
	tset1.add(109);
	tset1.add(1023);
	tset1.add(683);
	tset1.add(104);
	tset1.add(1043);
	tset1.add(123);
	tset1.add(113);
	for(Integer in:tset1) {
		System.out.println(in);
	}
	System.out.println("Above Integer it will print the asscending order");

	TreeSet<Employee> setemp=new TreeSet<Employee>();
	
	Employee emp1=new Employee(271599,"Renuka",23,46700,768954230,"india");
	Employee emp2=new Employee(205612,"Lavany",21,37000,903412567,"london");
	Employee emp3=new Employee(103213,"Kalyan",20,29000,963201672,"japn");
	Employee emp4=new Employee(891230,"Pavan",33,90600,60981235,"U.S.A");
	Employee emp5=new Employee(610973,"Bibin",21,32070,87639942,"india");
	Employee emp6=new Employee(510131,"sandhya",24,45000,67231907,"newyark");
	
	setemp.add(emp1);
	setemp.add(emp2);
	setemp.add(emp3);
	setemp.add(emp4);
	setemp.add(emp5);
	setemp.add(emp6);
	for(Employee emp:setemp) {
		System.out.println(emp);
	}
	System.out.println("by using iterator interface.................................................................");
	Iterator<Employee> setIt=setemp.iterator();
	while(setIt.hasNext()) {
		System.out.println(setIt.next());
	}


 	
	
	}

}

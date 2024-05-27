package com.renuka.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class LearingStack {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push("Renuka");
		stack.push(863959443);
		stack.push(23);
		stack.push("renu@gmail.com");
		stack.push('f');
		stack.push("Anantapur");
		stack.push(515425);
		stack.push("India");
		stack.push("M.C.A");
		stack.push(2023);
		stack.push(new Employee(101,"Nandu",20,89000, 876));
		Object popobj=stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Iteroter: ");
		Iterator<Stack>itstack=stack.iterator();
		
		while(itstack.hasNext()) {
			System.out.println(itstack.next());
		}
		System.out.println("List-Iterator");
		System.out.println("*****forword******");
	ListIterator<Stack>listStack=stack.listIterator();
	while(listStack.hasNext()) {
		System.out.println(listStack.next());
	}	System.out.println("******backword******");
	while(listStack.hasPrevious()) {
		System.out.println(listStack.previous());
	}
		
		
		stack.removeIf(e->e.equals("Nandu"));
		//getting the stack values.
		System.out.println("*****getting the stack values******");
		for(int i=0;i<stack.size();i++) {
			System.out.println(stack.get(i));
		}
		System.out.println(stack);
		
		Stack<Employee>stackEmp=new Stack<Employee>();
		System.out.println("In stack By using the generic type of Employee.........................");
		stackEmp.push(new Employee(102, "Suresh", 890000, 45, 890745483));
		stackEmp.push(new Employee(102, "SaiKumar", 67430, 34,987745483));
		stackEmp.push(new Employee(103, "ManojKumar", 87000, 73, 83456783));
		stackEmp.push(new Employee(104, "NareshKumar", 907000, 34, 3456783));
		stackEmp.push(new Employee(105, "Manjunath", 936000, 23, 345987654));
		stackEmp.push(new Employee(106, "RajeshKumar", 56000, 73, 9876543));
		stackEmp.push(new Employee(107,"RajKumar", 436200, 21, 345678345));
		stackEmp.push(new Employee(108, "Sunith", 953400, 49, 987654323));
		//1)1st way getting an values
		for(int i=0;i<stackEmp.size();i++) {
			System.out.println(stackEmp.get(i));
		}
		//2)second way getting an values.
		System.out.println("Second way getting an Stack values....................");
		System.out.println(stackEmp);
		//2)THread way getting an stack values
		System.out.println("THread way getting an stack values.....................");
		for(Employee emp3stack:stackEmp) {
			System.out.println(emp3stack);
		}
		
		//4)now i can create for itertor()
		System.out.println("By using Itertor.......");
		Iterator<Employee>itrEmp=stackEmp.iterator();
		while(itrEmp.hasNext()) {
			System.out.println(itrEmp.next());
		}
		System.out.println("By using ListItertor................");
		System.out.println("Employee Forword Direction");
		//5)now i can create for listitertor()
		ListIterator<Employee>listEmpStack=stackEmp.listIterator();
		while(listEmpStack.hasNext()) {
			System.out.println(listEmpStack.next());
		}
		System.out.println("Employee Backword Direction");
		while(listEmpStack.hasPrevious()) {
			System.out.println(listEmpStack.previous());
		}
		
		
		
		Stack<String> stack123=new Stack<String>();
//		stack123.add("Renuka");
//		stack123.add("Mounika");
//		stack123.add("Pallavi");
//		stack123.push("sunith");
//		stack123.push("Jayasree");
//		stack123.push("Benarji");
//		stack123.push("balaji");
//		stack123.push("ManojKumar");
//		
//		
////		stack123.pop();
////		stack123.addAll(2, stack123);
////		for(String stack1234:stack123) {
////			System.out.println(stack1234);
////		}
////		Object[]obj=new Object[20];
////		stack123.copyInto(obj);
////		for(Object obj1:obj) {	
////		}
////		
//		System.out.println("Stack using Enumartion Iterators");
//	Enumeration<String>en=stack123.elements();
//	stack123.add("Renuka");
//	stack123.add("Mounika");
//	stack123.add("Pallavi");
//	stack123.push("sunith");
//	stack123.push("Jayasree");
//	stack123.push("Benarji");
//	stack123.push("balaji");
//	stack123.push("ManojKumar");
//	String element=en.nextElement();
//	System.out.println(element);
//	String element1=en.nextElement();
//	System.out.println(element1);
//	String element2=en.nextElement();
//	System.out.println(element2);
//	String element3=en.nextElement();
//	System.out.println(element3);
//	String element4=en.nextElement();
//	System.out.println(element4);
//	String element5=en.nextElement();
//	System.out.println(element5);
//	String element6=en.nextElement();
//	System.out.println(element6);
//	String element7=en.nextElement();
//	System.out.println(element7);
//	String element8=en.nextElement();
//	System.out.println(element8);
	Enumeration<String>en1=stack123.elements();
	stack123.add("Renuka");
	stack123.add("Mounika");
	stack123.add("Pallavi");
	stack123.push("sunith");
	stack123.push("Jayasree");
	stack123.push("Benarji");
	stack123.push("balaji");
	stack123.push("ManojKumar");
	System.out.println("by using the loop");
	while(en1.hasMoreElements()) {
		System.out.println(en1.nextElement());
	}
		
	}
		
		
		
	}



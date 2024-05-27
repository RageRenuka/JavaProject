package com.renuka.collections;

public class EnhanceForLoop {

	public static void main(String[] args) {
	
		int[] arr= {1,7,2,0,2,7,3,12,65,24,78,21,46,97};
		System.out.println("Display the lenthe of the array: "+arr.length);

		//This is Normal ForLoop.
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//By using Enhanced for loop how it will got an array elements.
		System.out.println("Getting elements into the Enhanced for loop");
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		Employee[] emparr=new Employee[5];
		System.out.println();
		emparr[0]=new 	Employee(1010, "Renuka", 30000, 23,90909090);
		emparr[1]=new 	Employee(1011, "Manoj", 35000, 20,909095090);
		emparr[2]=new 	Employee(1023, "Mounika", 15000, 21,987657654);
		emparr[3]=new 	Employee(1010, "Lavanya", 12000, 20,98761654);
		emparr[4]=new 	Employee(1010, "Chandu", 7000, 19,9871234);
		//it will display the 
		System.out.println("Length of the Employee array is: "+emparr.length);
		for(int i=0;i<emparr.length;i++) {
			System.out.println(emparr[i]);
		}
		
		//Getting the employee elements by using Enhanced for loop.
		System.out.println();
		System.out.println("By using Enhanced for loop how to get the Employee array Elements");
		System.out.println();
		for(Employee emp:emparr) {
			System.out.println(emp);
		}
		System.out.println();
		//in Employee array elements whos age is lessthanEqualto 20 it will add the "Hello" string.
		System.out.println("Display the Employee array elements whos age is lessthanEqualto 20 it will add the \"Hello\" string.");
		System.out.println();
		for(Employee emp:emparr) {
			if(emp.getAge()<=20) {
				emp.setEmpName("Hello "+emp.getEmpName());
			}
			System.out.println(emp);
		}
		System.out.println();
		//creating the boolean array objct.
		System.out.println("Creating the boolean array object ");
		System.out.println();
		boolean[] boolpay= {true,false,false,true,true,false,true};
		for(boolean bool:boolpay) {
			if(bool==true) {
				System.out.println("Hello Suresh sir please let me know  how to learn Java.......... ");
			}
		}
	}

}

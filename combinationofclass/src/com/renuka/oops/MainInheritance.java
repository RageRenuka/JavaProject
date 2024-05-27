package com.renuka.oops;

import java.util.Scanner;

import com.renuka.Bike.Car;

public class MainInheritance {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("This is the parent class of bike class");
	    Bike c=new Bike();
	    c.display();
	    System.out.println("Enter the bike brand");
	    Bike.brand=sc.next();
	    System.out.println("Enter the bike colour");
	    Bike.colour=sc.next();
	    System.out.println("Enter the bike price");
	    Bike.price=sc.nextInt();
	    System.out.println("Enter the bike name");
	    Bike.bikename=sc.next();
	
		System.out.println("Enter the ourbikeprice");
	    System.out.println("Enter the bike price");
		Bike.ourbikeprice(sc.nextInt());
		   
		System.out.println("Enter the bike name");
		Car.bikename=sc.next();
		   
		System.out.println("Enter the bike colour");
		Car.colour=sc.next();
		 
		System.out.println("Enter the bike price");
		Car.price=sc.nextInt();
		Car.FibanoccSeries(10);
		
		System.out.println(Car.ourbikeprice(6543));
		sc.close();
	}

}

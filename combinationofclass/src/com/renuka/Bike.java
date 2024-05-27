package com.renuka;

public class Bike {
	static String brand;
	public static String colour;
	public static int price;
	public static String bikename;
	static int a,b;

	
	public Bike() {
		System.out.println("This is default Constructor of Bikeclass");
	}
	
	
	public Bike(String brand, String colour, int price,String bikename)
	{
        this.brand=brand;
		this.colour=colour;
		this.price=price;
		this.bikename=bikename;
		System.out.println("Bike Brand: "+brand+"\n"+"Bike colour: "+colour+"\n"+
		"Bike price: "+price+"\n"+"Bike name: "+bikename);
	}
	public void display(){
		System.out.println("This is Bike method");
	}
	  public static int ourbikeprice(int bikeprice) {
		  if(bikeprice>=price)
		  {
			  System.out.println("ourbikeprice is bigg");
			  return bikeprice;
		  }else {
			  System.out.println("price is bigg");
			  return price;
		  }
	  }
	 public class Car extends Bike{
		public  Car(int price,String brand,String colour){
				Bike.price=price;
				this.brand=brand;
				this.colour=colour;  	
			System.out.println("Car price:"+" "+price+" "+"Car brand:"+brand+" "+"colour:"+colour);
		}	
		 public void display()
		 {
				System.out.println("This is vehicle method");
			}
		 public static void FibanoccSeries(int num){
			 a=0;
			 b=1;
			 System.out.println(a+"\n"+b);
			 for(int i=1;i<=num;i++){
				 int c=a+b;
				 System.out.println(c);
				 a=b;
				 b=c;
			 }
		 }
	 }
	 }	 
	 // RBI ,ICICI,KOTAKA,SBI.
	 //RBI CLASS IS ABSTRACT CLASS.
	 //RBI R=NEW ICIC();//loosely coupled
	 //RBI R1=NEW KOTAKA();// "
	 //RBI R2=NEW SBI();// "
			
			
			
	



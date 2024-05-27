package com.typecasting.packages;

public class TypeCasting {

	public static void main(String[] args) {
		// The process of converting one primitive data type into another primitive data type is called type casting.
		//then boolean is primitive data type but it can not support the type casting 
		//1).Narrowing    2).Widening
		
		// The Process Of Converting bigger primitive data type into smaller primitive data type is called Narrowing
		//it is explicit also Ex:-double->long->float->int->char->short->byte
		
		// The Process Of Converting smaller primitive data type into bigger primitive data type is called Widening
		//it is Implicit also Ex:-byte->shot->char->int->float->long->double
     int a=10;
     int d=a;
     System.out.println("integer"+d);
     float f=a; //Implicit//widening
     long b=20;
     byte c=(byte)b;//Explicit
     System.out.println("converting int to float: "+f);
     System.out.println("converting long to byte: "+c);
     
     //String str="yamuna";.....>// its showing erorr Because of string is reference type data type
     char c1='A';
     float f1=c1;
     System.out.println("converting charector to float: "+f1);
     double dd=300;
     short s=(short)dd;//Explicit
     System.out.println("converting double to short: "+s);
     //byte b1=90;
     int n1=90;
     byte b1=(byte)n1;//Explicit
     System.out.println("converting int to byte: "+b1);
	}

}

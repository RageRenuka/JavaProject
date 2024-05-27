package com.renuka;

public class StringMethodsExamples {

	public static void main(String[] args) {
		String str="java";
       int len=str.length();
        System.out.println(len);
        String str2="language";
        String str3=str.concat(str2);
        System.out.println(str3);
        System.out.println( str.charAt(3));
        System.out.println(str.toCharArray());
      boolean b= str2.equalsIgnoreCase("LANGUAGE");
       System.out.println(b);
       boolean b1=str.equals(new String("JAVA IS A LANGUAGE"));
       System.out.println(b1);
      boolean b2= str.equalsIgnoreCase(new String("JaVa"));
      System.out.println(b2);
       
      String s1="  More number of Study materials   available online on our website  for preparation  ";
      String[] strarray=s1.split(" ");
      int countword=strarray.length;
      System.out.println(countword);
      
      String strip=s1.strip();
      System.out.println(strip.length());
      
      
     System.out.println("Renuka".compareTo("renuka"));//-32
     System.out.println("Renuka".compareTo("reNUka"));//-32
     System.out.println("Renuka".equals("renuka"));//f
     System.out.println("Renuka".equalsIgnoreCase("reNUka"));//t
     System.out.println("0987".equalsIgnoreCase("0987"));
     System.out.println("09876".equalsIgnoreCase("12345"));
     System.out.println("234".equals("0987"));
     
     
     
     String st="Renuka";
     st="suresh";
     System.out.println(st);
 System.out.println( String.format(null, st, strarray));
 String.format( "hg","jh","k");
     
     
      
	}
	public void formatingmethod(String a ,String b,String c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}

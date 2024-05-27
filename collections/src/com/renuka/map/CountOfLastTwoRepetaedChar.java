package com.renuka.map;


import java.util.Scanner;


public class CountOfLastTwoRepetaedChar {
	 
	
	 public static void getLastDuplicateCharacter(String str) {
		int count=0;
		char dummy=0;
	    char lastDuplicate = 0; 
	        for (int i = str.length()- 1; i >= 0; i--) {
	            char c = str.charAt(i);
	              count++;
	            if (count == 2) {
	                lastDuplicate = c; 
	            }
	            else if (count> 2) {
	                break; 
	            }
	        }
	        int lastDuplicateCount = 0; 
	        for (int i = str.length() - 1; i >= 0; i--) {
	            if (str.charAt(i) == lastDuplicate) {
	            	dummy=str.charAt(i);             
	            	lastDuplicateCount++;
	            }
	           
	        }
	        System.out.println("LastDuplicateCharacter: "+dummy);
	        System.out.println("count of lastdupicate char: " +lastDuplicateCount);
	        
	    }
	    public static void main(String[] args) {
	    	System.out.println("Enter the string");
	    	Scanner sc=new Scanner(System.in);
	    	String str=sc.next();
	    	getLastDuplicateCharacter(str);
	      
			

	    }
			}
	    
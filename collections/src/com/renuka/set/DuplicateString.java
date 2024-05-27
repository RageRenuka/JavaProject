package com.renuka.set;



import java.util.Set;
import java.util.TreeSet;

public class DuplicateString  {

	public static void main(String[] args) {
	//// write a program to remove the dupicates in a String array
		// ["foo", "boo", "noo", "foo", "boo"]
		// hi hello how are you, hi hello who are you. pleae remove duplicates 
//		// from above sentence.

       
       String[] str= {"foo","boo","noo","foo","boo"};
       TreeSet<String > treesetstr=new TreeSet<String>();
       for(String str1:str) {
       	treesetstr.add(str1);
       }
       for(String str1:treesetstr) {
       	System.out.println(str1);
       }
       
	
	}
	}


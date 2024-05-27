package com.renuka.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LearingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList_str=new LinkedList<String>();
		linkedList_str.add("Java");
		linkedList_str.add("c#");
		linkedList_str.add("Python");
		linkedList_str.add("Oracle");
		linkedList_str.add("Html/Css");
		for(String str1:linkedList_str) {
			System.out.println(str1);
		}
		String indexvalue=linkedList_str.get(3);
		System.out.println(indexvalue);
		
		Iterator<String>Str_LinkedList=linkedList_str.iterator();
		System.out.println("by using Iterator methos next&hashNext........");
		while(Str_LinkedList.hasNext()) {
			System.out.println(Str_LinkedList.next());
		}
		for(String str_li:linkedList_str) {
			System.out.println("getting the values by using enhanced for loop: "+str_li);
		}
		
		ListIterator<String>Str_LinkedList1=linkedList_str.listIterator();
		
		
		System.out.println("by using listIterator methos next&hashNext........");
		System.out.println("ForWord Direction");
		while(Str_LinkedList1.hasNext()) {
			System.out.println(Str_LinkedList1.next());
		} 
		
		System.out.println("by using listIterator methos prerivous&hasprerivous........");
		System.out.println("BackWord Direction");
		while(Str_LinkedList1.hasPrevious()){
			System.out.println(Str_LinkedList1.previous());
		}
		LinkedList<Integer>li=new LinkedList<Integer>();
		li.add(101);
		li.add(102);
		li.add(103);
		li.add(104);
		li.add(105);
		li.add(106);
		System.out.println(">>>>>>>>>>By using the Enhanced for loop getting the values>>>>>>>>>>>>>");
		for(Integer i:li) {
			System.out.println(i);
		}
		System.out.println(">>>>>>>>>>>By using Normal For loop getting the linkedlist elements>>>>>>>>>>>>");
      for(int i=0;i<li.size();i++) {
    	  System.out.println(li.get(i));
      }
      
      System.out.println(">>>>>>By using Iteroter>>>>>>>");
      Iterator<Integer> li1=li.iterator();
      while(li1.hasNext()) {
    	  System.out.println(li1.next());
      }
      System.out.println(">>>>>>By using ListIteroter>>>>>>>");
      System.out.println("Forword and Back Word Direction");
      System.out.println("forword Directio");
      ListIterator<Integer> li2=li.listIterator();
      while(li2.hasNext()) {
    	  System.out.println(li2.next());
      }
      System.out.println("Backword Directio");
      while(li2.hasPrevious()) {
    	  System.out.println(li2.previous());
      }
  LinkedList<Integer> lII=new LinkedList<Integer>();

  lII.add(999);
  lII.add(888);
  lII.add(777);
  System.out.println(lII);
// Integer enum1=lII.element();//enumaretion interface is not suporreted for the linked list.
		
		

	}

}

package com.renuka.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class LearingVector {

	public static void main(String[] args) {
		Vector<Integer> vr=new Vector<Integer>();
		vr.add(111);
		vr.add(222);
		vr.add(333);
		vr.add(444);
		vr.add(1, 555);
		vr.add(666);
		vr.add(777);
		vr.add(null);
		vr.remove(7);
		//vr.addAll(vr);//agin it will print the vr object values.
		System.out.println("getting values from the enhanced for loop");
		for(Integer in:vr) {
			System.out.println(in);
		}
		Enumeration<Integer>en=vr.elements();
		//hasMoreElements()
		//nextElement()
		//asIterator()//it will display the enumaration object address.
		System.out.println("By using the **Enumartion** in vector");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println("capacity of vector "+vr.capacity());
		System.out.println("AsIterator in vector "+en.asIterator());
		Iterator<Integer> ii=vr.iterator();
		System.out.println("by using **Iterator** in vector");
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		ListIterator<Integer> lii=vr.listIterator();
		System.out.println("by using **ListIterator** in vector");
		System.out.println("......Forwaord.....");
		while(lii.hasNext()) {
			System.out.println(lii.next());
		}
		System.out.println("......Backwaord.....");
		while(lii.hasPrevious()) {
			System.out.println(lii.previous());
		}
	}
		

}

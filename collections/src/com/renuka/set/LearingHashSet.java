package com.renuka.set;

import java.util.HashSet;
import java.util.Iterator;

public class LearingHashSet {

	public static void main(String[] args) {
	 HashSet<String> hash=new HashSet<String>();
	 hash.add("Renuka");
	 hash.add(null);
	 hash.add("Mounika");
	 hash.add(null);
	 hash.add("Mounika");
	 hash.add("Renuka");
	 hash.add("Balaji");
	 hash.add("Suresh");
	 hash.add("Mahalakshmi");
	 hash.add("RajKumar");
	 hash.add("ManojKumar");
	 hash.add("Sai Kumar");
	 hash.add("Naresh Kumar");
	 System.out.println("Length of the Hashset is "+hash.size());
	 System.out.println(hash);
	 for(String str:hash) {
		 System.out.println(str);
	 }
	Iterator<String>itstr= hash.iterator();
	System.out.println("by using iterator in hashset");
	while(itstr.hasNext()) {
		System.out.println(itstr.next());
	}
	}

}

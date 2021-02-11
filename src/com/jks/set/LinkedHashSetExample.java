package com.jks.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("one");
		set.add("five");
		set.add("two");
		set.add("seven");
		set.add("six");
		
		LinkedHashSet<String> set1=new LinkedHashSet<String>();
		set1.add("four");
		set1.add("three");
		set1.add("eight");
		
		set.addAll(set1);
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(9);
		set2.add(10);
		set2.add(12);
		set2.add(11);
		set.add(set2.toString());
		
		System.out.println("all value set : "+set);
		
		set.remove(set2.toString());
		System.out.println("all value after set2 remove : "+set);
		
         System.out.println(set.containsAll(set1));		
		set.removeAll(set1);
		System.out.println("all value after remove set1 and set2 : "+set);
		
		System.out.println(set.contains("five"));
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

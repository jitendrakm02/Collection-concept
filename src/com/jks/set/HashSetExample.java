package com.jks.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating HashSet and adding element---HashSet
		System.out.println(" not maintains insertion order and not store duplicate value");
		HashSet<String> hsstr=new HashSet<String>();
		hsstr.add("fruit");
		hsstr.add("vegetable");
		hsstr.add("animal");
		hsstr.add("human");
		hsstr.add("bird");
		hsstr.add("fish");
		hsstr.add("fish");
		hsstr.add("fish");
		hsstr.add("elion");
		hsstr.add("god");
		hsstr.add("god");
		hsstr.add("god");
		
		System.out.println(hsstr);
		System.out.println("size before remove :"+hsstr.size());

		System.out.println("hashcode :"+hsstr.hashCode());
		System.out.println("cheking hashset is empty : "+hsstr.isEmpty());
		System.out.println("remove :"+hsstr.remove("god"));
		System.out.println(hsstr);
		System.out.println("size after remove :"+hsstr.size());
		//set more element
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(2);
		set1.add(7);
		set1.add(29);
		set1.add(12);
		set1.add(21);
		String ss=set1.toString();
		hsstr.add(ss);
		HashSet<String> hss=new HashSet<String>();
		hss.add("five");
		hss.add("fifty");
		hss.add("seven");
		hsstr.addAll(hss);
		System.out.println("after update...");
		System.out.println(hsstr);
		//remove all element off ss
		hsstr.remove(ss);
		hsstr.removeAll(hss);
		System.out.println(hsstr);
		System.out.println("after remove ss value: "+hsstr);
		//conditional remove value
		hsstr.removeIf(str->str.contains("five"));
		System.out.println(hsstr);
		System.out.println("for each method start running ......");
		hsstr.forEach(hs->{
			System.out.println(hs);
		});
      
		hsstr.clear();
		System.out.println(hsstr);
		
		//hash set from another collection
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("two");
		list.add("one");
		list.add("four");
		list.add("three");
		list.add("seven");
		list.add("nine");
		list.add("six");
		
		HashSet<String> set=new HashSet<String>(list);
		set.add("jitendra");
		set.add("gaurav");
		set.add("priya");
		set.add("neha");
		//printing all values from arraylist and hashset
		System.out.println("printing all values from arraylist and hashset-----");
		set.forEach(st->{
			System.out.println(st);
		});
		
		
		
	}

}

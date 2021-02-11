package com.jks.set;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating hashset and adding elemnt
		System.out.println("maintains insertion order and not store duplicate value");
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

	}

}

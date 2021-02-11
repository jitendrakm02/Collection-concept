package com.jks.list;

import java.util.*;

public class LinkedListTest {
	
	public static void main(String[] args) {
	
		System.out.println("list maintains the insertion order and store duplicate value");
		LinkedList<String> list=new LinkedList<String>();
		list.add("jitendra");
		list.add("piyush");
		list.add("monika");
		list.add("mathur");
		list.add("negi");
		list.add("priya");
		list.add("anu");
		list.add("anu");
		list.add("anu");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.getFirst());
		System.out.println(list.element());
		System.out.println(list.getLast());
		System.out.println(list.lastIndexOf("anu"));
		System.out.println(list.get(5));
		System.out.println(list.contains("jitendra"));
		System.out.println(list.clone());
		//System.out.println(list.offer("jitendra"));
		
		//traversing list by various type-for each loop
		System.out.println("traversing list by for each loop");
		for(String str:list) {
			
			System.out.println(str);
		}
		//traversing list by various type-for each method
		System.out.println("traversing list by for each method");
		list.forEach(ls->{
			
			System.out.println(ls);
		});
		//traversing list by various type-iterator
		Iterator<String> itr = list.iterator();
		System.out.println("traversing list by Iterator interface");
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		//traversing list by various type-list iterator
		ListIterator<String> litr = list.listIterator();
		System.out.println("traversing list by list iterator interface in forward direction");
		while(litr.hasNext()) {
			
			System.out.println(litr.next());
			
		}
		System.out.println("traversing list by list iterator interface in backward direction");
		while(litr.hasPrevious()) {
			
			System.out.println(litr.previous());
		}
		//traversing list by various type-enumeration
		
	
	}

}

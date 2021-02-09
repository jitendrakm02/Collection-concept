package com.jks.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetSetList {

	public static void main(String[] args) {
		//The get() method returns the element at the given index, 
		//whereas the set() method changes or replaces the element.
		
		System.out.println("creating list with get and set value");
		List<String> list=new ArrayList<String>();
		//adding value in list
		list.add("potato");
		list.add("tomato");
		list.add("govi");
		list.add("Onion");
		list.add("Chili");
		list.add("Bhindi");
		list.add("muli");
		list.add("kadu");
		list.add("Muli");
		list.add("potato");
		
		System.out.println("List of Vegetables:"+list);
		System.out.println("getting size "+list.size());
		//printing value by iterator interface
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("getting value of index 1 :"+list.get(1));
		System.out.println("setting value of index 8"+list.set(8,"Reddis"));
		System.out.println("deleting value of index 4"+list.remove(4));
		System.out.println("checking list value is empty or not :"+list.isEmpty());
		System.out.println("getting size after removing element at index 4: "+list.size());
		System.out.println("----------------------------------");
		System.out.println("List of Vegetables:"+list);
		
     // printing value by foreach loop
		for(String s:list) {
			System.out.println(s);
		}
	}

}

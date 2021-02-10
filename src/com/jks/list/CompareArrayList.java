package com.jks.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> first=new ArrayList<String>();
		first.add("mango");
		first.add("apple");
		first.add("banana");
		first.add("orange");
		first.add("guava");
		first.add("litchi");
		
		Iterator<String> itr=first.iterator();
		while(itr.hasNext()) {
			System.out.println("First list:   : "+itr.next());
		}
		
		List<String> second=new ArrayList<String>();
		second.add("potato");
		second.add("onion");
		second.add("tomato");
		second.add("govi");
		second.add("brinjal");
		second.add("ladies finger");
		
		ListIterator<String> litr=second.listIterator();
		while(litr.hasNext()) {
			System.out.println("second  list from  start :  :"+litr.next());
		}
		while(litr.hasPrevious()) {
			System.out.println("second  list from  last :  :"+litr.previous());
		}
		boolean val1;
		 val1=first.equals(second);
		System.out.println("first time"+val1);
      
		first.add("papaya");
		val1=first.equals(second);
		System.out.println(val1);
		
		List<Integer> i1=new ArrayList<Integer>();
		i1.add(1);
		i1.add(2);
		i1.add(3);
		i1.add(4);
		i1.add(5);
		List<Integer> i2=new ArrayList<Integer>();
		i2.add(1);
		i2.add(2);
		i2.add(3);
		i2.add(4);
		i2.add(5);
		
		val1=i1.equals(i2);
		System.out.println(val1);
		
		i1.add(6);
		val1=i1.equals(i2);
		System.out.println("after add one more : "+val1);
		System.out.println(i1);
		System.out.println(i2);
		
		//removeAll method that is remove all the value from list if present in both list
		
		List<String> remove1=new ArrayList<String>();
		remove1.add("jitendra");
		remove1.add("piyush");
		remove1.add("neha");
		remove1.add("priya");
		remove1.add("pramod");
		remove1.add("narayan");
		remove1.add("hamid");
		List<String> remove2=new ArrayList<String>();
		remove2.add("jitendra");
		remove2.add("piyush");
		remove2.add("neha");
		remove2.add("narayan");
		remove2.add("pramod");
		remove2.add("neha");
		
		val1=remove1.removeAll(remove2);
		System.out.println("value after removeall method from remove1 to remove 2"+val1);
		System.out.println("remove1"+remove1);
		System.out.println("remove2"+remove2);
		val1=remove2.removeAll(remove1);
		System.out.println("value after removeall method from remove2 to remove 1"+val1);
		System.out.println("remove1"+remove1);
		System.out.println("remove2"+remove2);
	}

}

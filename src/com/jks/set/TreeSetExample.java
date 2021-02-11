package com.jks.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(1);
		set.add(6);
		set.add(3);
		set.add(9);
		set.add(7);
		set.add(5);
		
		TreeSet<Integer> set1=new TreeSet<Integer>();
		set1.add(4);
		set1.add(40);
		set1.add(12);
		set1.add(8);
		
		set.addAll(set1);
		System.out.println("all value set and set1 :"+set);
		
		System.out.println(set.hashCode());
		System.out.println(set.clone());
		System.out.println(set.isEmpty());
		System.out.println(set.higher(25));
		System.out.println(set.last());
		System.out.println(set.lower(2));
		System.out.println(set.remove(40));
		System.out.println(set.add(55));
		System.out.println(set);
		System.out.println(set.removeAll(set1));
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.ceiling(5));
		System.out.println(set.comparator());
		System.out.println(set.descendingIterator());
		System.out.println(set.first());
		System.out.println(set.floor(9));
		System.out.println(set.spliterator());
		

	}

}

package com.jks.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList=new ArrayList<String>();
		stringList.add("jitendra");
		stringList.add("piyush");
		stringList.add("priya");
		stringList.add("neha");
		stringList.add("harendra");
		stringList.add("popat lal");
		
		System.out.println("String list :"+stringList);
		//iyterating the string list by iterator
		System.out.println("iterating over Iterator======================");
		Iterator<String> itr=stringList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("iterating over forEach=========================");
		//iyterating the string list by foreach
		for(String str:stringList) {
			System.out.println(str);
		}

	}

}

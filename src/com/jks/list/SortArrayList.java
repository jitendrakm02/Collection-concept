package com.jks.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SortArrayList {

	public static void main(String[] args) {
		
		List<String> sal=new ArrayList<String>();
		sal.add("india");
		sal.add("Japan");
		sal.add("australia");
		sal.add("France");
		sal.add("jarmani");
		sal.add("Itali");
		sal.add("philipines");
		sal.add("Nepal");
		sal.add("pakistan");
		
		System.out.println("Before Soting list element : "+sal); 
		for(String lst:sal) {
			System.out.println(lst);
		}
       Collections.sort(sal);
       System.out.println("printing after sorting :");
       //iterate over iterator
       
       Iterator<String> itr=sal.iterator();
       while(itr.hasNext()) {
    	  System.out.println( itr.next());
       }
       
       //list- sort integer value 
       List<Integer> inlist=new ArrayList<Integer>();
       inlist.add(1);
       inlist.add(15);
       inlist.add(31);
       inlist.add(19);
       inlist.add(98);
       inlist.add(19);
       inlist.add(14);
       inlist.add(51);
       inlist.add(11);
        Iterator<Integer> it=inlist.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
       Collections.sort(inlist);
       for(Integer list:inlist) {
    	   System.out.println(list);
       }
       
       ListIterator<String> litr=sal.listIterator();
       while(litr.hasNext()) {
    	   System.out.println(litr.nextIndex()+" -forward direction elemenmt :"+litr.next());
       }
       System.out.println("==========================================================");
		
       while(litr.hasPrevious()) {
    	   System.out.println(litr.previousIndex()+" -backward direction element: "+litr.previous());
       }
	}

}

package com.jks.list;

/*convert  Array to list
 * And 
 * List to array
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
        // Array to list
		System.out.println("Convert Array to List.......................");
		
		String[] arr= {"java","python","php","c++",".net","spring","hibernate"};
		System.out.println("pring array :"+Arrays.toString(arr));
		
		//converting list to String
		List<String> list=new ArrayList<String>();
		for(String st:arr) {
			list.add(st);
		}
		
		System.out.println("printing list :"+list);
		
		//convert list to array
		
		System.out.println("Convert  List to Array.......................");
		
		List<String> fruit=new ArrayList<String>();
		fruit.add("apple");
		fruit.add("mango");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("papaya");
		fruit.add("guava");
		fruit.add("litchi");
		fruit.add("stoberry");
		fruit.add("coconut");
		fruit.add("naspati");
		System.out.println("List element are printing: "+fruit);
		//converting list to array
		String[] array=fruit.toArray(new String[fruit.size()]); 
		
		
		System.out.println("Array element are printing: "+array);
		System.out.println("Array element are printing string object: "+Arrays.toString(array));
	}

}

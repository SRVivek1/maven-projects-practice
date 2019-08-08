/**
 * Need to verify 
 * 1. how many times we can insert the null in ArrayList and 
 * what will happen for every time we insert null. will it overrides the value
 * or it makes an another entry.
 * 	>> Note : Any number of null insertion is possible in ArrayList at any place.
 * 
 * 2. Which index will be returned for null search indexOf(null)
 * 	>> Note : it will always return the first index of null value
 *  >>      : But we use lastIndexOf(Object o) method we can get last index also.
 */
package com.rp.nulll.insertion.in.arraylist;

import java.util.ArrayList;
import java.util.List;

public class NullInsertionInArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// adding new objects
		list.add("ramu");
		list.add("Shyamu");
		list.add("radhe");

		// print list data
		System.out.println(list);

		// insert null
		list.add(null);

		// print list data
		System.out.println(list);

		// insert another object
		list.add("prem");

		// print list data
		System.out.println(list);

		// insert null
		list.add(null);
		list.add(null);

		// print list data
		System.out.println(list);
		
		// Searching index for null
		System.out.println("null index : " + list.indexOf(null));
		System.out.println("Last index : " + list.lastIndexOf(null));
		
	}

}

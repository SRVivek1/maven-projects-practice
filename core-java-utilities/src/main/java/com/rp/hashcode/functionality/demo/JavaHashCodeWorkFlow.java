/**
 * 
 * How hashing works in java 
 * 
 *  Reference : http://www.cs.cmu.edu/~adamchik/15-121/lectures/Hashing/hashing.html
 */
package com.rp.hashcode.functionality.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaHashCodeWorkFlow {

	public static void main(String[] args) {
		Integer obj1 = new Integer(2009);
		System.out.println("hashCode for an integer " + obj1.hashCode());

		String obj2 = new String("2009");
		System.out.println("hashCode for a string " + obj2.hashCode());

		StringBuffer obj3 = new StringBuffer("2009");
		System.out.println("hashCode for a string buffer " + obj3.hashCode());

		ArrayList<Integer> obj4 = new ArrayList<Integer>();
		obj4.add(new Integer(2009));
		System.out.println("hashCode for an arraylist " + obj4.hashCode());

		@SuppressWarnings("rawtypes")
		Iterator obj5 = obj4.iterator();
		System.out.println("hashCode for an iterator " + obj5.hashCode());

		JavaHashCodeWorkFlow obj6 = new JavaHashCodeWorkFlow();
		System.out.println("hashCode for HashCodeDemo " + obj6.hashCode());

		String obj7 = new String("19999999999999999");
		System.out.println("hashCode can be negative " + obj7.hashCode());
		
		String obj8 = new String("A");
		System.out.println("hashCode will be 65 : " + obj8.hashCode());
		
		// "ABC" = 'A' * 31 ka power 2 + 'B' * 31 + 'C' = 65 * 312 + 66 * 31 + 67 = 64578
		// 65 * 31 + 66 = 
		String obj9 = new String("AB");
		System.out.println("hashCode will be 2081 : " + obj9.hashCode());
	}
}

package com.rp.string.concatination.operator.precedence;

public class StringEqualsAndConcatinationPrecendenceApp {

	public static void main(String[] args) {
		
		// Declaring multiple reference variables in one statement.
		String string1, string2;
		
		string1 = "string1";
		string2 = "string1";
		
		System.out.println("String1 : " + string1 + ", String2 : " + string2);
		System.out.println();
		
		System.out.println("string1.equals(string2) : " + string1.equals(string2));
		System.out.println("(string1 == string2)    : " + (string1 == string2));
		
		/**
		 * It will first concatenate the right hand side string values
		 *     i.e. ["string1 == string2      : " + string1]
		 *     and then this whole string will be compared with string2
		 *     
		 *     So here we will have two strings..
		 *     		String1 = "string1 == string2      : " + string1
		 *     		String2 = string2
		 *     
		 */
		System.out.println("string1 == string2      : " + string1 == string2);
	}

}

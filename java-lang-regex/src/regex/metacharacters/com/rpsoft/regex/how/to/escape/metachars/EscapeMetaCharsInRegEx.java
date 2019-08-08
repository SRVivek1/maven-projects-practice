/**
 * Using metacharacters in regular expressions as normal characters 
 * @author vivek.ksingh
 */
package com.rpsoft.regex.how.to.escape.metachars;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EscapeMetaCharsInRegEx {

	public static void main(String[] args) {

		String regexPattern = "";
		String searchIn = "";

		/*
		 * As discribed below there are 3 different ways to use meta-character
		 * as normal character to match
		 */
		// regexPattern = "cat[.]";
		// regexPattern = "cat\\Q.\\E";
		regexPattern = "cat\\.";

		searchIn = "cats";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Pattern : " + regexPattern);
		if (searchIn != null && !searchIn.equals("")) {
			System.out.println("Search In : " + searchIn);
		} else {
			System.out.print("Enter message to search in : ");
			searchIn = scanner.nextLine();
		}
		System.out.println("===================================");

		scanner.close();

		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(searchIn);

		boolean isMatch = false;
		while (matcher.find()) {
			System.out.println("Match find on index " + matcher.start()
					+ " for " + matcher.group());
			isMatch = true;
		}
		if (!isMatch) {
			System.out.println("No match found for '" + regexPattern + "' in '"
					+ searchIn + "'.");
		}
	}
}

/**
 * This program accepts 2 input strings from user one the message where we have to search the message 
 * and another the message which we have to search in first message.
 */
package com.rp.test.find.match.in.a.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class FindMatchInAString {

	public static void main(String[] args) {

		FindMatchInAString application = new FindMatchInAString();
		application.findMatch();
	}

	/*
	 * Finds match in the provided input string for the entered message
	 */
	private void findMatch() {
		Scanner scanner = new Scanner(System.in);
		String searchFor = "";
		String searchIn = "";

		System.out.print("Enter message : ");
		searchIn = scanner.nextLine();
		System.out.print("Search for : ");
		searchFor = scanner.nextLine();

		// Pattern
		Matcher matcher = Pattern.compile(searchFor).matcher(searchIn);

		while (matcher.find()) {
			System.out.println("Match Found. Starts at '" + matcher.start()
					+ "th' index.");
		}

		scanner.close();
	}
}

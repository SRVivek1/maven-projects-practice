package com.rp.test.regex.match.range;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchSpecifiedRange {

	public static void main(String[] args) {

		// Match any character in the range from a to h in small case
		String regexPattern = "";
		String searchIn = "";

		searchIn = "defghijklm";
		// use '^' to negate the match - [^a-h]
		regexPattern = "[a-h]";

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

		while (matcher.find()) {
			System.out.println("Match find on index " + matcher.start()
					+ " for " + matcher.group());
		}
	}
}

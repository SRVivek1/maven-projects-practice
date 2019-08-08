package com.rp.test.regex.match.intercation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchIntercationOfCharacters {

	public static void main(String[] args) {

		String regexPattern = "";
		String searchIn = "";

		// this intersaction expression means that it will search for [def] in a
		// range of [a-z]
		regexPattern = "[a-z&&[def]]";
		// Negation of regex a-z & 0-9 except d,e or f
		// regexPattern = "[a-z0-9&&[^def]]";

		// defining range in interscation
		// regexPattern = "[a-z0-9&&[^d-g]]";

		searchIn = "abcdefghijklm017";

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

package com.rp.test.regex.match.union;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchUnionOfCharacters {

	public static void main(String[] args) {

		String regexPattern = "";
		String searchIn = "";

		// this union expression gives same result as range as specified
		// [a-cf-h]
		// negation of [a-cf-h] = [^a-cf-h]
		regexPattern = "[a-c[f-h]]";
		// regexPattern = "[a-cf-h]";
		searchIn = "abcdefghijklm";

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

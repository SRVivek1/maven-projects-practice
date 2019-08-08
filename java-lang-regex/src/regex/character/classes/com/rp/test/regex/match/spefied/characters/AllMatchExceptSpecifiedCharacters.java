package com.rp.test.regex.match.spefied.characters;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllMatchExceptSpecifiedCharacters {

	public static void main(String[] args) {

		// Match any character except the specified ones
		// \\s represents blank spaces
		String regexPattern = "[^acegi\\s]";
		String searchIn = "";
		searchIn = "abcdefghij";
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

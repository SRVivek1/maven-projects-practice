package com.rp.test.regex.match.spefied.characters;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchSpecfiedCharacters {

	public static void main(String[] args) {

		// Match with any of the specified character
		String regexPattern = "[acdhxz]";

		System.out.println("Pattern : " + regexPattern);
		System.out.println("===================================");

		String searchIn = "";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter message to search in : ");
		searchIn = scanner.nextLine();
		scanner.close();

		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(searchIn);

		while (matcher.find()) {
			System.out.println("Match find on index " + matcher.start()
					+ " for " + matcher.group());
		}
	}
}

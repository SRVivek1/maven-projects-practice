package com.rp.test.find.match.in.a.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchTheProvidedInputs {

	public static void main(String[] args) {

		MatchTheProvidedInputs application = new MatchTheProvidedInputs();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter message to match in : ");
		String matchIn = scanner.nextLine();

		System.out.print("Enter message to match for : ");
		String matchFor = scanner.nextLine();

		scanner.close();

		application.isMatched(matchIn, matchFor);
	}

	private void isMatched(String matchIn, String matchFor) {
		Pattern pattern = Pattern.compile(matchFor);
		Matcher matcher = pattern.matcher(matchIn);

		if (matcher.matches()) {
			System.out.println("Marched.");
		} else {
			System.out.println("Not matched.");
		}
	}
}

package com.rp.test.regex.validator.email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {

		final String EMAIL_VALIDATOR_PATTERN = "[a-z0-9][a-z0-9\\.]*@[a-z0-9]+([.][a-z]+)+";
		String emailId = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter email id : ");
		emailId = scanner.nextLine();

		scanner.close();

		boolean isValid = Pattern
				.compile(EMAIL_VALIDATOR_PATTERN, Pattern.CASE_INSENSITIVE)
				.matcher(emailId).matches();

		if (isValid) {
			System.out.println("'" + emailId + "' is a valid email id.");
		} else {
			System.out.println("'" + emailId + "' is not a valid email id.");
		}

	}
}

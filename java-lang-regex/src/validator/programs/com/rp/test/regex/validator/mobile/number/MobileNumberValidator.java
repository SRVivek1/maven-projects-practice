package com.rp.test.regex.validator.mobile.number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidator {

	public static void main(String[] args) {

		final String MOBILE_NUMBER_VALIDATOR = "(0|91|\\+91)?[7-9][0-9]{9}";
		String mobileNumber = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter mobile number : ");
		mobileNumber = scanner.nextLine();
		scanner.close();

		boolean isValid = Pattern.compile(MOBILE_NUMBER_VALIDATOR)
				.matcher(mobileNumber).matches();

		if (isValid) {
			System.out.println("'" + mobileNumber + "' is a valid email id.");
		} else {
			System.out.println("'" + mobileNumber
					+ "' is not a valid email id.");
		}
	}

}

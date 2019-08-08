package com.rp.find.unique.character.in.string;

import java.util.Scanner;

public final class FindCountOfUniqueCharsInString {

	public static void main(String[] args) {

		FindCountOfUniqueCharsInString application = new FindCountOfUniqueCharsInString();
		String data = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input String : ");
		data = scanner.next();
		
		String distinctString = application.getUniqueCharsCount(data);
		
		System.out.println("Input String length : " + data.length());
		System.out.println("Distinct String    : " + distinctString);
		System.out.println("Distinct Characters : " + distinctString.length());
		
		
		scanner.close();
	}
	
	private String getUniqueCharsCount(String data) {
		
		// first parameter is a regular expression and second char means empty string
		return data.replaceAll("(.)(?=.*?\\1)", "");
	}

}

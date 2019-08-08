import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reverse words of given String.
 * 
 * Example input : Hello how are you. Output : you. are how Hello
 * 
 * @author vivek.ksingh
 *
 */
public class ReverseWordsOfString {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.print("Enter message : ");
		String message = null;

		try {
			message = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String reverse = reverseStringByWords(message);

		System.out.println("Message : " + message);

		System.out.println();
		System.out.println("Reverse with    duplicates : " + reverse);

		reverse = reverseWordsAndRemoveDulicates(message);
		System.out.println("Reverse without duplicates : " + reverse);

		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This methods reverses the string
	 * 
	 * @param input
	 * @return
	 */
	private static String reverseStringByWords(String input) {
		if (input == null || input.equals("")) {
			return "";
		}
		StringBuilder reverseString = new StringBuilder();
		String[] words = input.split(" ");
		// reverse String
		for (int index = words.length - 1; index >= 0; index--) {
			reverseString.append(words[index] + " ");
		}
		return reverseString.toString();
	}

	/**
	 * Reverse String from words and remove duplicates as well
	 * 
	 * @param message
	 * @return
	 */
	private static String reverseWordsAndRemoveDulicates(String message) {
		if (message == null || message.equals("")) {
			return "";
		}
		StringBuilder reverseString = new StringBuilder();
		String[] words = message.split(" ");
		String temp = null;
		for (int index = words.length - 1; index >= 0; index--) {
			temp = words[index];
			if (reverseString.indexOf(temp) == -1) {
				reverseString.append(temp + " ");
			}
		}
		return reverseString.toString();
	}
}

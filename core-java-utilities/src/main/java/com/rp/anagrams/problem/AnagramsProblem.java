/**
 * 
 * Anagram solver
 * --------------
 * An anagram is a word or phrase formed by reordering the letters of another word or phrase. Here is a list of 
 * words such that the words on each line are anagrams of each other:
 * 
 * 		key  .......   values
 * 		-----------------------------------------------
 * 		abder = [ barde, ardeb, bread, debar, beard, bared ]
 * 		abers = [ bears, saber, bares, baser, braes, sabre ]
 * 
 * In this program you read a dictionary from the web site at http://www.andrew.cmu.edu/course/15-121/dictionary.txt 
 * and build a Map( ) whose key is a sorted word (meaning that its characters are sorted in alphabetical order) and 
 * whose values are the word's anagrams.
 */

package com.rp.anagrams.problem;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramsProblem {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner(url.openStream());

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		while (sc.hasNextLine()) {
			String word = sc.nextLine();
			String sortedWord = sortString(word); // this is a key

			ArrayList<String> anagrams = map.get(sortedWord); // this is a value

			if (anagrams == null)
				anagrams = new ArrayList<String>();

			anagrams.add(word);
			map.put(sortedWord, anagrams);
		}
		
		sc.close();
		
		System.out.println(map.get(sortString("bread"))); // testing
		System.out.println(map);

	}

	private static String sortString(String w) {
		char[] ch = w.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}

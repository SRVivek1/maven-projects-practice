/**
 * Requirement :
 * --------------
 * 		>> Find all the numbers and their multipliers in a given range which can make it reverse if we multiply that number with the 
 * 			multiplier.
 * 
 * 		eg..
 * 			Number = 2178 Multiplier = 4 ................... valid
 *			Number = 21978 Multiplier = 4 .................. valid
 *			Number = 219978 Multiplier = 4 ................. invalid (two same numbers back-to-back)
 *			Number = 2199978 Multiplier = 4 ................ invalid (two same numbers back-to-back)
 *			Number = 1089 Multiplier = 9 ................... valid
 *			Number = 10989 Multiplier = 9 .................. valid
 *			Number = 109989 Multiplier = 9 ................. invalid (two same numbers back-to-back)
 *			Number = 1099989 Multiplier = 9 ................ invalid (two same numbers back-to-back)
 */

package com.rpsoft.find.reverse.with.conditions;

public class FindReverseNumberInAGivenRange {
	
	static int reverse(int i) { 
		StringBuffer sb = new StringBuffer(); 
		while (i > 0) { 
			sb.append(i % 10); 
			i /= 10; 
		} 
		
		return Integer.parseInt(sb.toString()); 
	}

	public static void main(String[] args) { 

		boolean noDataMatch = true;

		for (int j = 2; j < 10; j++) { 
			for (int i = 1000; i < 10000000; i++) { 
				long jMulti = i * j; 
				if ((jMulti) == reverse(i) & isAllDigitsAreDifferent(jMulti)) { 
						System.out.println("Number = " + i + " Multiplier = " + j);
						noDataMatch = false;
				} 
			} 
		} 
		if(noDataMatch) {
			System.out.println("No Data found.");
		}
	}
	
	public static boolean isAllDigitsAreDifferent(long palindromNumber) {
		
		long firstDigit = palindromNumber % 10;
		long secondDigit = 0;
		
		while(palindromNumber > 0){
			palindromNumber /= 10;
			secondDigit = palindromNumber % 10;
			
			if(firstDigit == secondDigit) {
				return false;
			}	
			firstDigit = secondDigit;
		}	
		return true;
	}
	 
}

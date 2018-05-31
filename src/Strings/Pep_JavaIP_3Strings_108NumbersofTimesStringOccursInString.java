package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_108NumbersofTimesStringOccursInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String pattern = scn.next();
		int result = solve(str, pattern);
		System.out.println(result);
	}

	private static int solve(String str, String pattern) {
		int[] pattern_aux = new int[pattern.length()];

		for (int i = str.length() - 1; i >= 0; i--) {
			for (int j = 0; j < pattern.length(); j++) {
				if (str.charAt(i) == pattern.charAt(j)) {
					if (j == pattern.length() - 1) {
						pattern_aux[pattern.length() - 1] += 1;
					} else if (str.charAt(i) == pattern.charAt(j)) {
						pattern_aux[j] += pattern_aux[j + 1];
					}

				}
			}
		}

		return pattern_aux[0];
	}

}

/*
Test cases:

pepforpepepep
pep
---------------
27


geeksforgeeks
gks
----------------------
4


abacdssaaa
aba
------------------------
4
	
	
	Source: https://www.geeksforgeeks.org/find-number-times-string-occurs-given-string/
 */

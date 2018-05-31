package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_126TransformOneStringToAnother {

	public static void main(String[] args) {
		//Please input string in the the form of lowercase letters.

		Scanner scn = new Scanner(System.in);
		String fstr = scn.next();
		String sstr = scn.next();
		System.out.println(getprob(fstr, sstr));
	}

	public static int getprob(String fstr, String sstr) {
		char[] A = fstr.toCharArray();
		char[] B = sstr.toCharArray();

		int m = fstr.length(), n = sstr.length();

		// This parts checks whether conversion is
		// possible or not
		if (n != m)
			return -1;
		int count[] = new int[26];
		for (int i = 0; i < n; i++) // count characters in A
			count[B[i]-'a']++;
		for (int i = 0; i < n; i++) // subtract count for
			count[A[i]-'a']--;

		// every character in B
		for (int i = 0; i < 26; i++) { // Check if all counts become 0
			if (count[i] != 0) {
				return -1;
			}
		}
		// This part calculates the number of operations required
		int res = 0;
		for (int i = n - 1, j = n - 1; i >= 0;) {
			// If there is a mismatch, then keep incrementing
			// result 'res' until B[j] is not found in A[0..i]
			while (i >= 0 && A[i] != B[j]) {
				i--;
				res++;
			}

			// If A[i] and B[j] match
			if (i >= 0) {
				i--;
				j--;
			}
		}
		return res;
	}

}

/*
Test cases:
	eabcd
	eacbd
	------------------------
	3
	
	abd
	bad
	-----------------
	1
	
	
	geek
	geek
	--------------------
	0
	
	Source: https://www.geeksforgeeks.org/transform-one-string-to-another-using-minimum-number-of-given-operation/
 */
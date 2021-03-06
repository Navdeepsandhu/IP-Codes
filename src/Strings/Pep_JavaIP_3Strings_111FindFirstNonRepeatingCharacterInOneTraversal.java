package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_112FindFirstNonRepeatingCharacterInOneTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(getprob(str));

	}

	public static char getprob(String str) {
		int[] count = new int[26];
		// stores the count of allcharacters.
		// we need to find those elements which has count as 1..
		// we will compare with the help of array index that which would come first.

		int[] index = new int[26];
		// stores the previous occurence of the character
		// only one traversal.
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int x = (int) (ch - 'a');
			count[x]++;
			index[x] = i;

		}
		// connstant time loop
		// O(1) will be time complextity for the constant time loop,
		int min_ind = Integer.MAX_VALUE;

		for (int i = 0; i < count.length; i++) {
			if (count[i] == 1) {
				if (min_ind > index[i]) {
					min_ind = index[i];
				}
			}
		}
		return str.charAt(min_ind);
	}

}

/*
Test cases:
	pepcoding
	-------------
	e
	
	geeksforgeeeks
	----------------------
	f
	
	
	worldisallaboutmoney
	----------------------
	w
	
	Source: https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
	*/



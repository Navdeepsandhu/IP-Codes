package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_127RepeatedSubsequenceOfLength2OrMore {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		if (getprob(str)) {
			System.out.println(true);
			;
		} else {
			System.out.println(false);
			;
		}
	}

	public static boolean getprob(String str) {
		int[] check = new int[26];
		for (int i = 0; i < str.length(); i++) {
			check[str.charAt(i) - 'A']++;
			if (check[str.charAt(i) - 'A'] > 3) {
				return true;
			}
		}
		char[] arr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (check[str.charAt(i) - 'A'] == 1) {
				if (i < str.length() - 1) {
					str = str.substring(0, i) + str.substring(i + 1);
				} else {
					str = str.substring(0, i);

				}
			}

		}
		if (Ispalindrome(str)) {
			return false ;
		}else {
			return true; 
	
			}
		}
	

	public static boolean Ispalindrome(String str) {
		int h=str.length()-1,l=0;
				
		while (h > l) {
	        if (str.charAt(l) != str.charAt(h))
	            return false;
	        h--;
	        l++;
		}
	  
		return true;
	}


}

/*
Test cases:
AABBC
----------------------
true


ABCDACB
-----------------
true

AAB
------------------------
false
	
	
	Source: https://www.geeksforgeeks.org/repeated-subsequence-length-2/
 */


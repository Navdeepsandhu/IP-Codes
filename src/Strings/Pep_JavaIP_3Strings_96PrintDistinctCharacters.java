package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_3Strings_96PrintDistinctCharacters {

	public static void printDistinct(String str) {
		int n = str.length();

		// count array will store the count of all characters
		// index array will store the indices of distinct characters
		// if their count is 1.
		int[] count = new int[26];

		for (int i = 0; i < n; i++) {
			char x = str.charAt(i);
			int x1 = (int) (x - 'a');
			++count[x1];
		}
		// O(1) because sorting the constant no. of elements in an array.
		// always 26.
		for (int i = 0; i < n; i++) {
			char x = str.charAt(i);
			int x1 = count[(x - 'a')];
			if(x1==1) {
				System.out.print(x);
			}
			
		}
		
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printDistinct(str);
	}

}

/*
 geeksforgeeks
 --------------------------
for

pepcoding
-------------
ecoding

aabbcdesggfhjjjdkhdbb
-----------------------
cesfk

Source: https://www.geeksforgeeks.org/print-all-distinct-characters-of-a-string-in-order-3-methods/
 */

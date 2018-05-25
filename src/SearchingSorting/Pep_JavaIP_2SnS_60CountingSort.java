package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_60CountingSort {
	// Sort an character array
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		char[] arr = input.toCharArray();
		char[] output=new char[arr.length];
		// Now lets apply counting sort
		// Since all characters lie in the range 0 to 255
		int[] count_array = new int[26];

		for (int i = 0; i < arr.length; i++) {
			count_array[arr[i]-'a']++;
		}

		for (int i = 1; i < count_array.length; i++) {
			count_array[i] += count_array[i - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			// place each arr[i] at its correct position.
			if (count_array[arr[i]-'a'] >= 1) {
				output[count_array[arr[i]-'a']-1] = (char) arr[i];
				count_array[arr[i]-'a']--;
			}
		}

		for (char ch : output) {
			System.out.print(ch);
		}
	}

}
/*

Test cases:
	geeksforgeeks
	-------------------
	eeeefggkkorss
	
	istanbulnewdelhi
	----------------------
	abdeehiillnnstuw

	quickbrownfoxjumpoverthelazydog
	--------------------------
	abcdeefghijklmnoooopqrrtuuvwxyz
	
	Source: https://www.geeksforgeeks.org/counting-sort/
	*/
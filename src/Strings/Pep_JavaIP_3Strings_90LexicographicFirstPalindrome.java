package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_90LexicographicFirstPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		boolean result = ispossible(str);
		if (result == true) {
			int[] fmap = new int[26];
			for (int i = 0; i < str.length(); i++) {
				fmap[str.charAt(i) - 'a']++;
			}

			int left = 0;
			int right = str.length() - 1;
			char ch = '\0';
			for (int i = 0; i < 26; i++) {
				if (fmap[i] % 2 != 0) {
					ch = (char) (i + 'a');
					fmap[i]--;
				}
			}
			char[] str_array = str.toCharArray();
			for (int i = 0; i < 26; i++) {
				if (fmap[i] > 0) {
					int k = fmap[i] / 2;
					int j = 0;
					while (j < k) {
						
						str_array[left] = (char) (i + 'a');
						str_array[right] = (char) (i + 'a');
						left++;
						right--;
						j++;
					}

				}
			}
			if (left == right) {
				str_array[left] = ch;
			}

			for (char ch1 : str_array) {
				System.out.print(ch1);
			}
		} else {
			System.out.println("Not Possible");
		}

	}

	private static boolean ispossible(String str) {

		int[] fmap = new int[26];
		for (int i = 0; i < str.length(); i++) {
			fmap[str.charAt(i) - 'a']++;
		}

		if (str.length() % 2 == 0) {
			for (int i = 0; i < 26; i++) {
				if (fmap[i] % 2 != 0) {
					return false;
				}
			}
		} else {
			boolean flag = false;
			for (int i = 0; i < 26; i++) {
				if (fmap[i] % 2 != 0 && flag == true) {
					return false;
				} else if (fmap[i] % 2 != 0 && flag == false) {
					flag = true;
				}
			}
		}
		return true;
	}

}

/*
Test cases:
	malayalam
	-----------------
	aalmymlaa
	
	
	apple
	--------------------
	Not Possible
	
	
	nitin
	----------------------
	intni
	
	Source: https://www.geeksforgeeks.org/lexicographically-first-palindromic-string/
	*/

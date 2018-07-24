package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_114RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		removeduplicates(str, 0, 0);
	}

	private static void removeduplicates(String str, int vidx, int diff) {
		if (vidx == str.length() - 1) {
			if (diff == vidx) {
				System.out.println(str);
			} else {
				str = str.substring(0, diff) + str.substring(vidx + 1);
				System.out.println(str);
			}
			return;
		}

		if (str.charAt(vidx) == str.charAt(vidx + 1)) {
			removeduplicates(str, vidx + 1, diff);
		} else {
			if (vidx - diff > 0) {
				if (diff != 0) {
					str = str.substring(0, diff) + str.substring(vidx + 1);
					removeduplicates(str, diff - 1, diff - 1);
				} else {
					str = str.substring(vidx + 1);
					removeduplicates(str, 0, 0);
				}
			}
			if (diff - vidx == 0) {
				removeduplicates(str, vidx + 1, vidx + 1);
			}
		}
	}

}

/*
 * Test cases:
  
  azxxzy 
  --------------
  ay
  
  geeksforgeeg
  --------------------
  gksfor
  
  caaabbbaacdddd
  -------------------
  
  acaaabbbacdddd
  ---------------------
  acac
  
  Source:
  https://www.geeksforgeeks.org/recursively-remove-adjacent-duplicates-given-string/
  
  
 */

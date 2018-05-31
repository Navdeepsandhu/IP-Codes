package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_100BinaryRepresentationNextGreaterNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String bnum = scn.next();
		System.out.println(nextGreaternumber(bnum));
	}

	private static String nextGreaternumber(String bnum) {
		int l = bnum.length();
		int i = 0;
		for (i = l - 2; i >= 0; i--) {
			// locate first 'i' from end such that
			// bnum[i]=='0' and bnum[i+1]=='1'
			// swap these value and break;
			if (bnum.charAt(i) == '0' && bnum.charAt(i + 1) == '1') {
				String left = bnum.substring(0, i);
				String right = bnum.substring(i + 2);
				bnum = left + '1' + '0' + right;
				break;
			}
		}

		// if no swapping performed
		if (i == -1) {
			return "-1";
		}
		// Since we want the smallest next value,
		// shift all 1's at the end in the binary
		// substring starting from index 'i+2'
		int j = i + 2, k = l - 1;
		while (j < k) {
			char chj = bnum.charAt(j);
			char chk = bnum.charAt(k);
			if ((chj == '1') && (chk == '0')) {
				// swapping in a string
				String left = bnum.substring(0, j);
				String mid = bnum.substring(j + 1, k);
				String right = bnum.substring(k + 1);
				bnum = left + '0' + mid + '1' + right;
				j++;
				k--;
			} else if (chk == '1') {
				k--;
			} else
				j++;

		}

		// required next greater number
		return bnum;
	}

}

/*
Test cases:
	10010
	-------------------
	10100
	
	11000001110
	----------------------
	11000010011
	
	11111111111
	----------------------
	-1
	
	Source: https://www.geeksforgeeks.org/binary-representation-next-greater-number-number-1s-0s/
	*/





package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_79GenerateAllBinaryStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char[] sarray = s.toCharArray();
		generateBinaryStrings(sarray, 0);

	}
	

	private static void generateBinaryStrings(char[] sarray, int vidx) {
		if (vidx == sarray.length) {
			for (char val : sarray)
				System.out.print(val);
			System.out.println();
			return;
		}
		
		if (sarray[vidx] == '?') {
			sarray[vidx] = '0';
			generateBinaryStrings(sarray, vidx + 1);
			sarray[vidx] = '1';
			generateBinaryStrings(sarray, vidx + 1);
			sarray[vidx]='?';
			

		}else {
			generateBinaryStrings(sarray, vidx+1);
		}
	}

}

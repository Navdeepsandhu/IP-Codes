package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_102PrintShortestCommonSuperSequence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String one=scn.next();
		String two=scn.next();
		supersequence(one, two);
	}

	private static void supersequence(String one, String two) {
		String[][] superseq=new String[one.length()+1][two.length()+1];
		int j=two.length();
		for(int i=0; i<one.length(); i++) {
			superseq[i][j]=one.substring(i);
		}
		int i=one.length();
		for(j=0; j<two.length(); j++) {
			superseq[i][j]=two.substring(j);
		}
		
		for(i=one.length()-1; i>=0; i--) {
			for(j=two.length()-1; j>=0; j--) {
				if(one.charAt(i)!=two.charAt(j)) {
					String f1=one.charAt(i)+superseq[i+1][j];
					String f2=two.charAt(j)+superseq[i][j+1];
					superseq[i][j]=(f1.length()>f2.length())?f2:f1;
				}else {
					superseq[i][j]=one.charAt(i)+superseq[i+1][j+1];
				}
			}
		}
		
		System.out.println(superseq[0][0]);
	}

}

/*
Test cases:

pepforpepepep
pep
---------------
pepforpepepep


geeksforgeeks
hello
----------------------
geheksfllorgeeks


abacdssaaa
xyzsabaa
------------------------
xyzsabacdssaaa
	
	
	Source: https://www.geeksforgeeks.org/print-shortest-common-supersequence/
 */


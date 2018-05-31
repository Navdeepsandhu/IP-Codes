package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_122ValidityOfSentences {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();

		// starting character must be capital and last character must be full stop
		if (line.charAt(0) < 'A' || line.charAt(0) > 'Z') {
			System.out.println("Invalid");
			return;
		}
		if (line.charAt(line.length() - 1) != '.') {
			System.out.println("Invalid");
			return;
		}
		char prevstate=line.charAt(0);
		checkvalidity(line, 1, prevstate);

	}

	private static void checkvalidity(String line, int vidx, char prevstate) {
		if(vidx==line.length()) {
			System.out.println("Valid");
			return;
		}
		if(prevstate>='A' && prevstate<='Z') {
			if((line.charAt(vidx) >= 'a' && line.charAt(vidx) <= 'z') || line.charAt(vidx)==' ' || line.charAt(vidx)=='.') {
				prevstate=line.charAt(vidx);
				checkvalidity(line, vidx+1, prevstate);
			}else {
				System.out.println("Invalid");
				return;
			}
		}
		else if(prevstate>='a' && prevstate<='z') {
			if(line.charAt(vidx)==' ' || line.charAt(vidx)=='.' || (line.charAt(vidx) >= 'a' && line.charAt(vidx) <= 'z')) {
				prevstate=line.charAt(vidx);
				checkvalidity(line, vidx+1, prevstate);
			}else {
				System.out.println("Invalid");
				return;
			}
		}else if(prevstate==' ') {
			if((line.charAt(vidx) >= 'a' && line.charAt(vidx) <= 'z') || (line.charAt(vidx) >= 'A' && line.charAt(vidx) <= 'Z')) {
				prevstate=line.charAt(vidx);
				checkvalidity(line, vidx+1, prevstate);
			}else {
				System.out.println("Invalid");
				return;
			}
		}else {
			if(line.charAt(vidx)==' ') {
				prevstate=line.charAt(vidx);
				checkvalidity(line, vidx+1, prevstate);
			}else {
				System.out.println("Invalid");
				return;
			}
		}
	}

}
/*
 * Test cases:
My name is Ram.
----------------------------
Valid
 
 The vertex is S.
 -----------------------
 Valid


GeeksQuiz. is a quiz site.
-------------------------------
Invalid

I love cinema
---------------------
Invalid
  
 
  Source:
 https://www.geeksforgeeks.org/check-given-sentence-given-set-simple-grammer-rules/
  
  
 */



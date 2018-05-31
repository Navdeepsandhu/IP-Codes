package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_91LongestNonPalindromicSubString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		char ch=str.charAt(0);
		boolean flag=false;
		//check if all the characters are same.
		for(int i=1; i<str.length(); i++) {
			if(ch!=str.charAt(i)) {
				flag=true;
				break;
			}
		}
		//flag=false, all characters are same
		if(flag==false) {
			System.out.println("0");
			return;
		}
		boolean result=ispalindrome(str);
		if(result==true) {
			System.out.println(str.length()-1);
		}else {
			System.out.println(str.length());
		}
		
	}

	private static boolean ispalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}

/*
Test cases:
	nitin
	-----------------
	4
	
	
	apple
	--------------------
	5
	
	
	aaaaaaaaaaa
	----------------------
	0
	
	Source: https://www.geeksforgeeks.org/longest-non-palindromic-substring/
	*/


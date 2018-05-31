package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_89LargestPalindromeBySwappingKDigits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int k= scn.nextInt();
		
		char[] str_array=str.toCharArray();
		char[] palin=new char[str_array.length];
		
		//ispossible routine
		int left=0;
		int right=str_array.length-1;
		while(left<=right) {
			if(str_array[left]!=str_array[right]) {
				palin[left]=(char) Math.max(str_array[left], str_array[right]);
				palin[right]=(char) Math.max(str_array[left], str_array[right]);
				k--;
			}else {
				palin[left]=str_array[left];
				palin[right]=str_array[left];
			}
			left++;
			right--;
		}
		
		if(k<0) {
			System.out.println("Not Possible");
			return;
		}
		
		//Now lets make changes for the largest palindrome possible
		left=0;
		right=str.length()-1;
		while(left<=right) {
			if(left==right) {
				if(k>0) {
					palin[left]='9';
				}
			}
			
			if(palin[left]<'9') {
				if(k>=2 && palin[left]==str_array[left] && palin[right]==str_array[right]) {
					//we haven't made any changes here
					palin[left]='9';
					palin[right]='9';
					k-=2;
				}
				else if(k>=1 && (palin[left]!=str_array[left] || palin[right] != str_array[right])) {
					k-=1;
					palin[left]='9';
					palin[right]='9';
				}
			}
			
			left++;
			right--;
		}
		
		//Now we have tp print it
		for(char ch: palin) {
			System.out.print(ch);
		}

	}

}
/*
Test cases:
	43435
	2
	-------------
	93439
	
	43435
	1
	----------------------
	53435
	
	
	12345
	1
	----------------------
	Not Possible
	
	Source:https://www.geeksforgeeks.org/make-largest-palindrome-changing-k-digits/
	*/
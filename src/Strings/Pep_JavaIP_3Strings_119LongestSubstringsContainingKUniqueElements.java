package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Pep_JavaIP_3Strings_120LongestSubstringsContainingKUniqueElements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k=scn.nextInt();
		printsubstring(str, k);
	}

	private static void printsubstring(String str, int k) {
		int max_window_size=0;
		int max_window_start=0;
		int u=0;
		int[] fmap=new int[26];
		for(int i=0; i<str.length(); i++) {
			if(fmap[str.charAt(i)-'a']==0) {
				u++;
			}
			fmap[str.charAt(i)-'a']++;
		}
		
		if(u<k) {
			return;
		}
		
		int curr_start=0,curr_end=0;
		Arrays.fill(fmap,0);
		fmap[str.charAt(0)-'a']++;
		for(int i=1; i<str.length(); i++) {
			fmap[str.charAt(i)-'a']++;
			curr_end++;
			while(!isValid(fmap,k)) {
				fmap[str.charAt(curr_start)-'a']--;
				curr_start++;
			}
			
			if (curr_end-curr_start+1 > max_window_size)
	        {
	            max_window_size = curr_end-curr_start+1;
	            max_window_start = curr_start;
	        }
		}
		
		System.out.println(str.substring(max_window_start, max_window_start+max_window_size));
	}

	private static boolean isValid(int[] fmap, int k) {
		int val=0;
		for(int i=0; i<26; i++) {
			if(fmap[i]>0) {
				val++;
			}
		}
		return k>=val;
	}

}

/*
 * Test cases:
aabbcc
1
 ---------------
 aa
 
 aabbccd
2
 ---------------
 aabb
 
 
 xaabbccdghiiiii
3
 ---------------
 ghiiiii
  
 
  Source:
 https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/
  
  
 */



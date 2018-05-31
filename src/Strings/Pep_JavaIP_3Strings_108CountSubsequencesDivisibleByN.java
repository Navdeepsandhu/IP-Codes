package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_108CountSubsequencesDivisibleByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);
	       String str=scn.next();
	       
		   int n=scn.nextInt();
		   //returning the total no. of subsequences in a string divisible by n.
		   
	       System.out.println( getprob( str, n));
	      
	       
	}

	public static int getprob(String str1, int n) {
		int len = str1.length();
		 char[] str=str1.toCharArray();
		 		 //dp[i][j] represents the subsequences formed till length i
		 //and remainder j.
		 int[][] dp=new int[len][n];
		 
		// Starting with first digit.
	    dp[0][(str[0]-'0')%n]++;
	 
	    for (int i=1; i<len; i++)
	    {
	        // start a new subsequence with index i
	        dp[i][(str[i]-'0')%n]++;
	 
	        for (int j=0; j<n; j++)
	        {
	            // exclude i'th character from all the
	            // current subsequences of string [0...i-1]
	            dp[i][j] += dp[i-1][j];
	 
	            // include i'th character in all the current
	            // subsequences of string [0...i-1]
	            dp[i][(j*10 + (str[i]-'0'))%n] += dp[i-1][j];
	        }
	    }
	    //returning all the subsequences sum formed with zero remainder.
	    return dp[len-1][0];
	}

}

/*
Test cases:
	1234
	4
	-------------
	4
	
	330
	6
	----------------------
	4
	
	
	676
	6
	----------------------
	3
	
	Source: https://www.geeksforgeeks.org/number-subsequences-string-divisible-n/
	*/


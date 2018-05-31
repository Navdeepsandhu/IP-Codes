package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_104FirstStringSubsequenceofOther {

	static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        int j = 0;
         
        //traverse both the strings by j and i.
        //j is for the smaller string 
        //i is for the greater string.
        
        for (int i=0; i<n&&j<m; i++)
            if (str1.charAt(i) == str2.charAt(j))
                j++;
 
        // If all characters of str1 were found in str2
        return (j==m); 
        //if j becomes the length of the string ,then 
        //subsequence is proved.
        
    }
     
        public static void main (String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();//greater
        int m=scn.nextInt();//smaller
        String str1=scn.next();
        String str2=scn.next();

        boolean res = isSubSequence(str1, str2, m, n);
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
/*
Test cases:
	8
	4
	abcdefgh
	aefg
	----------------------
	Yes
	
	8
	4
	abcdefgh
	aefz
	----------------------
	No
	
	10
	6
	abcdefghdd
	aefghd
	----------------------
	Yes
	
	Source: https://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
	*/

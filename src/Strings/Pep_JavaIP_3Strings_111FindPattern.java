package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_111FindPattern {

	 static int patternCount(String str)
	    {
	        /* Variable to store the last character*/
	        char last = str.charAt(0);
	     
	        int i = 1, counter = 0;
	        while (i < str.length())
	        {
	            /* We found 0 and last character was '1',
	            state change*/
	            if (str.charAt(i) == '0' && last == '1')
	            {
	                while (str.charAt(i) == '0')
	                    i++;
	     
	                // After the stream of 0's, we 
	                // got a '1',counter incremented
	                if (str.charAt(i) == '1')
	                    counter++;
	            }
	     
	            /* Last character stored */
	            last = str.charAt(i);
	            i++;
	        }
	     
	        return counter;
	    }
	     
	    public static void main (String[] args)
	    {
	        Scanner scn=new Scanner(System.in);

	        String str = scn.next();
	        
	        System.out.println(patternCount(str));
	         
	    }

}

/*
Test cases:
	1101001
	---------------
	2

	
	10001abc101
	-----------------
	2
	
	
	110001001101
	--------------
	3

	
	Source: https://www.geeksforgeeks.org/find-patterns-101-given-string/
	*/



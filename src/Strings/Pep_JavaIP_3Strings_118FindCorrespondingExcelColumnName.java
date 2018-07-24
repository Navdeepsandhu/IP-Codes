package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_119FindCorrespondingExcelColumnName {

	private static void printString(int columnNumber)
    {
        // To store result (Excel column name)
        StringBuilder columnName = new StringBuilder();
 
        while (columnNumber > 0)
        {
            // Find remainder
            int rem = columnNumber % 26;
 
            // If remainder is 0, then a 
            // 'Z' must be there in output
            if (rem == 0)
            {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else // If remainder is non-zero
            {
                columnName.append((char)((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
 
        // Reverse the string and print result
        System.out.println(columnName.reverse());
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
    	int num=scn.nextInt();
    	printString(num);
    }

}

/*
 * Test cases:
 12
 ---------------
 L
 
 51
 ------------
 AY
 
 52
 -----------------
 AZ
 
 80
 --------------------
 CB
 
 676
 --------------------
 YZ
 
 702
 ----------------
 ZZ

 705
 ---------------	
 AAC
  
 
  Source:
  https://www.geeksforgeeks.org/find-excel-column-name-given-number/
  
  
 */


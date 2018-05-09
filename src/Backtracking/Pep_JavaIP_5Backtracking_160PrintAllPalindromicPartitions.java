package Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pep_JavaIP_5Backtracking_160PrintAllPalindromicPartitions {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		String s=scn.next();
		ArrayList<ArrayList<String>> answer= new ArrayList<>();
		printallpartitions(s,answer);
		
	}
	
	private static void printallpartitions(String s, ArrayList<ArrayList<String>> answer) {
		ArrayList<String> temporary=new ArrayList<>();
		answer=returnStrings(answer,s,temporary,0);
		printSolutions(answer);
	}

	private static void printSolutions(ArrayList<ArrayList<String>> answer) {
		for(ArrayList<String> al: answer) {
			for(String s: al) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

	private static ArrayList<ArrayList<String>> returnStrings(ArrayList<ArrayList<String>> answer, String s,
			ArrayList<String> temporary, int index) {
		int len=s.length();
		String str="";
		ArrayList<String> current=new ArrayList<>(temporary);//to save arraylist in current state
         
        // Iterate over the string
        for (int i =  index; i < len; ++i)
        {
            str = str + s.charAt(i);
             
            // check whether the substring is 
            // palindromic or not
            if (ispalindrome(str))
            {
                // if palindrome add it to temp list
                temporary.add(str);
                 
                if (i + 1 < len)
                {    
                    // recurr to get all the palindromic
                    // partitions for the substrings
                    answer = returnStrings(answer,s,temporary,i+1);
                }
                else
                {
                    // if end of the string is reached 
                    // add temp to v
                    answer.add(temporary);
                }
                 
                // temp is reinitialize with the 
                // earlier current state
                temporary = new ArrayList<>(current);
            }
        }
		
		
		return answer;
	}

	public static boolean ispalindrome(String str) {
		int len=str.length()-1;
		for(int i=0; i<len; i++) {
			if(str.charAt(i)!=str.charAt(len)) {
				return false;
			}
			len--;
		}
		return true;
	}
	
}

package Backtracking;

import java.util.HashMap;
import java.util.Scanner;


public class Pep_JavaIP_5Bactracking_159WordBreakProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
			int sizeofdictionaryarray = scn.nextInt();
			String[] Dictionary = new String[sizeofdictionaryarray];
			for (int i = 0; i < Dictionary.length; i++) {
				Dictionary[i] = scn.next();
			}
			String ques = scn.next();
	
			hashmap_prep(Dictionary);
			solve(ques, "");
			if(!found) {
				System.out.println("Empty");
			}
			
		
		
	}

	/*
	 * 5
lr m lrm hcdar wk 
hcdarlrm
	 * static String[] Dictionary= {"mobile","samsung","sam","sung", "man","mango",
	 * "icecream","and", "go","i","love","ice","cream"}; Size of this dictionary is
	 * : 12 Words: mobile samsung sam sung man mango icecream and go i love ice cream
	 * cream
	 */
	static HashMap<String, Boolean> Dictionarydb = new HashMap<>();

	public static void hashmap_prep(String[] Dictionary) {
		Dictionarydb = new HashMap<>();
		for (int i = 0; i < Dictionary.length; i++) {
			Dictionarydb.put(Dictionary[i], true);
		}
	}
	static boolean found=false;
	public static void solve(String ques, String ans) {
		if (ques.length() == 0) {
			if(ans.length()!=0) {
				System.out.print("("+ans+")");
				found=true;
			}
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String pre = ques.substring(0, i); // this checks for all prefixes starting from first index of the string

			if (Dictionarydb.containsKey(pre)) { // if the prefix is in the database
				if(ques.substring(i).length()>0)
					solve(ques.substring(i), ans + pre + " ");
				else {
					solve(ques.substring(i), ans + pre);
				}
				// else we make furthe call with question as rest of substring
				// excluding prefix and ans is updated with prefix
			}
		}
	}

}

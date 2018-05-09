/*1. You are given a string of D's and I's, where D represent decreasing and I represent increasing. 
 2. You have to print minimum number possible following this sequence. The number can contain digits from 1 to 9 only.
 3. The digits cannnot be repeated in the number.
 Test Cases: 1. IIDDD
126543

2. DIDI
21435

3. DDIDDIID
321654798

4. DD
321

  */



package Arrays;

import java.util.Scanner;
import java.util.Stack;

public class Pep_JavaIP_32MinimumNumberDISequence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String seqDI=scn.next();
		
		solve(seqDI);
	}

	private static void solve(String seqDI) {
		//We use stack for this question. We keep on pushing onto stack i+1 and we empty the stack when we encounter a I.
		//We go from 0 to seq.length() because for a sequence of 7, we have give a string containing 8 numbers.
		
		String ans="";
		Stack<Integer> st=new Stack<>();
		for(int i=0; i<=seqDI.length(); i++) {
			st.push(i+1);
			if(i==seqDI.length()|| seqDI.charAt(i)=='I'){
				while(!st.empty()) {
					ans+=st.pop();	
				}
			}
		}
		
		System.out.println(ans);
	}

}

/*1. You are given an array of integers. You have to arrange them in a way that it yields biggest number.
 Test Cases : 1. 
5
3 30 34 5 9
----------------
9534330
2.
4
54 546 548 60
------------------
6054854654

 3.
 4
54 543 548 60
 -----------
 6054854543
 
 Paytm
  */

package Arrays;

import java.util.*;

public class Pep_JavaIP_46RearrangePrintBiggestNumber {
	private static void solve(String[] arr) {
		int i;
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				String s1 = a + b;
				String s2 = b + a;
				return s2.compareTo(s1);
			}
		});

		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] arr = new String[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.next();
		}
		solve(arr);

	}

}
/*1. You are given an array of integers. 
2. Let i and j be the array indices. You have to print the maximum difference between j and i, such that arr[j]>arr[i].
3. If there is no such j and i for which this condition is true, then print -1.
Test cases : 1.
9
34 8 10 3 2 80 30 33 1
---------------------
6

2.
10
9 2 3 4 5 6 7 8 18 0
-------------------
8

3. 6
1 2 3 4 5 6
-------------------
5

4. 6
6 5 4 3 2 1
-----------------
-1
*/

package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_36Maximumjminusi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		solve(arr);

	}

	private static void solve(int[] arr) {
		// create a left arr
		int[] larr = new int[arr.length];
		larr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {

			larr[i] = Math.min(larr[i - 1], arr[i]);
		}

		// create a right arr
		int[] rarr = new int[arr.length];
		rarr[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			rarr[i] = Math.max(rarr[i + 1], arr[i]);
		}

		// traverse
		int omaxdiff = Integer.MIN_VALUE;
		int currdiff = Integer.MIN_VALUE;
		for (int i = 0, j = 0; i < arr.length && j < arr.length;) {
			if (rarr[j] > larr[i]) {
				currdiff = j - i;
				j++;
			} else {
				i++;
			}
			if (currdiff > omaxdiff) {
				omaxdiff = currdiff;
			}
		}
		if (omaxdiff != Integer.MIN_VALUE)
			System.out.println(omaxdiff);
		else {
			System.out.println(-1);
		}

	}

}

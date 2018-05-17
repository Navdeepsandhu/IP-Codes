/*1. You are given an array of integers and an integer K. You have to print the largest subarray sum possible using atleast K numbers.

Test Cases:
1. 4
-4 -2 1 3 
2
-------------
4

2. 2
10 -10
1
-------------
10

3. 4
-1 2 -3 4
3
-----------------
3

4. 

 */

package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_31LargestSubarraySumwithAtleastK {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();
		// generate kadanes array
		int[] kadanesarray = solveusingkadanes(arr, k);

		// generate a window of k elements
		int sumofK = arr[0];
		for (int i = 1; i < k; i++) {
			sumofK += arr[i];
		}

		// traverse window and update overallmax
		int overallmax = sumofK;
		for (int i = k; i < arr.length; i++) {
			sumofK += arr[i] - arr[i - k];

			overallmax = Math.max(kadanesarray[i - k] + sumofK, Math.max(sumofK, overallmax));

		}
		System.out.println(overallmax);
	}

	private static int[] solveusingkadanes(int[] arr, int k) {
		int[] kadanesarray = new int[arr.length];
		int currmax = arr[0];
		kadanesarray[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currmax = Math.max(currmax + arr[i], arr[i]);
			kadanesarray[i] = currmax;

		}

		return kadanesarray;
	}

}

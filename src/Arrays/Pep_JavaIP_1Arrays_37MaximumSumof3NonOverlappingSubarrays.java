/*
1. You are given an array of integers. 
2. You are given another integer K, which represents size of subarrays.
3. You have to print the maximum sum possible of 3 k sized non overlapping subarrays.

Test cases:
1.
8
1 2 1 2 6 7 5 1
2
--------------
23

2. 9 
1 3 4 2 8 9 21 -1 3
3
----------------
50

3. 12
3 8 9 3 5 2 1 23 4 5 10 3
3
------------------------
66
*/

package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_37MaximumSumof3NonOverlappingSubarrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int index = 0; index < arr.length; index++) {
			arr[index] = scn.nextInt();
		}
		int k = scn.nextInt();
		solve(arr, k);
	}

	private static void solve(int[] arr, int k) {
		// generating left array sum
		int[] larr = new int[arr.length];
		// sum of first k elements for left array
		int lsum = 0;
		for (int i = 0; i < k; i++) {
			lsum += arr[i];
		}

		// Maximum sum k sized subarray possible till ith index[i,i-k) of arr is stored
		// at larr[i]

		larr[k - 1] = lsum;
		for (int i = k; i < arr.length; i++) {
			lsum += arr[i] - arr[i - k];
			larr[i] = Math.max(larr[i - 1], lsum);
		}

		// generating right array sum
		int[] rarr = new int[arr.length];

		int rsum = 0;
		for (int i = arr.length - 1; i > arr.length - 1 - k; i--) {
			rsum += arr[i];
		}

		// Maximum sum k sized subarray possible till ith index[i,i+(k-1)] of arr is
		// stored at rarr[i]

		rarr[arr.length - k] = rsum;
		for (int i = arr.length - 1 - k; i >= 0; i--) {
			rsum += arr[i] - arr[i + k];
			rarr[i] = Math.max(rarr[i + 1], rsum);
		}

		// traverse for middle subarray
		int ovmax = Integer.MIN_VALUE;

		for (int ti = k; ti + k <= arr.length - k; ti++) {
			int middlesubarraysum = 0;
			int midsubarrayindex = ti;
			for (; midsubarrayindex < ti + k; midsubarrayindex++)
				middlesubarraysum += arr[midsubarrayindex];

			if (ovmax < larr[ti - 1] + middlesubarraysum + rarr[midsubarrayindex]) {
				ovmax = larr[ti - 1] + middlesubarraysum + rarr[midsubarrayindex];

			}
		}

		System.out.println(ovmax);
	}

}

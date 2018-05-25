package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_64MinimumCostToMakeArrayElements {

	public static int computeCost(int arr[], int N, int X) {
		int cost = 0;
		for (int i = 0; i < N; i++)
			cost += Math.abs(arr[i] - X);
		return cost;
	}

	// Method to find minimum cost to make all
	// elements equal
	public static int minCostToMakeElementEqual(int arr[], int N) {
		int low, high;
		low = high = arr[0];

		// setting limits for ternary search by
		// smallest and largest element
		for (int i = 0; i < N; i++) {
			if (low > arr[i])
				low = arr[i];
			if (high < arr[i])
				high = arr[i];
		}

		/*
		 * loop until difference between low and high become less than 3, because after
		 * that mid1 and mid2 will start repeating
		 */
		while ((high - low) > 2) {
			// mid1 and mid2 are representative array
			// equal values of search space
			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;

			int cost1 = computeCost(arr, N, mid1);
			int cost2 = computeCost(arr, N, mid2);

			// if mid2 point gives more total cost,
			// skip third part
			if (cost1 < cost2)
				high = mid2;

			// if mid1 point gives more total cost,
			// skip first part
			else
				low = mid1;
		}

		// computeCost gets optimum cost by sending
		// average of low and high as X
		return computeCost(arr, N, (low + high) / 2);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
		}
		int N = arr.length;
		System.out.println(minCostToMakeElementEqual(arr, N));
	}

}
/*

Test cases:
	5
1 2 3 4 5
------------------
6

	
	8
1 2 3 4 25 36 49 50
--------------
150

	
	4
12 3 4 5
----------------
10
	
	Source: https://www.geeksforgeeks.org/make-array-elements-equal-minimum-cost/
	
	
	
*/
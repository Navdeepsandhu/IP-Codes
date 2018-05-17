package OrderStatsHeapHash;

import java.util.Scanner;
//This one solves the problem in O(n^2)
class Pep_JavaIP_12OrderStatsHeapHash_402PancakeSortingProblem {

	public static void main(String[] args) {
		// here we find the greatest element in the array and flip the array from 0 to i
		// here, after flipping greatest element will reach at the end.
		// So, on and so forth
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = arr.length - 1; i > 0; i--) {
			int pos = findgreatest(arr, 0, i);
			flip(arr, 0, pos);
			flip(arr, 0, i);
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	private static void flip(int[] arr, int i, int pos) {
		int left = i;
		int right = pos;
		while (left < right) {
			swap(left, right, arr);
			left++;
			right--;
		}

	}

	private static int findgreatest(int[] arr, int i, int i2) {
		int max = Integer.MIN_VALUE;
		int pos = -1;
		for (int j = i; j <= i2; j++) {
			if (arr[j] > max) {
				pos = j;
				max = arr[j];
			}
		}
		return pos;
	}

	private static void swap(int j, int pivot, int[] arr) {
		int temp = arr[j] ^ arr[pivot];
		arr[j] ^= temp;
		arr[pivot] ^= temp;
	}

}

package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_15PairSumInSortedAndRotated {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int tar = scn.nextInt();
		int pivot = findPivot(arr, 0, n - 1);
		int left = (pivot + 1) % arr.length;
		int right = pivot;

		while (left != right) {
			if (arr[left] + arr[right] < tar) {
				left = (left + 1) % arr.length;
			} else if (arr[left] + arr[right] > tar) {
				right = (right - 1 + arr.length) % arr.length;
			} else {
				System.out.println(arr[left] + " " + arr[right]);
				left = (left + 1) % arr.length;
				right = (right - 1 + arr.length) % arr.length;
			}
		}

	}

	public static int findPivot(int[] arr, int lo, int hi) {
		if (lo == hi) {
			return lo;
		}
		int mid = (lo + hi) / 2;

		int next = (mid + 1) % arr.length;
		int prev = (mid - 1 + arr.length) % arr.length;
		if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
			return mid;
		}
		else if (arr[lo] > arr[mid]) {
			return findPivot(arr, lo, prev);
		} else
			return findPivot(arr, next, hi);
	}

}

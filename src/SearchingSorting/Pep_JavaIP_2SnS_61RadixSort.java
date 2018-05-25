package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_61RadixSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		radixsort(arr);
	}

	private static void radixsort(int[] arr) {
		int n = getmax(arr);
		for (int exp = 1; n / exp > 0; exp *= 10) {
			countingsort(arr, exp);
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	private static void countingsort(int[] arr, int exp) {
		int[] output = new int[arr.length];
		// we are here sorting on the basis (arr[i]/exp)%10th digit
		int[] count = new int[10];
		for (int i = 0; i < arr.length; i++) {
			count[(arr[i] / exp) % 10]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}

	private static int getmax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}

/*
 Test cases:
 8
170 45 75 90 802 24 2 66
------------------------------- 
 2 24 45 66 75 90 170 802
 
 8
170 45 75 90 803 24 2 67
------------------------------- 
 2 24 45 67 75 90 170 803
 
 8
170 45 75 99 803 24 2 68
------------------------------- 
 2 24 45 68 75 99 170 803
 
 Source: https://www.geeksforgeeks.org/radix-sort/
 */

package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_6Greedy_174MinimumNumberofCoins {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		int Value = scn.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		solve(Value, arr, 0);

	}

	private static void solve(int value, int[] arr, int csf) {
		if (value == 0) {
			System.out.println(csf);
			return;
		}

		// 1. find just smaller or equal denomination to given value
		int index = Arrays.binarySearch(arr, value);
		if (index < 0) {
			index = -(index + 2);
		}
		// 2. add it to the result
		csf += 1;
		// 3. recursively call for value-denomination
		solve(value - arr[index], arr, csf);

	}

}

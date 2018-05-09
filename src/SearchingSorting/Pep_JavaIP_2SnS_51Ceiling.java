package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_51Ceiling {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
		}

		int ceiling_number = scn.nextInt();
		int answer = solve(arr, ceiling_number, 0, arr.length - 1);
		if (answer != -1)
			System.out.println(arr[answer]);
		else {
			System.out.println("There is no ceiling");
		}
	}

	private static int solve(int[] arr, int ceiling_number, int lo, int hi) {
		if (ceiling_number < arr[lo]) {
			return lo;
		}
		if (ceiling_number > arr[hi]) {
			return -1;
		}
		int mid = (lo + hi) / 2;
		if (arr[mid] == ceiling_number) {
			return arr[mid];
		} else if (arr[mid] > ceiling_number) {
			if (mid - 1 >= lo && arr[mid - 1] < ceiling_number) {
				return mid;
			} else {
				return solve(arr, ceiling_number, lo, mid - 1);
			}
		} else {
			if (mid + 1 <= hi && arr[mid + 1] >= ceiling_number) {
				return mid + 1;
			} else {
				return solve(arr, ceiling_number, mid + 1, hi);
			}
		}


	}

}

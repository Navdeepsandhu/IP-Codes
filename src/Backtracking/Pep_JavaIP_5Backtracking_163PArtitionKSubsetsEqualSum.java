package Backtracking;

import java.util.Scanner;
/*15
29 28 51 85 59 21 25 23 70 97 82 31 85 93 73
3
*/
public class Pep_JavaIP_5Backtracking_163PArtitionKSubsetsEqualSum {
	static boolean ispossible = false;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();
		String[] subset = new String[k];
		for (int i = 0; i < subset.length; i++) {
			subset[i] = "";
		}
		int[] subsetsum = new int[k];
		solve(arr, subsetsum, subset, 0);
		if (ispossible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void solve(int[] arr, int[] subsetsum, String[] subset, int vidx) {
		if (vidx == arr.length) {
			for (int i = 1; i < subsetsum.length; i++) {
				if (subsetsum[i] != subsetsum[i - 1])
					return;
			}

			ispossible = true;

			return;
		}

		for (int i = 0; i < subset.length; i++) {
			subsetsum[i] += arr[vidx];
			String str="" + arr[vidx] + " ";
			subset[i] += "" + arr[vidx] + " ";
			solve(arr, subsetsum, subset, vidx + 1);
			subsetsum[i] -= arr[vidx];
			subset[i] = subset[i].substring(0, subset[i].length() - str.length());
		}
	}
	
	public static void solvePair(int[] arr, int vidx, String set1, String set2, )

}

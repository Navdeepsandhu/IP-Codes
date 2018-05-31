package Strings;

import java.util.Scanner;

public class Pep_JavaIP_3Strings_99CountBinaryStringsWithKAdjacentOnes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		System.out.println(count_seq(n, k));

	}

	public static int count_seq(int n, int k) {
		// dp[i][j][l] => represents number of subsequences formed from i digits
		// with j adjacent 1's ending with l digit.
		int[][][] dp = new int[n + 1][k + 1][2];
		dp[1][0][0] = 1;
		dp[1][0][1] = 1;

		for (int i = 2; i <= n; i++) {
			// number of adjacent 1's can not exceed i-1
			for (int j = 0; j < i && j <= k; j++) {

				// only two equations.
				// generating sequences ending with 1 and 0 by adding 0 and 1 respectively.

				dp[i][j][0] = dp[i - 1][j][0] + dp[i - 1][j][1];
				dp[i][j][1] = dp[i - 1][j][0];

				if (j - 1 >= 0)
					dp[i][j][1] += dp[i - 1][j - 1][1];
			}
		}
		// return the total strings ending with 0 and 1 containing k 1's.
		return dp[n][k][0] + dp[n][k][1];
	}

}

/*
Test cases:
	5 2
	----------------------
	6
	
	6 4
	----------------------
	2
	
	
	10 4
	----------------------
	116
	
	Source: https://www.geeksforgeeks.org/count-binary-strings-k-times-appearing-adjacent-two-set-bits/
	*/




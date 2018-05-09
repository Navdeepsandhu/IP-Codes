package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_27StockBuySellktimes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		/*//Geeks
		int t = scn.nextInt();
		for (int not = 0; not < t; not++) {

			int k = scn.nextInt();
			int[] arr = new int[scn.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(solve(arr, k));
		}
*/	
		//Hackerrank
		int k = scn.nextInt();
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solve(arr, k));
	}

	public static int solve(int[] arr, int k) {
		int[][] maxprofit = new int[k + 1][arr.length];

		for (int i = 1; i < maxprofit.length; i++) {
			for (int j = 1; j < maxprofit[0].length; j++) {
				int f1 = maxprofit[i][j - 1];

				int max = Integer.MIN_VALUE;
				for (int k1 = 0; k1 < j; k1++) {
					int f2 = arr[j] - arr[k1] + maxprofit[i - 1][k1];
					if (f2 > max) {
						max = f2;
					}
				}

				maxprofit[i][j] = Math.max(f1, max);
			}
		}

		return maxprofit[k][arr.length - 1];
	}

}

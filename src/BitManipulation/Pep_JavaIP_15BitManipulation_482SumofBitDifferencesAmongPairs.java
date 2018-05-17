package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_482SumofBitDifferencesAmongPairs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int ans = 0;
		for (int i = 0; i <= 31; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				// count no of set bits at ith position in all numbers
				if ((arr[j] & (1 << i)) == (1<<i)) {
					// this is possible when ith bit of arr[i] is set or '1'
					count++;
				}
			}
			// count represents number of 1 at ith position of each number
			// arr.length-count represents number of 0 at ith position of each number
			int f2 = arr.length - count;
			ans += (count * (arr.length - count) * 2);

		}

		System.out.println(ans);
	}

}

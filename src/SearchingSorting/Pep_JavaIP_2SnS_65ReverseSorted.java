package SearchingSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_2SnS_65ReverseSorted {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		int[] output = new int[arr.length];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
			output[i1] = arr[i1];
		}

		Arrays.sort(arr);

		int left = 0, right = arr.length - 1;
		for (left = 0; left < arr.length; left++) {
			if (arr[left] != output[left]) {
				break;
			}
		}
		if (left == arr.length) {
			System.out.println("Yes");
			return;
		}
		for (; right >= left; right--) {
			if (arr[right] != output[right]) {
				break;
			}
		}

		// if we have decreasing order from left to right, then print yes
		for (int i = right; i > left; i--) {
			if (!(output[i] < output[i - 1])) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}

/*
 Test cases
4
2 5 3 4
--------------
No

5
13 14 15 17 16
------------------
Yes


10
1 2 3 4 5 6 7 8 9 10
-------------------------
Yes

Source: https://www.geeksforgeeks.org/check-reversing-sub-array-make-array-sorted/

 */

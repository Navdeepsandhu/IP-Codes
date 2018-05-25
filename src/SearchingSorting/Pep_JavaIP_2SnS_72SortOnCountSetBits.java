package SearchingSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_2SnS_72SortOnCountSetBits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int n = getmax(arr);
		int count = countbits(n);
		Arrays.sort(arr);
		// make an array of size count+1, to include count as index
		ArrayList<Integer>[] count_Array = new ArrayList[count + 1];
		for (int i = 0; i < count_Array.length; i++) {
			count_Array[i]=new ArrayList();
		}
		for (int i = 0; i < arr.length; i++) {
			int countsetbits = countsetbits(arr[i]);
			count_Array[countsetbits].add(arr[i]);
		}

		for (int i = count_Array.length - 1; i >= 0; i--) {
			if (count_Array[i].size() != 0) {
				for(int val: count_Array[i]) {
					System.out.print(val+" ");
				}
			}
		}
	}

	private static int countbits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n >>= 1;
		}
		return count;
	}

	private static int getmax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	private static int countsetbits(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1)
				count++;
			n >>= 1;
		}
		return count;
	}

}


/*
Test cases:

5
1 3 6 10 15
--------------
15 3 6 10 1 

4
2 1 6 5
----------------
5 6 1 2 

6
10 19 8 11 15 9
--------------
15 11 19 9 10 8 

Source: https://www.geeksforgeeks.org/sort-array-according-count-set-bits/
*/


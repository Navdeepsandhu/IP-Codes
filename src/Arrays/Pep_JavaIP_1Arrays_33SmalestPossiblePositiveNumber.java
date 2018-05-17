/*1. You are given an array of positive integers in non-decreasing order. 
 * You have to print the smallest natural number that cannot be represented as 
 sum of any subset in given array.  
1. 6
1 3 6 10 11 15
-------------
2

2. 4
1 1 1 1
------------------
5

3. 4
1 1 3 4
-------------
10

4. 6
1 2 5 10 20 40
--------------
4

5. 6
1 2 3 4 5 6
------------
22

*/

package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_33SmalestPossiblePositiveNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int res = 1;
		for (int i = 0; i < arr.length && arr[i] <= res; i++) {
			res += arr[i];
		}

		System.out.println(res);
	}

}

/*sumeet_malik
ddeepu
vikz2708
pankajshokeen751
*/
package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_48MajorityElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
		}

		int z = findmajority(arr);
		if (z != -1) {
			boolean result = isMajority(arr, z);
			if (result) {
				System.out.println(z);
			} else {
				System.out.println("NO Majority Element");
			}
		} else {
			System.out.println("NO Majority Element");
		}
	}

	private static boolean isMajority(int[] arr, int z) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (z == arr[i]) {
				count++;
			}
		}
		if (count > arr.length / 2) {
			return true;
		}
		return false;
	}

	private static int findmajority(int[] arr) {

		int count = 1;
		int majorityelement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (count == 0) {
				majorityelement = arr[i];
				count = 1;
			}
			if (arr[i] == majorityelement) {
				count++;
			} else {
				count--;
			}
		}
		if (count != 0)
			return majorityelement;
		else {
			return -1;
		}
	}

}

package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_49SearchingInAnArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
		}
		int ElementToBeSearched = scn.nextInt();
		int k = scn.nextInt();
		int i = searchinsortedarray(arr, ElementToBeSearched, k);

		String result = (i != -1) ? i + "" : "Number is not present";
		System.out.println(result);
	}

	private static int searchinsortedarray(int[] arr, int ElementToBeSearched, int k) {

		int i = 0;
		while (i < arr.length) {
			if (arr[i] == ElementToBeSearched) {
				return i;
			}

			i = i + Math.max(1, Math.abs(arr[i] - ElementToBeSearched) / k);
		}

		return -1;

	}

}

package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_50FindRepeatingAndMissing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Integer[] arr = new Integer[scn.nextInt()];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i]) - 1] < 0) {
				// iska matlab pehle se visited
				// yeh repeating number h
				System.out.println(Math.abs(arr[i]));

			}
			// varna pehli baar visit kar rhe ho
			// negative kar do unko
			else {
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			}
		}

		// ek baar aur traversal loop mai, missing aur repeating print karne ke liye

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				// yeh missing number h
				System.out.println(i + 1);

			}

		}
	}

}

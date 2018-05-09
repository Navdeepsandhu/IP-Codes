package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_3Strings_80SmallestWindow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String s = scn.next();

		solve(s);

	}

	private static void solve(String s) {
		boolean[] arr = new boolean[26];
		int count_unique = 0;
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i) - 'a'] == false) {
				arr[s.charAt(i) - 'a'] = true;
				count_unique++;
			}
		}
		// System.out.println(count_unique); This is correct
		int[] arr_count = new int[26];
		int si = 0, ei = 0;
		int omin = Integer.MAX_VALUE, osi = 0, oei = 0;
		int count_uniquecharaters = 0;
		while (ei < s.length()) {
			if (count_uniquecharaters != count_unique) {
				if (arr_count[s.charAt(ei) - 'a'] == 0) {
					// this means I have come here for the first time
					count_uniquecharaters++;
					arr_count[s.charAt(ei) - 'a']++;
				} else {
					arr_count[s.charAt(ei) - 'a']++;
				}
				ei++;
			} else {
				while (count_uniquecharaters == count_unique) {
					if (omin > ei - si) {
						omin = ei - si;
						osi = si;
						oei = ei;

					}
					arr_count[s.charAt(si) - 'a']--;
					if (arr_count[s.charAt(si) - 'a'] == 0) {
						count_uniquecharaters--;
					}
					si++;

				}
			}

		}

		while (count_uniquecharaters == count_unique) {
			if (omin > ei - si) {
				omin = ei - si;
				osi = si;
				oei = ei;

			}
			arr_count[s.charAt(si) - 'a']--;
			if (arr_count[s.charAt(si) - 'a'] == 0) {
				count_uniquecharaters--;
			}
			si++;

		}

		System.out.println(omin);

	}

}

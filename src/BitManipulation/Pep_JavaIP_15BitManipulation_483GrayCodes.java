package BitManipulation;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_483GrayCodes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<String> al=solve(n);
		for(String str: al) {
			System.out.println(str);
		}

	}

	private static ArrayList<String> solve(int n) {
		if (n == 0) {
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		}

		ArrayList<String> al = solve(n - 1);
		for (int j = al.size() - 1; j >= 0; j--) {
			al.add(al.get(j));
		}
		ArrayList<String> ral = new ArrayList<>();
		for (int j = 0; j < al.size(); j++) {

			String str = al.get(j);
			// for the first half add 0
			if (j < al.size() / 2)
				str = '0' + str;
			// for the second half add 1
			else
				str = '1' + str;
			ral.add(str);

		}

		return ral;
	}
}

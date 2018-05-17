package Greedy;

import java.util.Scanner;

public class Pep_JavaIP_6Greedy_172EgyptianFraction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int nr = scn.nextInt();
		int dr = scn.nextInt();
		// here nr<dr

		solve(nr, dr);
	}

	private static void solve(int nr, int dr) {
		if (nr == 0 || dr == 0) {
			return;
		}
		if (nr % dr == 0) {
			// it does not remain a fraction
			System.out.print(nr/dr);
			return;
		}
		if (dr % nr == 0) {
			// take the case of 6/12
			System.out.print("1/" + dr / nr);
			return;
		}
		if(nr>dr) {
			System.out.print(nr/dr+" + ");
			solve(nr%dr,dr);
			return;
		}
		// first find greatest unit fraction
		int guf = dr / nr + 1;
		System.out.print("1/"+ guf+" + ");
		// recur for (nr/dr - 1/guf)
		solve(nr * guf - dr, dr * guf);
	}

}

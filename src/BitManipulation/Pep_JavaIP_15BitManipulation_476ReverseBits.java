package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_476ReverseBits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		solve(num);
	}

	private static void solve (int n) {
		int revn=0;
		while(n!=0) {
			revn=revn<<1;
			revn=revn|(n&1);
			n>>=1;
		}
		System.out.println(revn);
	}
}

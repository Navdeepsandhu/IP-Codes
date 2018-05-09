package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_477FlipBits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		int xor = num1 ^ num2;
		System.out.println(countsetbits(xor));

	}

	private static int countsetbits(int xor) {
		int count = 0;
		while (xor != 0) {
			if ((xor & 1) == 1) {
				count++;
			}
			xor >>= 1;
		}

		return count;

	}
}

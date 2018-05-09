package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_471CheckNumberISBleak {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		/*
		 * for (int i = 0; i < num; i++) { if (i + countsetbits(i) == num) {
		 * System.out.println("Yes"); return; } } Before observation
		 */
		for (int i = num - ceilLog2(num); i < num - 1; i++) {
			if (i + countsetbits(i) == num) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	static int ceilLog2(int x) {
		// This function gives maximum number of bits that all smaller numbers than x
		// can hold. So, first it calculates maximum number among all its smaller 
		//number. Then it calculates number of bits in it. Hence justified.
		int count = 0;
		x--;

		while (x > 0) {
			x = x >> 1;
			count++;
		}
		return count;
	}

	private static int countsetbits(int i) {
		int count = 0;
		while (i != 0) {
			if ((i & 1) != 0) {
				count++;
			}
			i >>= 1;
		}
		return count;
	}
	/*--------------------------------------------------------------------	
	But there is another observation that maximum no of set bits that any  
	number less than n can have is logn because lets suppose you have 64,
	logn will give us 6. So logn gives no of digits n has. So, you have to
	consider only between n-ceiling(logn) to n-1 */
}

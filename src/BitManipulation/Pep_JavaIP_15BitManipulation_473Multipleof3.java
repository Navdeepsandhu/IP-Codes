package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_473Multipleof3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(ismultipleof3(num));
	}
	private static boolean ismultipleof3(int num) {
		if (num == 0) {
			return true;
		}
		if (num == 1) {
			return false;
		}

		int ocount = 0, ecount = 0;
		while (num != 0) {
			if ((num & 1) != 0) {
				ecount++;
			}

			num >>= 1;
			if ((num & 1) != 0) {
				ocount++;
			}

			num >>= 1;

		}

		return ismultipleof3(Math.abs(ecount - ocount));
	}

	//This is because AB is 2 digit binary number.
	//In decimal, a*10+b=11a-a+b
	//now, for 11a+b-a, to be divisible by 3 or 11,
	//b-a must be divisible by 11. as b,a are made up of
	//1 or 0, so, b must be equal to a for b-a to divisible
	// by 11.
/*	Above can be proved by taking the example of 11 in decimal numbers. (In this context 11 in decimal numbers 
 * is same as 3 in binary numbers)
	If difference between sum of odd digits and even digits is multiple of 11 then decimal
	 number is multiple of 11. Lets see how.

	Lets take the example of 2 digit numbers in decimal
	AB = 11A -A + B = 11A + (B  A)
	So if (B  A) is a multiple of 11 then is AB.

	Let us take 3 digit numbers.

	ABC = 99A + A + 11B  B + C = (99A + 11B) + (A + C  B)
	So if (A + C  B) is a multiple of 11 then is (ABC)

	Let us take 4 digit numbers now.
	ABCD = 1001A + D + 11C  C + 999B + B  A
	= (1001A  999B + 11C) + (D + B  A -C )
	So, if (B + D  A  C) is a multiple of 11 then is ABCD.

	This can be continued for all decimal numbers.
	Above concept can be proved for 3 in binary numbers in the same way.*/
	}

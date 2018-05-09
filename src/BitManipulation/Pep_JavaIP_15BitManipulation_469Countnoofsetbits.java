/*sumeet_malik1188
ddeepu_kumar11
vikz2708
pankajshokeen751*/

package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_469Countnoofsetbits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int count = 0;
		while (number != 0) {
			if ((number & 1) != 0) {
				count++;
			}
			number >>= 1;	//this left shifts the number by 1. 1001 becomes 100
		}

		System.out.println(count);
	}

}
/*
 * The loop runs only set bit no of times. Subtraction of 1 from a number
 * toggles all the bits (from right to left) till the rightmost set bit
 * (including the righmost set bit). So if we subtract a number by 1 and do
 * bitwise & with itself (n & (n-1)), we unset the righmost set bit. If we do n
 * & (n-1) in a loop and count the no of times loop executes we get the set bit
 * count. Beauty of the this solution is number of times it loops is equal to
 * the number of set bits in a given integer.
 */
package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_481IsAPowerof2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int count=countsetbits(num);
		if(count!=1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
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

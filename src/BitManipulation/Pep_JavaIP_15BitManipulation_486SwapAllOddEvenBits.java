package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_486SwapAllOddEvenBits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int evenbits = num & 0xAAAAAAAA;	//	this gives only evenbits
		int oddbits = num & 0x55555555;		//	this gives only oddbits
		evenbits >>= 1;
		oddbits <<= 1;
		System.out.println(oddbits | evenbits);
	}

}



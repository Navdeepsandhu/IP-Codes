package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_475PrintBinaryRepresentation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		printBin(num);
	}

	// Recursion
	/*
	 * private static void printBin(int num) { if(num==0) { return; }
	 * printBin(num/2); System.out.print(num%2); }
	 */
	// iterative
	/*
	 * private static void printBin(int num) { String ans=""; while(num!=0) {
	 * 
	 * ans=num%2+ans; num/=2; } System.out.println(ans); }
	 */
	//iterative 2
	private static void printBin(int num) {
		int i=0;
		for (i = 1 << 30; i > 0; i/=2) {
			if ((num & i) != 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		}
		//System.out.println(i);
	}

}

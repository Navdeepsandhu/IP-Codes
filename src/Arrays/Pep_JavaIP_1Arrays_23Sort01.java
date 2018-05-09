package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_23Sort01 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[scn.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		solve(arr);
		
	}

	public static void solve(int[] arr) {
		int zp = -1;

		int loop_var = 0;
		while (loop_var < arr.length) {
			if (arr[loop_var] == 0) {
				zp++;
				swap(arr, zp, loop_var);
			}
			loop_var++;
		}
		
		printarr(arr);
	}

	private static void printarr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void swap(int[] arr, int fp, int sp) {
		int temp_var = arr[fp] ^ arr[sp]; // fp=first pointer and sp=second pointer
		arr[fp] ^= temp_var;
		arr[sp] ^= temp_var;
	}

}

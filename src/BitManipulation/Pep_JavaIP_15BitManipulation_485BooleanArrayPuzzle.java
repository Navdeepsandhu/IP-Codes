package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_485BooleanArrayPuzzle {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[2];
		arr[0]=scn.nextInt();
		arr[1]=scn.nextInt();
		
		arr[1]=arr[arr[0]];
		arr[0]=arr[1];
		
		System.out.println(arr[0]+" "+arr[1]);
	}

}

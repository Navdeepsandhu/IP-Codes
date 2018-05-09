package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_470FindOddOccuringElement {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[scn.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		int xor=arr[0];
		for(int i=1; i<arr.length; i++) {
			xor^=arr[i];
		}
		
		System.out.println(xor);
	}

}

/*7
1 1 2 2 2 2 5
5
*/

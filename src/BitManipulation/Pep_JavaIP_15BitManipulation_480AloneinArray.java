package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_480AloneinArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int[] arr=new int[num];
		int sum=0;
		
		for(int i=0; i<num; i++) {
			arr[i]=scn.nextInt();
		}
		int nor=arr[0];
		for(int i=1; i<num; i++) {
			
			nor|=arr[i];
			nor=~(nor);
		}
		
		System.out.println(~nor);
		
	}

}

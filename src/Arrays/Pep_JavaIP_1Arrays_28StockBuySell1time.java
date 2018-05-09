package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_28StockBuySell1time {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Geeks
		/*int t = scn.nextInt();
		for (int not = 0; not < t; not++) {

			int[] arr = new int[scn.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(solve(arr));
		}*/
	
		//Hackerrank
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solve(arr));
		
	}
	
	public static int solve(int[] arr) {
		int min=arr[0];
		int maxprofit=Integer.MIN_VALUE;
		
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]-min>maxprofit) {
				maxprofit=arr[i]-min;
			}
			
		}
		
		return maxprofit;
				
	}

}


package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_26StockBuySell2times {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[scn.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		solve(arr);
	}

	public static void solve(int[] arr) {
		int[] max_profit = new int[arr.length];

		// right to left traversal
		int max = arr[arr.length - 1];
		
		
		for (int i = arr.length - 2; i >= 0; i--) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			max_profit[i]=(max-arr[i]>max_profit[i+1])? max-arr[i]: max_profit[i+1];
			
		}
		int min=arr[0];
		int profit=max_profit[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			max_profit[i]=arr[i]-min>0?(arr[i]-min+max_profit[i]):max_profit[i];
			if(max_profit[i]>profit) {
				profit=max_profit[i];
			}
		}
		
		System.out.println(profit);
	}

}

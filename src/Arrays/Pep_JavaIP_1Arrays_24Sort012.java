package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_24Sort012 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[scn.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		solve(arr);
		
	}
	
	public static void solve(int[] arr) {
		int left=0;
		int i=0;
		int right=arr.length-1;
		
		while(i<=right){
			if(arr[i]==0) {
				swap(arr,i,left);
				left++;
				i++;
			}else if(arr[i]==2) {
				swap(arr,i, right);
				right--;
			}else {
				i++;
			}
		}
		
		printarray(arr);
	}
	
	private static void printarray(int[] arr) {
		for(int val:arr) {
			System.out.print(val+ " ");
		}
	
	}

	public static void swap(int[] arr, int fp, int sp) {
		int temp_var=arr[fp]^arr[sp];
		arr[fp]^=temp_var;
		arr[sp]^=temp_var;
	}

}

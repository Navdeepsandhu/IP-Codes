package SearchingSorting;

import java.util.Scanner;

public class Pep_JavaIP_2SnS_593WayPartition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
		}

		quicksort(arr, 0, arr.length-1);
		printarr(arr);
		
	}
	
	private static void printarr(int[] arr) {
		for(int val: arr) {
			System.out.print(val+ " ");
		}
	}

	private static void quicksort(int[] arr, int lo, int hi) {
		if(lo>=hi) {
			return;
		}
		
		int[] two=Threewayquicksort(arr, lo, hi);
		quicksort(arr, lo, two[0]);
		quicksort(arr, two[1], hi);
		
	}

	private static int[] Threewayquicksort(int[] arr, int lo, int hi) {
		int pivot = arr[hi];

		int i = lo;
		int j = hi;
		// here, 0 to i stores the values less than pivot
		// here, i+1 to j-1, stores values equal to pivot
		int itr = lo;
		while (itr <= j) {
			if (arr[itr] < pivot) {
				// swap arr[itr] with pivot
				swap(arr, itr, i);
				i++;
				itr++;
			} else if (arr[itr] == pivot) {
				itr++;
			} else {
				swap(arr, itr, j);
				j--;
			}
		}
		
		int[] two=new int[2];
		two[0]=i-1;
		two[1]=itr;
		return two;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i]^arr[j];
		arr[i]^=temp;
		arr[j]^=temp;
	}

}
/*

Test cases:
	10
	1 1 4 4 5 2 3 9 5 4
	-----------------------
	1 1 2 3 4 4 4 5 5 9 
	
	
	10
	1 1 4 4 5 6 3 9 5 4
	-----------------------
	1 1 3 4 4 4 5 5 6 9
	
	10
	1 1 4 4 5 2 3 9 5 10
	-----------------------
	1 1 2 3 4 4 5 5 9 10
	
	Source: https://www.geeksforgeeks.org/3-way-quicksort-dutch-national-flag/
	
	
	
*/
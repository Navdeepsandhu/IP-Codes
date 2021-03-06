/*1. You are given a number. You have to print number followed by given number in lexicographically sorted 
permutation of all digits of given number.
2. If the number is last element of sorted, then print the first element of the sorted list.   
3. For Example: 123 -> 132 and 5243 -> 5324 and 321 -> 123
Test Cases :
	1. 265410
	 -----------------
	 401256
	 2. 254
	 -----------
	 425
	 3. 654
	 -----------
	 456
	 
Important Information: 
Following are few observations about the next greater number.
1) If all digits sorted in descending order, then output is always reverse of the given number. For example, 4321->1234
2) If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234.
3) For other cases, we need to process the number from rightmost side (why? because we need to find the smallest of all greater numbers)

Following is the algorithm for finding the next greater number.
I) Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than the previously traversed digit. For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9. If we do not find such a digit, then output is “Not Possible”.

II) Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″, the right side of 4 contains “976”. The smallest digit greater than 4 is 6.

III) Swap the above found two digits, we get 536974 in above example.

IV) Now sort all digits from position next to ‘d’ to the end of number. The number that we get after sorting is the output. For above example, we sort digits in bold 536974. We get “536479” which is the next greater number for input 534976.	 
	 
	*/
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_35NextPermutation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String str=Integer.toString(num);
		int[] arr = new int[str.length()];
		int i = arr.length-1;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			arr[i--] = rem;
		}
		
		
		
		arr=solve(arr);
		String res="";
		for(int val: arr) {
			res+=val;
		}
		if(res.equals(str)) {
			reverse(arr,0,arr.length-1);
			String cornercase="";
			for(int val: arr) {
				cornercase+=val;
			}
			System.out.println(cornercase);
			
		}else {
			System.out.println(res);
		}
	}

	private static int[] solve(int[] arr) {
		// traverse the number digit by digit from behind.
		// we dont have to take tension till digit keeps coming greater.
		// we have to stop when digit comes smaller than last digit
		
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]>arr[i+1]) {
				continue;
			}else {
				//when smaller digit comes, we have to find digit just greater than smaller digit
				//swap it
				//reverse the array from i+1 to arr.length-1
				//where i is the index of smaller digit.
				int elementtobeswapped=arr[i];
				int nextgreaterindex=linearsearch(arr,i);
				swap(arr, i, nextgreaterindex);
				reverse(arr, i+1, arr.length-1);
				return arr;
			}
		}
		
		return arr;
	}
	
	private static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i]^arr[j];
			arr[i]^=temp;
			arr[j]^=temp;
			i++;
			j--;
		}
	}

	private static void swap(int[] arr, int i, int nextgreaterindex) {
		int temp=arr[i]^arr[nextgreaterindex];
		arr[i]^=temp;
		arr[nextgreaterindex]^=temp;
	}

	private static int linearsearch(int[] arr, int i) {
		int j=i+1;
		for(; j<arr.length; j++) {
			if(arr[j]<arr[i] ) {
				return j-1;
			}
		}
		
		return j-1;
	}

}

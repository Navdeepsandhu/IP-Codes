/*1. You are given sorted array of positive numbers. You have to rearrange and print the array elements in maximum-minimum form. 
2. Maximum-minimum form means first element is maximum of the array, followed by minimum of array, followed by second max of the array,
followed by second min and so on.
3. Allowed time complexity is O(n) and allowed space complexity is O(1).
Test Cases:
1.
5
0 1 2 3 4 
-------------
4 0 3 1 2  

2.
10
11 31 41 45 49 51 52 58 59 60
---------------------------
60 11 59 31 58 41 52 45 51 49 

3. 9
1 2 3 4 5 6 7 8 9
-------------------
9 1 8 2 7 3 6 4 5
*/ 





//We know odd places are to be filled by minimum element and even places by maximum element.
//Now, we take a max_element= maximum value of the array + 1
//we initialize min_index as 0 and max_index=arr.length-1
//We fill 0th index first, even index by maximum vaues.
// so, we write : arr[i]+=(arr[max_index]%max_element)*max_element
//and similarly for minimum elements :  arr[i]+=(arr[min_index]%max_element)*max_element
//for max elements : arr[max_index]%max_element gives us that element only. Then we multiply it with max_element and this makes it divisible
// arr[max_index]*max_element. And then we store at arr[i]=arr[i]+arr[max_index]*max_element. So that if we if we modulus this value with 
//max_element, it will give us arr[i].
package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_45RearrangeMaximumMinimumForm {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[scn.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		rearrange(arr);
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
	}

	private static void rearrange(int[] arr) {
		int max_element=arr[arr.length-1]+1;
		int max_index=arr.length-1;
		int min_index=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				arr[i]+=(arr[max_index]%max_element)*max_element;
				max_index--;
			}else {
				arr[i]+=(arr[min_index]%max_element)*max_element;
				min_index++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i]/max_element;
		}
	}

}

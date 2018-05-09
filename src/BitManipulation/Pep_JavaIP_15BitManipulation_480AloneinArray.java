package BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_480AloneinArray {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		HashMap<Integer,Boolean> map=new HashMap<>();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += (arr[i]);
			map.put(arr[i],true);
		}
		 int sumofuniqueelements = 0;
		ArrayList<Integer> al =new ArrayList<>(map.keySet());
		for(int val: al) {
			 sumofuniqueelements+= val;
		}
		
		int uniquenum=3*sumofuniqueelements-(sum);
		System.out.println(uniquenum/2);

	}
	
	
/*	 twos = twos | (ones & arr[i]);
     ones = ones ^ arr[i];
     common_bit_mask = ~(ones & twos);
     ones &= common_bit_mask;
     twos &= common_bit_mask;*/

}

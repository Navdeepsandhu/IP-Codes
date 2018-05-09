/*sumeet_malik1188
ddeepu_kumar11
vikz2708
pankajshokeen751*/
package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_468Find2NonRepeatingElementsinArrayofRepeatingElements {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s="";
		int[] arr=new int[scn.nextInt()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		int xor=arr[0];
		for(int i=1; i<arr.length; i++) {
			xor^=arr[i];
		}
		
		//Now we want to find last set bit of this xor result 
		// because in xor, set bits are the places where both numbers will differ.
		
		int lastsetbit=xor & -xor;
	
		//Now we divide the numbers into 2 sets, those who on doing 
		//& operation with lastsetbit gives lastsetbit itself and those who give zero on & operation 
		int x=0; int y=0;//because anything xor 0=that same number
		for(int i=0; i<arr.length; i++) {
			if((arr[i] & lastsetbit)==lastsetbit) {
				x^=arr[i];
			}else {
				y^=arr[i];
			}
		}
		
		//the non repeating elements are x and y
		
		System.out.println(x+" "+y);
		
		
	}
	

}

/*
6
1 2 2 1 7 8

7 8*/

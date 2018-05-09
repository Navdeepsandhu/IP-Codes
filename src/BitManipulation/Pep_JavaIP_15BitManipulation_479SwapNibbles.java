package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_479SwapNibbles {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int result =((num & 00001111) << 4) | ((num & 11110000) >> 4); //num & 0xF0 gives us first 4 bits and vice versa
		System.out.println(result);
	}

}

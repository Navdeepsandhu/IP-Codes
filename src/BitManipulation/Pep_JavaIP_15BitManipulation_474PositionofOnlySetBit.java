package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_474PositionofOnlySetBit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int count=countsetbit(num);
		if(count!=1) {
			System.out.println("Invalid");
			return;
		}
		int pos=1;
		while(num!=0) {
			if((num & 1) != 0) {
				break;
			}
			num>>=1;
			pos++;
		}
		
		System.out.println(pos);
	}

	private static int countsetbit(int num) {
		int count=0;
		while(num!=0) {
			if((num & 1) != 0) {
				break;
			}
			num>>=1;
			count++;
		}
		return count;
	}

}

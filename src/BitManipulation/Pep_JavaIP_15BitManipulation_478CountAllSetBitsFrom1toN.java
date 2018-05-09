package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_478CountAllSetBitsFrom1toN {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		int count=countnumberofbitsinnumber(num);
		
		int ans=0;
		for(int i=1; i<=count; i++) {
//			1<<i
			ans+=(1<<i-1)*((num+1)/(1<<i));
			int factor=1<<i;
			int rem=(num+1)%(1<<i);
			if(factor-rem < factor/2) {
				ans+=rem-factor/2;
			}
		}
		System.out.println(ans);
	}

	private static int countnumberofbitsinnumber(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num>>=1;
		}
		return count;
	}

}

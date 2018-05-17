package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_487Calculate7n8 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int ans=(((n<<3)-n)>>3);
		System.out.println(ans);
	}

}

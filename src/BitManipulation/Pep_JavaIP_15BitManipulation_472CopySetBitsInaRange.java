package BitManipulation;

import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_472CopySetBitsInaRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int l=scn.nextInt();
		int r=scn.nextInt();
		int mask=1;
		/*for(int i=l; i<r; i++) {
			mask*=10+1;
		}*///This can be replaced by following code.
		mask=mask<<r-l+1;
		mask-=1;
		mask=mask<<(l-1);

		mask=mask&y;
		mask=mask|x;
		System.out.println(mask);
	}

}

/*10
13
2
3
14
*/
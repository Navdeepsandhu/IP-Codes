package BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_JavaIP_15BitManipulation_484JosephusProblem {

	// Here, k is variable. Bit solution is for the problem where k is fixed to 2
	/*
	 * public static void main(String[] args) { Scanner scn = new
	 * Scanner(System.in); int n = scn.nextInt(); int k=scn.nextInt();
	 * ArrayList<Integer> al=new ArrayList<>(); for(int i=1; i<=n; i++) { al.add(i);
	 * }
	 * 
	 * solve(al, 0,k); }
	 * 
	 * private static void solve(ArrayList<Integer> al, int idx, int k) {
	 * if(al.size()==1) { System.out.println(al); return; } int
	 * idxtoberemoved=(idx+k-1)%al.size(); al.remove(idxtoberemoved);
	 * solve(al,idxtoberemoved,k); }
	 */// k=2, fixed.

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int pos=findMSBPosition(n);
		int j=1<<pos-1;
		n=n^j;
		n<<=1;
		n|=1;
		System.out.println(n);
	}

	private static int findMSBPosition(int n) {
		int pos=0;
		while(n!=0) {
			pos++;
			n>>=1;
		}
		return pos;
	}
}

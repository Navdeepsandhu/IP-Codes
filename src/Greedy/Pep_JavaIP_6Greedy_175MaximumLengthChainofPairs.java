package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_6Greedy_175MaximumLengthChainofPairs {
	static class Pair {
		int start;
		int end;

		public Pair(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Pair[] pairs = new Pair[scn.nextInt()];
		for (int i = 0; i < pairs.length; i++) {
			pairs[i] = new Pair(scn.nextInt(), scn.nextInt());
		}

		solve(pairs);
	}

	private static void solve(Pair[] pairs) {
		int[] arr = new int[pairs.length];
		Arrays.fill(arr, 1);
		int omax=0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(pairs[j].end<=pairs[i].start) {
					if(arr[i]<arr[j]+1) {
						arr[i]=arr[j]+1;
					}
				}						
			}
			if(omax<arr[i]) {
				omax=arr[i];
			}

		}
		
		System.out.println(omax);

	}

}

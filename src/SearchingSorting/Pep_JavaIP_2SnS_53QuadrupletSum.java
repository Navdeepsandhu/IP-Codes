/*7 
	10 2 3 4 5 7 8
23
3 5 7 8 
2 3 8 10 
2 4 7 10
10, 20, 30, 40, 1, 2 
*/
package SearchingSorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Pep_JavaIP_2SnS_53QuadrupletSum {

	static class Pair implements Comparable<Pair> {
		int sum;
		int fp;
		int sp;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.sum - o.sum;
		}
	}

	static class RPair {
		int[] arr = new int[4];

		public RPair(int one, int two, int three, int four) {
			arr[0] = one;
			arr[1] = two;
			arr[2] = three;
			arr[3] = four;
			Arrays.sort(arr);
		}

		@Override
		public int hashCode() {
			int hc = arr[0];

			for (int i = 1; i < arr.length; i++) {
				hc <<= 5;
				hc ^= arr[i];
			}

			return hc;
		}

		@Override
		public boolean equals(Object obj) {
			for (int i = 0; i < this.arr.length; i++) {
				if (arr[i] != ((RPair)obj).arr[i]) {
					return false;
				}
			}

			return true;
		}

		public String toString() {
			return arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3];
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = scn.nextInt();
		}

		int target = scn.nextInt();
		Arrays.sort(arr);
		int sizeofpairsumarray = (arr.length * arr.length - 1) / 2;

		Pair[] pairsumarr = new Pair[sizeofpairsumarray];

		for (int i = 0; i < pairsumarr.length; i++) {
			pairsumarr[i] = new Pair();

		}

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				pairsumarr[k].sum = arr[i] + arr[j];
				pairsumarr[k].fp = i;
				pairsumarr[k].sp = j;
				k++;
			}
		}

		Arrays.sort(pairsumarr);

		int left = 0;
		int right = pairsumarr.length - 1;

		HashSet<RPair> res = new HashSet<>();
		while (left < right) {
			if (pairsumarr[left].sum + pairsumarr[right].sum == target) {
				if (isPairValid(pairsumarr[left], pairsumarr[right])) {
					res.add(new RPair(arr[pairsumarr[left].fp], arr[pairsumarr[left].sp], arr[pairsumarr[right].fp],
							arr[pairsumarr[right].sp]));
				}
				left++;
				right--;
			} else if (pairsumarr[left].sum + pairsumarr[right].sum < target) {
				left++;
			} else {
				right--;
			}

		}
		
		for(RPair rpair:res) {
			for(int val: rpair.arr) {
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}

	private static boolean isPairValid(Pair pair, Pair pair2) {
		if (pair.fp != pair2.fp && pair.fp != pair2.sp && pair.sp != pair2.fp && pair.sp != pair2.sp) {
			return true;
		}
		return false;
	}

}

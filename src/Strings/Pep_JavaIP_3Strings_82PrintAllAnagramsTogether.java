package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_3Strings_82PrintAllAnagramsTogether {

	public static class Pair implements Comparable<Pair>{
		int index;
		String s;
		
		
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.s.compareTo(o.s);
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size=Integer.parseInt(scn.nextLine());
		String[] sarr = new String[size];
		String []copiedarr=new String[size];
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = scn.nextLine();
			copiedarr[i]=sarr[i];
		}
		for (int i = 0; i < sarr.length; i++) {
			sarr[i]=solve(sarr[i]);
		}
		
		Pair[] pairs=new Pair[sarr.length];
		for(int i=0; i<pairs.length; i++ ) {
			pairs[i]=new Pair();
			pairs[i].index=i;
			pairs[i].s=sarr[i];
		}
		
		Arrays.sort(pairs);
		for(int i=0; i<pairs.length; i++) {
			System.out.println(copiedarr[pairs[i].index]);
		}
	}

	private static String solve(String sarr) {
		int[] arr = new int[26];
		for (int i = 0; i < sarr.length(); i++) {
			arr[sarr.charAt(i) - 'a']++;
		}

		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != 0) {
				ans += (char) (i + 'a');
				arr[i]--;
			}
		}

		return ans;

	}

}

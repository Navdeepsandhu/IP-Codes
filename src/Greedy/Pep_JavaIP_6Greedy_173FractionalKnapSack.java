package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pep_JavaIP_6Greedy_173FractionalKnapSack {

	static class Pair{
		int value;
		int weight;
		
		public Pair(int value, int weight) {
			this.value=value;
			this.weight=weight;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Pair[] pairs=new Pair[scn.nextInt()];
		int capacity=scn.nextInt();
		for(int i=0; i<pairs.length; i++) {
			pairs[i]=new Pair(scn.nextInt(),scn.nextInt());
		}
		
		
		Arrays.sort(pairs, new Comparator<Pair>() {

			@Override
			//using it this way, gives us desc comparator
			public int compare(Pair o1, Pair o2) {
				return (int) (o2.value/o2.weight)-(o1.value/o1.weight);
			}
		});
		
		int currWeight=0;
		double finalValue=0.0;
		
		for(int i=0; i<pairs.length; i++) {
			if(currWeight+pairs[i].weight<=capacity) {
				currWeight+=pairs[i].weight;
				finalValue+=pairs[i].value;
			}else {
				int remainingcapacity=capacity-currWeight;
				double answer=(double)remainingcapacity/pairs[i].weight;
				finalValue+=pairs[i].value*answer;
				break;
			}
		}
		
		System.out.println(finalValue);
	}

}

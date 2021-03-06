package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_6Greedy_171JobSequencingProblem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Job[] jobs=new Job[scn.nextInt()];
		for(int i=0; i<jobs.length; i++) {
			jobs[i]=new Job(scn.next().charAt(0), scn.nextInt(), scn.nextInt());
		}
		
		Arrays.sort(jobs);
		
		Character[] result=new Character[jobs.length];
		for(int i=0; i<jobs.length; i++) {
			if(result[jobs[i].deadline-1]==null) {
				result[jobs[i].deadline-1]=jobs[i].JobID;
			}else {
				int placeatindex=jobs[i].deadline-1;
				while(placeatindex>=0) {
					if(result[placeatindex]==null) {
						result[placeatindex]=jobs[i].JobID;
						break;
					}
					placeatindex--;
				}
			}
		}
		
		
		for(Character res:result) {
			if(res!=null) {
				System.out.println(res);
			}
		}
		
	}
	
	static class Job implements Comparable<Job>{
		char JobID;
		int deadline;
		int Profit;
		
		public Job(char JobID, int deadline, int profit) {
			this.JobID=JobID;
			this.deadline=deadline;
			this.Profit=profit;
		}
		
		@Override
		public int compareTo(Job o) {
			//Since I want to sort them in decreasing order of profit, so 
			//update the definition accordingly
			return o.Profit-this.Profit;
			//Arrays.sort() always puts smaller thing ahead.
			// I have changed the definition, now even if o.profit is smaller, it will think that answer is for this.profit
			//and keep it ahead and thus it will sort in increasing order.
		}
		
		
	}

}

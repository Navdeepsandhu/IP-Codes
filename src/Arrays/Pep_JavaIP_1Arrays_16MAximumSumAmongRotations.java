package Arrays;

public class Pep_JavaIP_1Arrays_16MAximumSumAmongRotations {
	public static void main(String args[]) {
		
	}
	
	public static void solve(int[] arr) {
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		int first_sum=0;
		for(int i=0; i<arr.length; i++) {
			first_sum+=arr[i]*i;
		}
		
		
	}
}

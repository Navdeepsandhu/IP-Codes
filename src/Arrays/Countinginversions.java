package Arrays;

public class Countinginversions {

	public static void main(String[] args) {
		int[] arr= {2,4,1,5,3};
		
		int[] aux=new int[arr.length];
		int z=mergeSort(arr,aux, 0, arr.length-1);
		System.out.println(z);
	}

	private static int mergeSort(int[] arr,int[] aux, int i, int j) {
		if(arr.length==1|| arr.length==0) {
			return 0;
		}
		
		if(i==j) {
			return 0;
		}
		int mid=(i+j)/2;
		int f1=mergeSort(arr, aux,i, mid);
		int f2=mergeSort(arr, aux,mid+1, j);
		int f3=merge(arr,aux,i,mid+1,j );
		
		return f1+f2+f3;
	}

	private static int merge(int[] arr, int[] aux, int i, int mid, int j) {
		int fp=i;
		int sp=mid;
		int k=i;
		
		int count=0;
		while(fp<mid && sp<=j) {
			if(arr[fp]<=arr[sp]) {
				aux[k]=arr[fp];
				fp++;
			}else {
				aux[k]=arr[sp];
				sp++;
				count+=mid-fp;
			}
			k++;
			
		}
		
		while(fp<mid) {
			aux[k]=arr[fp];
			fp++;
			k++;
		}
		
		while(sp<=j) {
			aux[k]=arr[sp];
			sp++;
			k++;
		}
		
		for(int tp=i; tp<=j; tp++) {
			arr[tp]=aux[tp];
		}
		return count;
	}

}

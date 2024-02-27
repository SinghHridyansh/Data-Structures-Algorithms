package Recursion_1;

public class sumOfNR {
	
	public static int sumofN(int arr[]){
		return SumRecursion(arr, 0);
	}
	
	public static int SumRecursion(int arr[], int n){
		if (n == arr.length) {
			return 0;
		}
		
		int smallestOutput=SumRecursion(arr, n+1);
		int output=arr[n]+smallestOutput;
		return output;
		
	}
	public static void main(String[] args) {
		int n[]={1,2,3,4,5,6,7,8,9,10};

		System.out.println("Sum of natural numbers till "+n[n.length-1]+" is "+(sumofN(n)));
	}
}

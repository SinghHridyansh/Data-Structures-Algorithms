package Recursion_1;

public class SumofDigitsR {
	public static int returnSum(int n){

		if (n==0) {
			return 0;
		}

		int smallestOutput=returnSum(n/10);
		int output=n%10+smallestOutput;

		return output;

	}

	public static void main(String[] args) {
		int num=123456;

		System.out.println(returnSum(num));
	}
}

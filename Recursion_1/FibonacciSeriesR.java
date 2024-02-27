package Recursion_1;

public class FibonacciSeriesR {
	
	public static int printFibo(int n){

		if (n==1 || n==2) {
			return 1;
		}

		int fib1=printFibo(n-1);
		int fib2=printFibo(n-2);
		int output=fib1+fib2;
		return output;
	}

	public static void main(String[] args) {
		int n=7;
		System.out.println(printFibo(n));
	}
}

package Recursion_1;

public class factorialR {
	
	public static int fact(int n){
		if (n==0) {
			return 1;
		}
		int smallestOutput=fact(n-1);
		int output=n*smallestOutput;
		return output;
	}
	public static void main(String[] args) {
		int n=5;
		
		System.out.println("Factorial of "+n+" is "+(fact(n)));
	}
}

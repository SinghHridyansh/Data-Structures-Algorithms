package Recursion_1;

public class CountDigitsR {
	
	public static int CountIt(int n){

		if (n/10==0) {
			return 1;
		}

		int smallestOutput=CountIt(n/10);
		int output=1+smallestOutput;
		//output++;

		return output;

	}

	public static void main(String[] args) {
		int n=3;

		System.out.println(CountIt(n));
	}
}

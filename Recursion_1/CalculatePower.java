package Recursion_1;

public class CalculatePower {
	
	public static int TothePower(int n, int power){

		if (power ==0) {
			return 1;
		}

		int smallOutput=TothePower(n, power-1);
		int output=n*smallOutput;
		return output;

	}
	public static void main(String[] args) {
		int n=3;
		int power=4;

		System.out.println(TothePower(n, power));
	}
}

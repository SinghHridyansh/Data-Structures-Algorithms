package Recursion_1;

public class FirstNnumberR {

	public static void PrintFirstNnumber(int n){

		if (n==0) {
			return;
		}

		
		PrintFirstNnumber(n-1);
		System.out.print(n+" ");

	}
	public static void main(String[] args) {
		int n=10;

		{PrintFirstNnumber(n);}
	}
}

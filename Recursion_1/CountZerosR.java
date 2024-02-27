package Recursion_1;

public class CountZerosR {

	public static int countZeros(int n){

		if (n<=9) {
			if (n==0) {
				return 1;
			}else{
				return 0;
			}
		}

			int lastDigit=n%10;

			if (lastDigit==0) {
				return 1+countZeros(n/10);
			} else {
				return 0+countZeros(n/10);
			}
		

	}
	

	public static void main(String[] args) {
		int num=70800;
		System.out.println(countZeros(num));
	}
}

package Methods;

import java.util.Scanner;

public class Factorial {

	public static int Fact(int a){
		int i=a;
		int factcalc=0;
		while (i>=1) {
			factcalc*=i;
			i--;
		}
		return factcalc;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	System.out.println(Fact(n));


		sc.close();
	}
}

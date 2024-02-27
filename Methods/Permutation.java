package Methods;

import java.util.Scanner;

public class Permutation {
	public static int Fact(int a){
		int i=a;
		int factcalc=1;
		while (i>0) {
			factcalc*=i;
			i--;
		}
		return factcalc;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();

		// if (n<0 || r<0) {
		// 	return;
		// }

		int factN=Fact(n);
		int factR=Fact(r);
		int factNR=Fact(n-r);
	
		int combination=factN/(factR*factNR);

		System.out.println(combination);


		sc.close();
	}
}

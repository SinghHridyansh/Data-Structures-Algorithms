package Methods;

import java.util.Scanner;

public class PrintPrimes {

	public static boolean isPrime(int n){
		for(int i=2;i<=n/2;i++){
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void printPrimeNum(int lim){
		for (int i=2;i<=lim;i++){
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int limit=sc.nextInt();
		printPrimeNum(limit);
		sc.close();
	}
}

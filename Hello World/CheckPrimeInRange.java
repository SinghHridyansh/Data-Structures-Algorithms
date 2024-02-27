//import java.util.Scanner;

public class CheckPrimeInRange {
	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the number upto which prime is to be checked :");
		// int number =sc.nextInt();
		//int number;
		
		for(int n=2;n<=50;n++){
			
			boolean isPrime=true;

			for(int i =2; i<n;i++){
				if (n%i==0) {
					isPrime=false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println(n);
			}
		}


		//sc.close();
	}
}

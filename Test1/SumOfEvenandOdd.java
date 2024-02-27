package Test1;

import java.util.Scanner;

public class SumOfEvenandOdd {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);		
		int n=sc.nextInt();

		int evensum=0,oddsum=0;

		while (n>0) {
			
			int digit=n%10;

			if (digit%2==0) {
				evensum+=digit;
			}else{
				oddsum+=digit;
			}
			n=n/10;

		}

		System.out.print(evensum+" "+oddsum);

		sc.close();
	}
}

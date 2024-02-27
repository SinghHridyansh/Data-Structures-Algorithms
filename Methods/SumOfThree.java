package Methods;

import java.util.Scanner;

public class SumOfThree {

	public static int SumofT(int a,int b,int c){
		int sum=a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int total=SumofT(a, b, c);
		System.out.println(total);
		sc.close();
	}
}

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a =0;
		int b=1;
		int count = number-2;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		while (count>0) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;

			count --;
		}


		sc.close();
	}
}

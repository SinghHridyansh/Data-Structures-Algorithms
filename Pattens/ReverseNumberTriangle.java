package Pattens;
import java.util.Scanner;

public class ReverseNumberTriangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count;
		for(int i=0;i<=n;i++){
			count=i;
			for(int j=1;j<=i;j++){
				System.out.print(count);
				count--;
			}
			System.out.println();
		}

		sc.close();
	}
}

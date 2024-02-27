package Pattens;

import java.util.Scanner;

// 1234
// 1234
// 1234
// 1234

public class SquarePattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();

		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				System.out.print(j);
			}
			System.out.println("");
		}
		sc.close();
	}
}

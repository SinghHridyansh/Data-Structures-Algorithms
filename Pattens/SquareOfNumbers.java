package Pattens;

import java.util.Scanner;

// 1111
// 2222
// 3333
// 4444

public class SquareOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();

		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				System.out.print(i);
			}
			System.out.println("");
		}
		sc.close();
	}
}

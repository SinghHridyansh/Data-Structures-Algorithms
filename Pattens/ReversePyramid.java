package Pattens;

import java.util.Scanner;

public class ReversePyramid {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int rows=sc.nextInt();
		for (int i = 1; i <= rows; i++) {
            // Print spaces for each row
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Print asterisks for each row
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
		System.out.println();
		}
		sc.close();
	}
}


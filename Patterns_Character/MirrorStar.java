package Patterns_Character;

import java.util.Scanner;

public class MirrorStar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1;i<=n;i++){
			//spaces
			for(int space=1;space<=n-i;space++){
				System.out.print(" ");
			}
			//stars
			for(int stars=1;stars<=i;stars++){
				System.out.print('*');
			}
			System.out.println();
		}

		sc.close();
	}
}

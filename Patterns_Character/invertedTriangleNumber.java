package Patterns_Character;

import java.util.Scanner;
// 4444
// 333
// 22
// 1
public class invertedTriangleNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(n-i+1);
			}
			System.out.println();
		}
		sc.close();
	}
}

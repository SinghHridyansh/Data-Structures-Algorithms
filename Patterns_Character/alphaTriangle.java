package Patterns_Character;

// E
// DE
// CDE
// BCDE
// ABCDE

import java.util.Scanner;
public class alphaTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			char p=(char)('A'+n-i);
			for(int j=1;j<=i;j++){
				System.out.print(p);
				p=(char)(p+1);
			}
			System.out.println();
		}
		sc.close();
	}
}

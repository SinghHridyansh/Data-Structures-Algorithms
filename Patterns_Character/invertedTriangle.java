package Patterns_Character;
import java.util.Scanner;

// *****
// ****
// ***
// **
// *

public class invertedTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}
}


//Alternate

// int i=1;
// while(i<=n){
// 	int j=1;
// 	while (j <= n-i+1) {
// 		System.out.print('*');
// 		j=j+1;
// 	}
// 	System.out.println();
// 	i=i+1;
// }
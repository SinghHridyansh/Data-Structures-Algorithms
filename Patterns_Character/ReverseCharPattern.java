package Patterns_Character;


// G
// GF
// GFE
// GFED
// GFEDC
// GFEDCB
// GFEDCBA

import java.util.Scanner;

public class ReverseCharPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		 //int i=1;
		// while (i<=n) {
		// 	char p = (char)('A'+i-1);
		// 	int j=1;
		// 	while (j<=n) {
		// 		System.out.print(p);
		// 		p=(char)(p+1);
		// 		j=j+1;
		// 	}
		// 	i=i+1;
		// 	System.out.println();
		// }

			//char p = (char)(n+i-1);
		//System.out.println(p);

		for(int i=1;i<=n;i++){
			char p = (char)('A'+n-1);
			for(int j=1;j<=i;j++){
				System.out.print(p);
				p=(char)(p-1);
			}
			System.out.println();
		}

		sc.close();
	}
}


//   *
//  * *
// * * *
//  * *
//   *
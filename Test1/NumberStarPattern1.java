package Test1;
import java.util.Scanner;

public class NumberStarPattern1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();

		for (int i = n; i >=1 ; i--) {
			
			
			for (int j = n; j >=1 ; j--) {
				//System.out.print(beforestar);
				//beforestar--;
				if ( j==(n-i+1)) {
					System.out.print("*");
				}else{
					System.out.print(j);
				}
			}

			//System.out.print("*");

			// for (int j = 1; j <= n; j++) {
				
			// }


			System.out.println();
		}


		sc.close();
	}
}

// 5432*
// 543*1
// 54*21
// 5*321
// *4321


// for (int i = 1; i <= n; i++) {
			
// 			int beforestar=n;
// 			for (int j = n; j >i ; j--) {
// 				System.out.print(beforestar);
// 				beforestar--;
// 			}

// 			System.out.print("*");

// 			// for (int j = 1; j <= n; j++) {
				
// 			// }


// 			System.out.println();
// 		}
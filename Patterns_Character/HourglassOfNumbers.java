package Patterns_Character;
import java.util.Scanner;

// 1 2 3 4 5
//  2 3 4 5
//   3 4 5
//    4 5
//     5
//    4 5
//   3 4 5
//  2 3 4 5
// 1 2 3 4 5

public class HourglassOfNumbers {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

		for(int i=n-1;i>=1;i--){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

		sc.close();
	}
}


package Patterns_Character;
import java.util.Scanner;

//     1
//    121
//   12321
//  1234321
// 123454321

public class IsoscelesTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int beg=1;
			for(int space=1;space<=n-i;space++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(beg);
				beg++;
			}
			beg--;
			for(int j=i-1;j>=1;j--){
				System.out.print(beg-1);
				beg--;
			}
			System.out.println();
		}
		sc.close();
	}
}

package Patterns_Character;
import java.util.Scanner;

//    1
//   232
//  34543
// 4567654

public class TriangleOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for (int i = 1; i <=n ; i++) {
			
			int lineNum=i;
			for(int space=1;space<=n-i;space++){
				System.out.print(" ");
			}
			for(int num =1;num<=i;num++){
				System.out.print(lineNum);	
					lineNum++;
			}
			lineNum--;
			for(int num=i-1;num>=1;num--){
				System.out.print(lineNum-1);
				lineNum--;
			}
			System.out.println();
		}
		sc.close();
	}
}

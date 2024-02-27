package Pattens;
import java.util.Scanner;

// 4321
// 4321
// 4321
// 4321

public class SquareNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();

		for(int i=num;i>=1;i--){
			for(int j=num;j>=1;j--){
				System.out.print(j);
			}
			System.out.println("");
		}
		sc.close();
	}
}

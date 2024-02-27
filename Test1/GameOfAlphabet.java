package Test1;
import java.util.Scanner;

public class GameOfAlphabet {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);		
		int n=sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				char ch=(char)('A'+j-1);
				System.out.print(ch);
				ch=(char)(ch+1);
			}
			System.out.println();
		}

		//System.out.println(n);

		sc.close();
	}
}

// 0,1,2,3,4,5,6,7,8

// 1,2,3,4,5,6,7,8,9

// 5,4,3,2,1,6,7,8,9

// 5,4,3,2,8,7,6,1,9
package Patterns_Character;
import java.util.*;

public class FilledKShape {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1;i<=n;i++){
			int digit=n-i+1;
			for(int j=n;j>=i;j--){
				System.out.print(digit);
				digit--;
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++){
			int digit=i;
			for(int j=i;j>=1;j--){
				System.out.print(digit);
				digit--;
			}
			System.out.println();
		}

		sc.close();
	}
}

import java.util.Scanner;


public class DigitSeparate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int i = number;
		while (i>0) {
	
			System.out.println(i%10);
			i=i/10;
		}
		sc.close();
	}
}

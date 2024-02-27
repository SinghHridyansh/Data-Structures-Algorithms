//import java.math.*;
import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();

		double root = Math.sqrt(number);
		int roundroot = (int)root;
		System.out.println(roundroot);
		sc.close();
	}
}

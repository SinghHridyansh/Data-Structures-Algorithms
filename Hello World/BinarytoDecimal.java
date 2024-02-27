import java.util.Scanner;
public class BinarytoDecimal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int decimal=0;
		int power=0;

		while (number!=0) {
			int digit=number%10;

			decimal +=digit* Math.pow(2, power);
			number /=10;
			power++;
		}

		System.out.println(decimal);
		
		sc.close();
	}
}

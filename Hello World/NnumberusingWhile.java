import java.util.Scanner;
public class NnumberusingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a damn number:");
		int number = sc.nextInt();

		int i = 1;
		while (i<=number) {
			System.out.println(i);
			i++;
		}

		sc.close();
	}
	
}

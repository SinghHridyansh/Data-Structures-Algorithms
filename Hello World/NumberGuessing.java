import java.util.*;
public class NumberGuessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//int number =sc.nextInt();
		int randomnumber=random.nextInt(10);
		//System.out.println(randomnumber);
		int guessednumber;

		do{
			System.out.print("Enter a number between 1-10: ");
			guessednumber = sc.nextInt();

		}while(guessednumber!=randomnumber);

		sc.close();
	}
}

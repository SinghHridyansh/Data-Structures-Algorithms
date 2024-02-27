import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter Total marks :");
		float totalMarks=scanner.nextFloat();
		System.out.println("Enter obtained marks :");
		float scored=scanner.nextFloat();

		float percentage= (scored/totalMarks)*100;
		System.out.println("Calculated Percentage is "+percentage+"%");

		// int x = 7;
		// int y = 3;
		// int result1 = x << y;
		// int result2 =x >> y;
		// int result3 = x>>>y; 

		// System.out.println(result1);
		// System.out.println(result2);
		// System.out.println(result3);
		scanner.close();
	}
}

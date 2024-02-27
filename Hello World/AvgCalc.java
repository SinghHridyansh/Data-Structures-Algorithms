import java.util.Scanner;
public class AvgCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float input1=scanner.nextFloat();
		float input2=scanner.nextFloat();
		float input3=scanner.nextFloat();

		double avg = (input1+input2+input3)/3;
		System.out.println(avg);
		scanner.close();
	}
}

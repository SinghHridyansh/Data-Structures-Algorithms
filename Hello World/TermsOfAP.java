import java.util.Scanner;
public class TermsOfAP {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		 int count=0;
		int i=1;
		while (count < x) {
			int term = 3*i +2;
			if (term%4!=0) {
				System.out.print(term+" ");
				count++;
			}
			i++;
		}

		sc.close();
	}
}

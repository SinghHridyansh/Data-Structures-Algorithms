import java.util.Scanner;
public class SumOrProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,product=1;
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("Enter 1 to calculate the sum of all integers or Enter 2 to calculate product :");
		int choice=sc.nextInt();

		if (number>=1 && number<=12) {
			
			switch (choice) {
				case 1:
					for(int i =1;i<=number;i++){
						sum=sum+i;
					}
					System.out.println(sum);
					break;
				case 2:	
					for(int i=1;i<=number;i++){
						product=product*i;
					}
					System.out.println(product);
					break;
				default:
				System.out.println(-1);;
			}
		}

		sc.close();
	}
}

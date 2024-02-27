package Arrays_2;
import java.util.Scanner;

public class UpdateAnElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be replaced :");
		int key = sc.nextInt();

		System.out.println("Enter element to be updated :");
		int update=sc.nextInt();

		int A[]={4,6,18,20,31,34};
		boolean replaced=false;

		System.out.println("Default array is :");
		for (int i : A) {
			System.out.print(i+" ");
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i]==key) {
				A[i]=update;
				replaced=true;
			}
		}
System.out.println();
		if (replaced) {
			System.out.println("The element was found and replaced");
			System.out.println("Updated array is :");
			for (int i : A) {
				System.out.print(i+" ");
			}
		}else{
			System.out.println("The element was not found.");
		}


		sc.close();
	}
}

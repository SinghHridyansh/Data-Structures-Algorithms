package TwoDArrays;
import java.util.Scanner;

public class Methods2dArray {

	public static int[][] takeInput(){
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		System.out.println("Enter the number of columns:");
		int columns=sc.nextInt();

		int A[][]=new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enetr the element at A["+i+"] ["+j+"] :");
				A[i][j]=sc.nextInt();
			}
		}

		sc.close();
		return A;
	}

	public static void printArray(int arr[][],int n,int m){

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int arr[][]= takeInput();
		int n=arr.length;
		int m=arr[0].length;

		printArray(arr, n, m);

		
	}

	
}

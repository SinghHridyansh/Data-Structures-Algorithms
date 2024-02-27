package SearchingAndSorting;
import java.util.Scanner;

public class LinearSearch {

	public static int search(int arr[], int n){

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]={1,5,21,8,34,8,4,34,62,8,2,56,54};

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be searched: ");
		int num=sc.nextInt();

		int index= search(arr,num);
		System.out.println("Index found on "+index+" index;");
		sc.close();
	}
}

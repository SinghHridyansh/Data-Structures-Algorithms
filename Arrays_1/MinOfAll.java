package Arrays_1;
import java.util.*;
public class MinOfAll {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Entered array is:");
		for(int i:arr){
			System.out.print(i+" ");
		}

		sc.close();
	}
}

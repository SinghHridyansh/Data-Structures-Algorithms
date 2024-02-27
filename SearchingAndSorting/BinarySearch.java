package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
	public static int SearchItBinary(int arr[],int num){

		int l=0,r=arr.length-1;

		
		while (l<=r) {
			int mid=(l+r)/2;
			
			if (arr[mid]==num) {
				return mid;
			}if (arr[mid]<num) {
				l=mid+1;
			}if (arr[mid]>num) {
				r=mid-1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[]={3,6,8,11,19,26,32,35,44};

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be searched: ");
		int num=sc.nextInt();

		int index= SearchItBinary(arr,num);
		if (index==-1) {
			System.out.println("not found");
		}else{

			System.out.println("Index found on index# "+index);
		}
		sc.close();
	}
}

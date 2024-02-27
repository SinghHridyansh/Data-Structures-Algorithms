package SearchingAndSorting;

import java.util.Scanner;

public class FindClosestIndex {

	public static int SearchItBinary(int arr[],int left,int right,int num){

		//int l=0,r=arr.length-1;

		
		while (left+1<right) {
			int mid=(left+right)/2;
			
			if (arr[mid]==num) {
				return mid;
			}if (arr[mid]<num) {
				left=mid;
			}if (arr[mid]>num) {
				right=mid;
			}
		}

		if (arr[right]-num < num-arr[left]) {
			return right;
		}else{
			return left;
		}

		//return -1;
	}
	

	public static void main(String[] args) {
		int arr[]={3,6,8,11,19,26,32,35,44};

		int l=0,r=arr.length-1;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be searched: ");
		int num=sc.nextInt();

		int index= SearchItBinary(arr,l,r,num);
		if (index==-1) {
			System.out.println("not found");
		}else{

			System.out.println("Element closest to the entered number is @ index # "+index);
		}
		sc.close();
	}
}

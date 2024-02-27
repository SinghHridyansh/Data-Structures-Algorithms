package Arrays_2;

import java.util.Scanner;

public class RotateArrayOptimized {

	public static void ReversetheArray(int A[],int l,int r){
		while (l<r) {
			int temp=A[l];
			A[l]=A[r];
			A[r]=temp;
			l++;	
			r--;
		}

		
	}
	public static void main(String[] args) {
		// int A[]={1,2,3,4,5,6,7,8,9,10};
		// int size=10;
		// int l=2;
		// int r=4;
		// ReversetheArray(A,size,l,r);

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the capacity of the array.");
		int len=sc.nextInt();

		System.out.println("Enter the value of "+len+" elements of the array;");

		int A[]=new int[len];
		for (int i = 0; i < len; i++) {
			A[i]=sc.nextInt();
		}

		System.out.println("Enter 1 to rotate array 'right' or 0 to rotate array 'left':");
		int dir=sc.nextInt();

		System.out.println("Enter number of Rotations:");
		int x=sc.nextInt();

		if (dir==1) {
			//Rotate right by x
			ReversetheArray(A, 0, len-1);
			ReversetheArray(A, 0, x-1);
			ReversetheArray(A, x, len-1);
		} else {
			//Rotate left by x
			ReversetheArray(A, 0, len-1);
			ReversetheArray(A, 0, len-x-1);
			ReversetheArray(A, len-x, len-1);
		}

		for (int i : A) {
			System.out.print(i+" ");
		}

		sc.close();	
	}
}

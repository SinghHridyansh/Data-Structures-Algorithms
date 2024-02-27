package Revision_1;

public class ReverseTheArrayInRange {
	
	public static void revit(int arr[],int l,int r){
		

		while (l<r) {
			int temp=0;
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;	
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		int arr[]={21, 2, 17, 39, 48, 41, 44, 23, 22, 7 };

		int l=3;
		int r=7;

		revit(arr, l, r);
		System.out.println("Reversed array in range :");
		System.out.println();
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}
}

package Revision_1;

public class ReverseTheArray {
	
	public static void revit(int arr[]){
		int l=0;
		int r=arr.length-1;

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
		int arr[]={3, 1, 1, 7, 4, 2, 6, 11};
		
		revit(arr);
		System.out.println("Reversed array is :");
		System.out.println();
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

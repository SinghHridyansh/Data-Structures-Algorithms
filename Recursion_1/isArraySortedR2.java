package Recursion_1;

public class isArraySortedR2 {

	public static boolean isItSorted(int arr[],int si){

		if (si == arr.length-1) {
			return true;
		}

		if (arr[si]>arr[si+1]) {
			return false;
		}

		return isItSorted(arr, si+1);

	}
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int arr1[]={2,6,1,8,3,1,7};

		System.out.println(isItSorted(arr,0));
		System.out.println(isItSorted(arr1,0));
	}
}

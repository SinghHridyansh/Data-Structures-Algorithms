package Recursion_1;

public class IsArraySortedR {
	

	public static boolean isItSorted(int arr[]){

		if (arr.length==1) {
			return true;
		}

		if (arr[0]>arr[1]) {
			return false;
		}

		int smallArr[]= new int[arr.length-1];

		for (int i = 1; i < arr.length; i++) {
			smallArr[i-1]=arr[i];
		}

		boolean isSorted= isItSorted(smallArr);
		return isSorted;

	}

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int arr1[]={2,6,1,8,3,1,7};

		System.out.println(isItSorted(arr));
		System.out.println(isItSorted(arr1));
	}
}

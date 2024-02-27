package Recursion_1;

public class FirstIndexOfNumR {
	
	public static int findIndex(int arr[],int index,int toSearch){

		if (index>arr.length-1) {
			return -1;
		}
		if (arr[index]==toSearch) {
			return index;
		}

		return findIndex(arr, index+1, toSearch);

	}

	public static void main(String[] args) {
		int arr1[]={2,6,1,8,3,1,7};
		int elementToSearch=8;
		System.out.println(findIndex(arr1, 0,elementToSearch));
	}
}

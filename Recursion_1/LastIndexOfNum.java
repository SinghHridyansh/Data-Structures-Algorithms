package Recursion_1;

public class LastIndexOfNum {
	public static int findIndex(int arr[],int index,int toSearch){

		if (index<0) {
			return -1;
		}
		if (arr[index]==toSearch) {
			return index;
		}

		return findIndex(arr, index-1, toSearch);

	}

	public static void main(String[] args) {
		int arr1[]={2,6,3,8,3,1,7};
		int elementToSearch=5;
		int lastIndex=arr1.length;
		System.out.println(findIndex(arr1, lastIndex-1,elementToSearch));
	}
}

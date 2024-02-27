package Revision_1;

public class FindDuplicate {
	
	public static int findDupOne(int arr[]){

		int n=arr.length;
		//boolean found=false;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i!=j && arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[]={0, 7, 2, 5, 4, 7, 1, 3, 6};
		System.out.println("Duplicate character is :");
		System.out.println(findDupOne(arr));
	}
}

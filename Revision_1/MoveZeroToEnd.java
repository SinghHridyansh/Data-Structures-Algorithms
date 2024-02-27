package Revision_1;

public class MoveZeroToEnd {
	
	public static void moveZeros(int arr[]){

		int nz=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				arr[nz]=arr[i];
				nz++;
			}
		}

		while (nz<arr.length) {
			arr[nz]=0;
			nz++;
		}
	}
	public static void main(String[] args) {
		int arr[]={1, 2, 0, 0, 2, 3};

		moveZeros(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

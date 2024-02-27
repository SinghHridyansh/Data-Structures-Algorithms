package Revision_1;

public class MoveZeroToEnd2 {
	
	public static void moveZeros(int arr[]){

		int nz=0,z=0;

		while (z<arr.length) {
			if (arr[nz]!=0) {
				nz++;
			}
			else if (arr[z]==0) {
				z++;
			}
			else{
				int temp=arr[z];
				arr[z]=arr[nz];
				arr[nz]=temp;
			}
		}

		System.out.println();
		System.out.println("Altered Array is: ");

		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

	public static void main(String[] args) {
		int arr[]={1, 2, 0, 0, 2, 3};

		moveZeros(arr);
		// for (int i : arr) {
		// 	System.out.print(i+" ");
		// }
}
}

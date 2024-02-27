package Revision_1;

public class SortZeroandOne {
	
	public static void SortIt(int arr[]){

		int pointer=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[pointer];
				arr[pointer]=temp;
				pointer++;
			}
		}

		System.out.println("Sorted thing is: ");
		System.out.println();
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]={0, 1, 1, 0, 1, 0, 1};

		SortIt(arr);

	}
}

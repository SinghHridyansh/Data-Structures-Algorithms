package SearchingAndSorting;

public class InsertionSort {
	public static void sortItInsertion(int arr[]){

		//Outer loop fro passes
		for (int i = 1; i < arr.length; i++) {
			//set j to i-1 and temp to arr[i]
			int j=i-1, temp=arr[i];

			//inner loop to put the current element at the correct place
			while (j>=0 && arr[j]>temp  ) {
				//shift all the elements 1 to the right
				arr[j+1]=arr[j];
				j--;
			}
			// put temp at the correct place
			arr[j+1]=temp;
		}

	}

	public static void main(String[] args) {
		int arr[]={17, 5, 14, 16, 11, 18, 10};
		sortItInsertion(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

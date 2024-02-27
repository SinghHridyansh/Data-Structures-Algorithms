package SearchingAndSorting;

public class SelectSort {
	
	public static void sortitSelect(int arr[]){

		for (int i = 0; i < arr.length-1; i++) {
			int min=i;

			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}

	}

	public static void main(String[] args) {
		

		int arr[]={3,6,8,11,19,26,32,35,44};
		sortitSelect(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

package SearchingAndSorting;

public class findInversionusingSelectionSort {
	
	public static int findInversions(int arr[]){
		int sum=0;


		for (int i = 0; i < arr.length-1; i++) {
			int min=i;

			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[min]) {
					min=j;
				}
			}
			sum += min-i;
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}

		return sum;
	}

	public static void main(String[] args) {
		
		//int arr[]={3, 2, 11, 5, 1};

		int arr[]={17, 5, 14, 16, 11, 18, 10};
		System.out.println("Sum of the inversions is : "+(findInversions(arr)) );
	}
}

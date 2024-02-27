package Recursion_2;

public class QuickSortR {

	public static int partition(int arr[],int si,int ei){

		// int pivoteElememt=arr[si]; 
		// int smallerNumCount=0;
		// for (int i = si+1; i <= ei; i++) {
		// 	if (arr[i]<=pivoteElememt) {
		// 		smallerNumCount++;
		// 	}
		// }

		// int temp=arr[si+smallerNumCount];
		// arr[si+smallerNumCount]=pivoteElememt;
		// arr[si]=temp;

		// int i=si;
		// int j=ei;

		// while (i<j) {
		// 	if (arr[i]<pivoteElememt) {
		// 		i++;
		// 	} else if (arr[j]>=pivoteElememt) {
		// 		j--;
		// 	}else{
		// 		temp=arr[i];
		// 		arr[i]=arr[j];
		// 		arr[j]=temp;
		// 		i++;
		// 		j--;
		// 	}
		// }

		// return si+smallerNumCount;

		int pivotElement = arr[si];
		int smallerNumCount = 0;
	
		for (int i = si + 1; i <= ei; i++) {
			if (arr[i] <= pivotElement) {
				smallerNumCount++;
			}
		}
	
		// Swap pivot element with its correct position
		int temp = arr[si];
		arr[si] = arr[si + smallerNumCount];
		arr[si + smallerNumCount] = temp;
	
		int i = si;
		int j = ei;
	
		while (i < j) {
			if (arr[i] < pivotElement) {
				i++;
			} else if (arr[j] >= pivotElement) {
				j--;
			} else {
				// Swap elements to maintain the partition
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
	
		return si + smallerNumCount;
	}

	public static void SortItQuick(int arr[],int si, int ei){

		if (si>=ei) {
			return;
		}

		int pivotIndex=partition(arr,si,ei);
		SortItQuick(arr, si, pivotIndex-1);
		SortItQuick(arr, pivotIndex+1, ei);

	}
	

	public static void main(String[] args) {
		int arr[]={17, 5, 14, 16, 11, 18, 10};
		
		SortItQuick(arr, 0, arr.length-1);

		for (int i : arr) {
			System.out.print(i+" ");
		}

	}
}

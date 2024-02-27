package SearchingAndSorting;

public class SortZeroOneTwo {
	
	public static void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void sortIt(int arr[],int n){

		int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
	}
	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 0, 2, 0, 1};
		int n=arr1.length;

		sortIt(arr1, n);
		for (int i : arr1) {
			System.out.print(i+" ");
		}

	}
}

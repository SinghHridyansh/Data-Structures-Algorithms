package SearchingAndSorting;

public class BubbleSort {
	
	public static void SortItBubble(int arr[]){

		int n=arr.length-1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]={3,6,8,11,19,26,32,35,44};

		SortItBubble(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

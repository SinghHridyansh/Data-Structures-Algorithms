package Arrays_2;

public class ArrayNumberArrangement {
	public static void Arrangearray(int[] arr,int n){

			int index=0;
		for (int i = 1; i <= n; i++) {
			if (i%2!=0) {
				arr[index]=i;
			}
			index++;
		}

	}
	public static void main(String[] args) {
		int n=9;
		int arr[]=new int[n];
		Arrangearray(arr, n);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

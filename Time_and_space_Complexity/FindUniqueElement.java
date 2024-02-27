package Time_and_space_Complexity;
//import java.util.Arrays;

public class FindUniqueElement {

	public static void BubbleSort(int arr[]){

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}
	
	// XOR Approach can also be used

	public static int UniqueEleF(int arr[]){

		if (arr.length<=1) {
			return arr[arr.length-1];
		}

		// for (int i = 0; i < arr.length-1; i++) {
		// 	for (int j = 0; j < arr.length-i-1; j++) {
		// 		if (arr[j]>arr[j+1]) {
		// 			int temp=arr[j];
		// 			arr[j]=arr[j+1];
		// 			arr[j+1]=temp;
		// 		}
		// 	}
		// }

		BubbleSort(arr);

		int index=0;

		while (index<arr.length-1) {
			if (arr[index]==arr[index+1]) {
				index+=2;
			}else{
				return arr[index];
			}
		}
		if (index==arr.length-1) {
			return arr[arr.length-1];
		}

		return -1;

	}

	public static void main(String[] args) {
		//int arr[]={2,3,1,6,3,6,2};
		//int arr[]={6,3,7,5,1,3,5,1,7,9,6};
		// 1 1 3 3 5 5 6 6 7 7 9 
		int arr[]={0, 7, 2, 5, 4, 7, 1, 3, 6};
		
		//System.out.println(UniqueEleF(arr));
		BubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

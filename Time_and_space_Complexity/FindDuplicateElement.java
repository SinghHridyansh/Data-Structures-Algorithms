package Time_and_space_Complexity;

public class FindDuplicateElement {
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

	public static int DupEleF(int arr[]){
		
		if (arr.length<=1) {
			return arr[arr.length-1];
		}

		BubbleSort(arr);

		int index=0;

		while (index<arr.length-1) {
			if (arr[index]==arr[index+1]) {
				return arr[index];
			}else{
				index+=1;
			}
		}
		if (index==arr.length-1) {
			return arr[arr.length-1];
		}

		return -1;
	}

	public static void main(String[] args) {
	
		int arr[]={0, 7, 2, 5, 4, 7, 1, 3, 6};
		
		// BubbleSort(arr);
		// for (int i : arr) {
		// 	System.out.print(i+" ");
		// }
		System.out.println(DupEleF(arr));
	}
}

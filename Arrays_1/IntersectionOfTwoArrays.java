package Arrays_1;

public class IntersectionOfTwoArrays {
	public static void IntersectingArrays(int arr1[],int arr2[]){

		//int INT_MIN=0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					//INT_MIN=arr2[j];
					System.out.print(arr1[i]+" ");
					arr2[j]=-1;
					break;
				}
			}
		}



	}
	public static void main(String[] args) {
		// int[] array1 = { 2, 4, 6,4,2, 8, 10 };
        // int[] array2 = { 4, 8, 12,2,4, 16, 20 };

		int[] array1 = { 2,1,2,2 };
        int[] array2 = { 2,2,2,2 };

		// int[] array1 = { 2,6,8,5,4,3 };
        // int[] array2 = { 2,3,4,7 };

		IntersectingArrays(array1, array2);
	}
}


// 2 6 1 2
// 1 2 3 4 2
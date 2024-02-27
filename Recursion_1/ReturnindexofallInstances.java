package Recursion_1;

import java.util.Arrays;

public class ReturnindexofallInstances {
	public static int [] returnindices(int arr[],int x){

        int[] indexes = new int[arr.length];
   
        int count = returnindicesHelper(arr, x, 0, indexes);

    
       int[] result = Arrays.copyOf(indexes, count);
	   Arrays.sort(result);
        return result;

	} 
	public static int returnindicesHelper(int[] arr, int x, int currentIndex, int[] indexes) {
 
        if (currentIndex == arr.length) {
            return 0;
        }

        int count = returnindicesHelper(arr, x, currentIndex + 1, indexes);
        if (arr[currentIndex] == x) {
            indexes[count] = currentIndex;
            count++;
        }

        return count;
    }
	public static void main(String[] args) {
		int arr[]={5,6,5,5,6};
		int find=5;
		int res[]=returnindices(arr, find);

		for (int i : res) {
			System.out.print(i+" ");
		}
	}
}

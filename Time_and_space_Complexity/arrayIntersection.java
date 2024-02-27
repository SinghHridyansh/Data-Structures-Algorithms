package Time_and_space_Complexity;
import java.util.Arrays;

public class arrayIntersection {
	
	public static void findINtersection(int[] arr1,int[] arr2){
		 
		// int limit1=0,limit2=0;
		// if (arr1.length>=arr2.length) {
		// 	limit1=arr2.length;
		// 	limit2=arr1.length;
		// }else{
		// 	limit1=arr1.length;
		// 	limit2=arr2.length;
		// }

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i=0,j=0;

		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]==arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;j++;
			}else if (arr1[i]<arr2[j]) {
				i++;
			}else{
				j++;
			}
		}

	}
	public static void main(String[] args) {
		
		int[] array1 = { 2,6,8,5,4,3 };
        int[] array2 = { 2,3,4,7 };

		findINtersection(array1, array2);
	}
}

package SearchingAndSorting;

public class MergerSortedArrays {
	
	public static int[] merge(int arr1[],int arr2[]){
		int mergedArrays[]=new int [arr1.length+arr2.length];

		int i=0,j=0,k=0;

		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j]) {
				mergedArrays[k++]=arr1[i++];
			} else {
				mergedArrays[k++]=arr2[j++];
			}
		}

		while (i<arr1.length) {
			mergedArrays[k++]=arr1[i++];
		}

		while (j<arr2.length) {
			mergedArrays[k++]=arr2[j++];
		}

		return mergedArrays;
	}

	public static void main(String[] args) {
		int arr1[]={1,3,5,7,9,11};
		int arr2[]={2,4,6,8,10,12};

		int resArr[]=merge(arr1, arr2);

		for (int i : resArr) {
			System.out.print(i+" ");
		}
	}
}

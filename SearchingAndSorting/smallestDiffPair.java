package SearchingAndSorting;
import java.util.Arrays;

public class smallestDiffPair {
	
	public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
    
		// int diff=0,res=diff;

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		diff=arr1[i]-arr2[j];
		// 		if (diff>0 && diff>=res) {
		// 			res=diff;
		// 		}
		// 	}
		// 	diff=0;
		// }

		// return res;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int idx1=0,idx2=0,minDiff=Math.abs(arr1[0]-arr2[0]);

		while (idx1<n && idx2<m) {
			minDiff=Math.min(minDiff, Math.abs(arr1[idx1]-arr2[idx2]));

			if (arr1[idx1]<arr2[idx2]) {
				idx1++;
			} else {
				idx2++;
			}
		}

		return minDiff;

    }

	public static void main(String[] args) {
		int arr1[]={10,20,30};
		int arr2[]={17,15};

		int n=arr1.length;
		int m= arr2.length;

		System.out.println(smallestDifferencePair(arr1, n, arr2, m));

	}
}

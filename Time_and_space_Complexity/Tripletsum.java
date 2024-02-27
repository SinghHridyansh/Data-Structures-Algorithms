package Time_and_space_Complexity;
import java.util.Arrays;

public class Tripletsum {
	
	public static int findTriplets(int[] arr,int num){

		Arrays.sort(arr);
		int n=arr.length;
		int ans=0;

		for (int i = 0; i < n-3; i++) {
			int low=i+1,high = n-1;
			while (low<high) {
				int currSum=arr[i]+arr[low]+arr[high];
				if (currSum==num) {
					ans+=1;
					int tmpHigh=high-1;
					while (tmpHigh>low) {
						if (arr[high]==arr[tmpHigh]) {
							ans +=1;
							tmpHigh--;
						}else{
							break;
						}
					}
					low++;
				}else if (currSum>num) {
					high--;
				}else{
					low++;
				}
			}
		}

		return ans;

	}
}

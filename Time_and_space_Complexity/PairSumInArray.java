package Time_and_space_Complexity;
import java.util.Arrays;

public class PairSumInArray {
	public static int NumberOfPAir(int arr[],int num){

		Arrays.sort(arr);

		if (arr.length==0) {
			return 0;
		}

		int startindex=0;
		int endIndex=arr.length-1;
		int count=0;

		while (startindex<endIndex) {
			if (arr[startindex]+arr[endIndex]<num) {
				startindex+=1;
			}else if (arr[startindex]+arr[endIndex]>num) {
				endIndex-=1;
			}else{
				int elementAtStart=arr[startindex];
				int elementAtEnd=arr[endIndex];
				if (elementAtStart==elementAtEnd) {
					int elementCount=(endIndex-startindex+1);
					count += (elementCount*(elementCount-1)/2);
					return count;
				}
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[]={1, 3, 6, 2, 5, 4, 3, 2, 4};
		System.out.println(NumberOfPAir(arr, 7));
	}
}

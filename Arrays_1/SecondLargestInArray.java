package Arrays_1;

public class SecondLargestInArray {
	public static int SecondLargest(int arr[]){
		//int n=arr.length;
		int maxNum=arr[0];

		for (int i : arr) {
			maxNum=Math.max(maxNum, i);
		}
		//return maxNum;

		int arr_new[]=new int[arr.length-1];
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=maxNum) {
				arr_new[k]=arr[i];
				k++;
			}
		}

		int SL=arr_new[0];
		for (int i : arr_new) {
			SL=Math.max(SL, i);
		}

		return SL;
		
	}
	public static void main(String[] args) {
		int array[]={13, 6, 31, 14, 29, 44, 3,};
		int SL=SecondLargest(array);
		System.out.println(SL);
	}
}

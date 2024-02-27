package Recursion_2;

public class BinarySearchR {
	
	public static int BinaryR(int[] arr,int si, int ei,int num){

		if (si>ei) {
			return -1;
		}

		int midIndex=(si+ei)/2;

		if (arr[midIndex]==num) {
			return midIndex;
		}else if(arr[midIndex]<num){
			return BinaryR(arr,midIndex+1,ei,num);
		}else{
			return BinaryR(arr,si,midIndex-1,num);
		}

	}

	public static void main(String[] args) {
		int arr[]={3,6,8,11,19,26,32,35,44};
		int num=26;
		System.out.println(BinaryR(arr, 0, arr.length-1, num));
	}
}

package Revision_1;

public class checkArrRotation {
	public static int checkRot(int arr[]){
		int n=arr.length;
		int index=0;
		for (int i = 0; i < n-1; i++) {
			if (arr[i]>arr[i+1]) {
				index=i+1;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int arr[]={4,5,6,1,2,3};

		System.out.println(checkRot(arr));
	}
}

package Revision_1;

public class SecondLinArr {
	
	public static int findSL(int arr[]){
		
		int n=arr.length;
		int max1=arr[0];
		int max2=max1;

		for (int i = 1; i < n; i++) {
			if (arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2){
				max2=arr[i];
			}
		}

		return max2;
	}
	public static void main(String[] args) {
		int arr[]={13, 6, 31, 14, 29, 44, 3};
		int num=findSL(arr);
		System.out.println("Second largest in the array is "+num);
	}
}

package Revision_1;

public class MoveZeroToBeg {
	
	public static int[] zeroToBeg(int arr[]){
		int left=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				if (i!=left) {
					int temp=arr[i];
					arr[i]=arr[left];
					arr[left]=temp;
				}
				left++;
			}
		}

		return arr;
	}
	public static void main(String[] args) {
		int arr[]={4, 0, 3, 2, 5 };

		int altered[]=zeroToBeg(arr);
		
		for (int i : altered) {
			System.out.print(i+" ");
		}
	}
}

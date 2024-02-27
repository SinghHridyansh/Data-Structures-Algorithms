package Arrays_2;

public class ReverseArrayBwTwoIndex {
	

	public static void ReversetheArray(int A[],int size,int l,int r){
		
		

		while (l<r) {
			int temp=A[l];
			A[l]=A[r];
			A[r]=temp;
			l++;
			r--;
		}

		System.out.println("Reversed Array is :");
		for (int i : A) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int A[]={1,2,3,4,5,6,7,8,9,10};
		int size=10;
		int l=2;
		int r=4;
		ReversetheArray(A,size,l,r);
	}
}

package Time_and_space_Complexity;



public class RotateArray {
	public static void ReversetheArray(int A[],int l,int r){
		while (l<r) {
			int temp=A[l];
			A[l]=A[r];
			A[r]=temp;
			l++;	
			r--;
		}
	}
	
	public static void rotate(int[] A, int x) {


    	int len=A.length;
        ReversetheArray(A, 0, len-1);
		ReversetheArray(A, 0, len-x-1);
		ReversetheArray(A, len-x, len-1);
    }
	
	public static void main(String[] args) {
		int A[]={6,2,4,8,9,1,5};
		rotate(A, 2);

		for (int i : A) {
			System.out.print(i+" ");
		}
	}
}

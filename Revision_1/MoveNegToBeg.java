package Revision_1;

public class MoveNegToBeg {
	
	public static void NegToBeg(int A[]){

		// int p=0,n=0;
		// while (n<A.length && p<A.length) {
		// 	if (A[p]!=0) {
		// 		p++;
		// 	}
		// 	if (A[n]<0) {
		// 		n++;
		// 	}else{
		// 		int temp=A[n];
		// 		A[n]=A[p];
		// 		A[p]=temp;
		// 	}
		// }

		int left = 0; // Pointer for negative numbers


        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                if (i != left) {
          
                    int temp = A[i];
                    A[i] = A[left];
                    A[left] = temp;
                }
                left++;
            }
        }

		for (int i : A) {
			System.out.print(i+" ");
		}

	}
	
	public static void main(String[] args) {
		int arr[]={1, -4, -2, 5, 3};
		NegToBeg(arr);
	}
}

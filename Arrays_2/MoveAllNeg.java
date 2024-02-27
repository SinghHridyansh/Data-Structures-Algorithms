package Arrays_2;

public class MoveAllNeg {
	
	public static void NegInBeg(int A[]){
		int p=0,n=0;
		while (n<A.length) {
			if (A[p]!=0) {
				p++;
			}
			if (A[n]<0) {
				n++;
			}else{
				int temp=A[n];
				A[n]=A[p];
				A[p]=temp;
			}
		}

		System.out.println("Reversed Array is :");
		for (int i : A) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		
		int A[]={1,-2,3,4,-5,6,-3,8,9,-1};
		NegInBeg(A);
	}
}

package Arrays_2;

public class MoveZeroToEnd {

	public static void ZeroToEnd(int[] A){
		
		// int nz=0,z=0;
		// for (int i = 0; i < A.length; i++) {
		// 	if (A[nz]!=0) {
		// 		nz++;
		// 	}
		// 	if (A[z]==0) {
		// 		z++;
		// 	}else{
		// 		int temp=A[z];
		// 		A[z]=A[nz];
		// 		A[nz]=temp;
		// 	}
		// }

		int nz=0;

		for (int i = 0; i < A.length; i++) {
			if (A[i]!=0) {
				A[nz]=A[i];
				nz++;
			}
		}

		while (nz<A.length) {
			A[nz]=0;
			nz++;
		}

		System.out.println();
		System.out.println("Altered Array is: ");

		for (int i : A) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int A[]={0,2,0,4,5,0,7,0,9,10};
		System.out.println("Original Array is: ");
	
		for (int i : A) {
			System.out.print(i+" ");
		}

		ZeroToEnd(A);
	}
}

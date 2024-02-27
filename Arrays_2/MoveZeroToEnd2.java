package Arrays_2;

public class MoveZeroToEnd2 {
	public static void ZeroToEnd(int[] A){
		
		int nz=0,z=0;
		while (z<A.length) {
			if (A[nz]!=0) {
				nz++;
			}
			else if (A[z]==0) {
				z++;
			}else{
				int temp=A[z];
				A[z]=A[nz];
				A[nz]=temp;
			}
		}

		// int nz=0,z=0;
		// while (z<A.length) {
		// 	if (A[z]!=0) {
		// 		int temp=A[z];
		// 		A[z]=A[nz];
		// 		A[nz]=temp;
		// 		nz++;
		// 	}
		// 	z++;
		// }
		

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

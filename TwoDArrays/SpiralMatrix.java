package TwoDArrays;

public class SpiralMatrix {
	
	 public static void spiralPrint(int A[][]){
		int rows=A.length;
		int cols=A[0].length;
		int left=0,rigth=cols-1;
		int top =0,bottom=rows-1;

		while (left<=rigth && top<=bottom) {
			
			for (int i = left; i <= rigth; i++) {
				System.out.print(A[top][i]+" ");
			}
			top++;
			
			for (int i = top; i <= bottom; i++) {
				System.out.print(A[i][rigth]+" ");
			}
			rigth--;

			if (top<=bottom) {
				
				for (int i = rigth; i >= left; i--) {
					System.out.print(A[bottom][i]+" ");
				}
			}
			bottom--;
			if (left<=rigth) {
				
				for (int i = bottom; i >= top; i--) {
					System.out.print(A[i][left]+" ");
				}
			}
			left++;
		}

	 }
	public static void main(String[] args) {
		
	}
}

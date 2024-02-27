package TwoDArrays;

public class RowWiseTraversal {
	
	public static int[] traverse(int arr[][]){
		
		int rows=arr.length;
		int column=arr[0].length;

		int A[]=new int[rows*column];
		int index=0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				A[index]=arr[i][j];
				index++;
			}
		}
		
		return A;
	}
	public static void main(String[] args) {
		int A[][]={{1,2,3},{4,5,6}};

		int B[]=traverse(A);

		for (int i : B) {
			System.out.print(i+" ");
		}
	}
}

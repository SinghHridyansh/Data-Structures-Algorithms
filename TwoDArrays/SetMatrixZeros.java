package TwoDArrays;

public class SetMatrixZeros {
	public static void setzeros(int arr[][]){
		 int rows=arr.length;
		 int columns=arr[0].length;

		 for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (arr[i][j]==0) {
					for (int j2 = 0; j2 < rows; j2++) {
						arr[i][j2]=0;
					}
					for (int j2 = 0; j2 < columns; j2++) {
						arr[j2][j]=0;
					}
				}
			}
		 }



		 for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		//int arr[][]={{1,2,3},{4,0,6},{7,8,9}};
		int arr[][]={{1,2,3},{1,0,3},{5,9,2}};


		setzeros(arr);
	}
}

package CodingninjasStudio;

public class SetMatrixZeroApproach2 {
	

	public static void setItZero(int arr[][]){

		int rows=arr.length;
		int columns =arr[0].length;

		boolean isZero[][]=new boolean[rows][columns];
		

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (arr[i][j]==0) {
					for (int j2 = 0; j2 < rows; j2++) {
						isZero[j2][j]=true;
					}
					for (int j2 = 0; j2 < columns; j2++) {
						isZero[i][j2]=true;
					}
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (isZero[i][j]==true) {
					arr[i][j]=0;	
				}
			}
		}


		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int arr[][]={{7,19,3},{4,21,0},{4,5,1}};

		setItZero(arr);
	}
}

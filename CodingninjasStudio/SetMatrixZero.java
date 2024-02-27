package CodingninjasStudio;

public class SetMatrixZero {
	public static void setItZero(int arr[][]){

		int rows=arr.length;
		int columns =arr[0].length;

		boolean zeroRows[]=new boolean[rows];
		boolean zerocolumns[]=new boolean[columns];

		// for (int i = 0; i < rows; i++) {
		// 	for (int j = 0; j < columns; j++) {
				
		// 		if (arr[i][j]==0) {
		// 			for (int j2 = 0; j2 < rows; j2++) {
		// 				arr[j2][j]=0;
		// 			}
		// 			for (int j2 = 0; j2 < columns; j2++) {
		// 				arr[i][j2]=0;
		// 			}
					
		// 		}

		// 	}
		// }

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (arr[i][j]==0) {
					zeroRows[i]=true;
					zerocolumns[j]=true;
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			if (zeroRows[i]) {
				for (int j = 0; j < columns; j++) {
				arr[i][j]=0;	
				}
			}
		}

		for (int i = 0; i < columns; i++) {
			if (zerocolumns[i]) {
				for (int j = 0; j < rows; j++) {
					arr[j][i]=0;
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


// {{7,19,0},{0,0,0},{4,5,0}}
package TwoDArrays;

public class SumofBoundaryAndDiag {
	
	public static int FindBoundandDiag(int arr[][]){

		// int rows=arr.length;
		// int columns=arr[0].length;

		// int sum=0,top=0,right=columns-1,left=0,bottom=rows-1;

		// for (int i = left; i <= right; i++) {
		// 	sum=sum+ arr[top][i];
		// }

	

		// top++;
		// for (int i = top; i <= bottom; i++) {
		// 	sum +=arr[i][right];
		// }

		

		// right--;
		// for (int i = right; i >= left; i--) {
		// 	sum +=arr[bottom][i];
		// }


		// bottom--;
		// for (int i = bottom; i >= top; i--) {
		// 	sum += arr[i][left];
		// }

	


		// for (int i = 0; i < rows; i++) {
		// 	sum+=arr[i][i];
		// }
		// for (int i = 0; i < rows; i++) {
		// 	sum+=arr[i][rows-1-i];
		// }

		// sum -= arr[0][0]+ arr[0][rows-1]+arr[rows-1][0]+arr[rows-1][rows-1]+arr[rows/2][rows/2];

		//Calculating sum of boundries

		int n=arr.length;
		int sum=0;

		for (int i = 0; i < n; i++) {
			sum+=arr[0][i];
			sum+=arr[n-1][i];
		}

		for (int i = 1; i < n-1; i++) {
			sum+=arr[i][0];
			sum+=arr[i][n-1];
		}

		for (int i = 1; i < n-1; i++) {
			sum+=arr[i][i];
			sum+=arr[i][n-i-1];
		}
		if (n%2!=0) {
			sum-=arr[n/2][n/2];
		}
		

		return sum;
	}
	public static void main(String[] args) {
		int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		System.err.println(FindBoundandDiag(arr));
	}
}

// 1  2  3  4  5
// 6  7  8  9  10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25

// 1  2  3  4  5
// 6  7  8  9  10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
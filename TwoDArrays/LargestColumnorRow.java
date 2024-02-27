package TwoDArrays;

public class LargestColumnorRow {
	public static void largestColSum(int arr[][]){

		// int row=arr.length;
		// int column=arr[0].length;

		// int sumArr[]= new int[column];
		// int sum=0;
		// for (int i = 0; i < row; i++) {
		// 	int colindex=0;
		// 	for (int j = 0; j < column; j++) {
		// 		sum+=arr[colindex][i];
		// 		colindex++;
		// 	}
		// 	sumArr[i]=sum;
		// 	sum=0;
		// }

		// int maxSum=sumArr[0];
		// int maxIndex=0;

		// for (int i = 1; i < sumArr.length; i++) {
		// 	if (sumArr[i]>maxSum) {
		// 		maxSum=sumArr[i];
		// 		maxIndex=i;
		// 	}
		// }

		// System.out.print("column "+maxIndex+" "+sumArr[maxIndex]);
		int rows=arr.length;
		int column =arr[0].length;

		int maxSum=Integer.MIN_VALUE;
		boolean isRow = true;
		int idx=-1;

		for (int i = 0; i < rows; i++) {
			int sum=0;
			for (int j = 0; j < column; j++) {
				sum+=arr[i][j];
			}
			if (sum>maxSum) {
				maxSum=sum;
				idx=i;
			}
		}
		
		for (int i = 0; i < column; i++) {
			int sum=0;
			for (int j = 0; j < rows; j++) {
				sum+=arr[j][i];
			}
			if (sum>maxSum) {
				maxSum=sum;
				isRow=false;
				idx=i;
			}
		}
		if (isRow) {
            System.out.println("row " + idx + " " + maxSum);
        } else {
            System.out.println("column " + idx + " " + maxSum);
        }
		
	}
	public static void main(String[] args) {
		int arr[][]={{5,2,1,3},{4,6,8,7},{0,2,9,1},{5,7,6,4}};
		//System.out.println(largestColSum(arr));
		largestColSum(arr);
	}
}

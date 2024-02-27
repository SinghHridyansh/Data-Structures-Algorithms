package Time_and_space_Complexity;

public class EquilibriumIndex {
	
	public static int findINdex(int arr[]){

		int leftSum=0,rightSum=0,totalSum=0,index=0;
		
		for (int e : arr) {
			totalSum+=e;
		}

		while (index<arr.length) {
			rightSum=totalSum-leftSum-arr[index];

			if (rightSum==leftSum) {
				return index;
			}else{
				leftSum=leftSum+arr[index];
			}
			index=index+1;
		}
	
		return -1;
	}

	public static void main(String[] args) {
		int arr[]={1,4,9,3,2};

		System.out.print(findINdex(arr));
	}
}

// package Recursion_2;

// public class ReturnSubsetOfArray {
	
// 	public static void Printer(){

// 	}

// 	public static void printerHelper(nums[],current[],index){
// 		System.out.println(current);

// 		for (int i = index; i < nums.length; i++) {
			
// 		}
// 	}

// 	public static void main(String[] args) {
// 		int arr[]={15,20,12};
// 	}
// }


// public static int[][] subsets(int input[]) {
// 	// Write your code here
// 	return generateSubsets(input, 0, new int[0]);
// }

//  public static int[][] generateSubsets(int[] input, int index, int[] currentSubset) {
// 	if (index == input.length) {
 
// 		for (int num : currentSubset) {
// 			System.out.print(num + " ");
// 		}
// 		System.out.println();
// 		return;
// 	}

 
// 	generateSubsets(input, index + 1, currentSubset);


// 	int[] updatedSubset = new int[currentSubset.length + 1];
// 	System.arraycopy(currentSubset, 0, updatedSubset, 0, currentSubset.length);
// 	updatedSubset[currentSubset.length] = input[index];

// 	generateSubsets(input, index + 1, updatedSubset);
// }
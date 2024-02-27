package Test2;
//import java.util.Arrays;

public class FindLeaders {

	public static void leaders(int arr[]){
		int len=arr.length;
		int A[]=new int[len];
		int index=0;

		for (int i = 0; i < len-1; i++) {
			if (arr[i]>arr[i+1]) {
				A[index]=arr[i];
				index++;		
			}
		}

		int nonZeroCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                nonZeroCount++;
            }
        }

		int[] result = new int[nonZeroCount];
        int index2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                result[index2++] = A[i];
            }
        }

		int lenNew=result.length;
		for (int i = 0; i < lenNew - 1; i++) {
            for (int j = 0; j < lenNew - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                 
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

		for (int i : result) {
			System.out.print(i+" ");
		}



	}
	public static void main(String[] args) {
		int arr[]={975 ,446 ,107 ,111 ,209 ,383 ,431 ,257 ,313 ,423 ,498 ,415 ,93 ,145 ,457 ,92 ,171 ,300 ,248,192 ,6 ,410 ,55 ,356 ,334 ,145 ,307 ,115 ,500 ,254};

		leaders(arr);
	}
}

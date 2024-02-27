package Arrays_2;

public class PrefixSum {

	public static void SumThePrefix(int arr[]){

		int len=arr.length;
		int B[]=new int[len];

		for (int i = 0; i < arr.length; i++) {
			//int temp=0;
			for (int j = 0; j <= i; j++) {
				B[i]=B[i]+arr[j];
			}
		}
		
		for (int i : B) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int A[]={1,2,3,4,5};
		System.out.println("The original Array is: ");
		System.out.println();
		for (int i : A) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Prefixed Sum Array is: ");
		SumThePrefix(A);
	}
}

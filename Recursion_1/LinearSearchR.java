package Recursion_1;

public class LinearSearchR {
	
	public static boolean checkit(int arr[],int x){
	 return findItDamnit(arr, x, arr.length);
		

	}

	public static boolean findItDamnit(int arr[],int x,int size	){
		
		if (size==0) {
			return false;
		}
		if (arr[size-1]==x) {
			return true;
		}
		
		return findItDamnit(arr, x, size-1);


	}

	public static void main(String[] args) {
		int arr[]={9, 8, 10};
		int x=10;
		System.out.println(checkit(arr, x));
	}
}

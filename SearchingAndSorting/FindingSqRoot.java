package SearchingAndSorting;

public class FindingSqRoot {
	
	public static int sqroot(int n){

		//return (int)Math.floor(Math.sqrt(n));

		if (n==0 || n==1) {
			return 1;
		}

		int low=2,high=n,mid=0;

		while (low<high) {
			mid=(low+high)/2;
			if (mid<= n/mid) {
				low=mid+1;
			}else{
				high =mid;
			}
		}

		return low-1;


	}
	public static void main(String[] args) {
		int num=16;

		System.out.println(sqroot(num));
	}
}

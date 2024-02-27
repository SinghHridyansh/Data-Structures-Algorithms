package SearchingAndSorting;

public class CountSmall {
	
	public static int[] countS(int n, int m, int []a, int []b){

		int res[]=new int[n];
		// int counter=0;

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		if (b[j]<=a[i]) {
		// 			counter++;
		// 		}
		// 	}
		// 	res[i]=counter;
		// 	counter=0;
		// }

		for (int i = 0; i < n; i++) {
			int low=0,high=m-1,count=0;

			while (low<=high) {
				int mid=(low+high)/2;
				if (b[mid]<=a[i]) {
					low=mid+1;
					count=mid+1;
				}else{
					high=mid-1;
				}
			}
			res[i]=count;
		}

		return res;

	}

	public static void main(String[] args) {
		int arr1[]={2,4};
		int arr2[]={1,3,5};

		int len1=arr1.length;
		int len2 =arr2.length;

		int res[]=countS(len1, len2, arr1, arr2);

		for (int i : res) {
			System.out.print(i+" ");
		}
	}
}

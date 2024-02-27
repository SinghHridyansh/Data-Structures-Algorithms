package Arrays_1;

public class FindUnique {
	public static int FindUniqueInt(int[] arr){
		
		int n=arr.length;
		boolean found =false;

		for(int i=0;i<n;i++){
			found=false;

			for(int j=0;j<n;j++){
				if (i!=j && arr[i]==arr[j]) {
					found=true;
					break;
				}
			}

			if (!found) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[]={5};
		//int array[]={2, 3, 1, 6, 3, 6, 2};
		int unique=FindUniqueInt(array);
		System.out.println(unique);
	}
}

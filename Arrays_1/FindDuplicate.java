package Arrays_1;

public class FindDuplicate {

	public static int FindDuplicateInt(int arr[]){
		int n=arr.length;
		boolean found=false;

		for(int i=0;i<n;i++){
			found=false;
			for (int j = 0; j < n; j++) {
				if (i!=j && arr[i] == arr[j]) {
					found =true;
					break;
				}
			}
			if(found){
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[]={0, 3, 2, 5, 4, 7, 1, 3, 6};
		int duplicate=FindDuplicateInt(array);
		System.out.println(duplicate);
	}
}

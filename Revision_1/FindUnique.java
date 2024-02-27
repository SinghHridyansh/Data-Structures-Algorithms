package Revision_1;

public class FindUnique {

	public static int findtheOne(int arr[]){

		int n=arr.length;
		boolean found =false;

		for(int i=0;i<n;i++){
			found=false;

			for(int j=0;j<n;j++){
				if (i!=j && arr[i]==arr[j]) {
					found=true;
					//System.out.print("broke it !");
					break;
				}
			}

			if (!found) {
				return arr[i];
				//System.out.print(arr[i]+" ");
			}
		}
		return -1;
		//System.out.println("");
	}
	public static void main(String[] args) {
		int arr[]={1,3,1,3,6,6,7,10,7};

		System.out.println("The unique number of all is :");
		//findtheOne(arr);
		System.out.println(findtheOne(arr));
	}
}

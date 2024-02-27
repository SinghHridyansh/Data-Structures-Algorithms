package Revision_1;

public class IntersectingElemOfArr {

	public static void intersection( int arr1[],int arr2[]){

		int n1=arr1.length;
		int n2=arr2.length;

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr2[j]=-1;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr1[]={2, 6, 8, 5, 4, 3};
		int arr2[]={2, 3, 4, 7 };
		
		intersection(arr1, arr2);
	}
		
}

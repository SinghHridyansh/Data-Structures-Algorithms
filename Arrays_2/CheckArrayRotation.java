package Arrays_2;

public class CheckArrayRotation {

	public static int RotateCheck(int[] arr){
		int len=arr.length;
		int index=0;
		for (int i = 0; i < len-1; i++) {
			if (arr[i]>arr[i+1]) {
				index=i+1;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int A[]={5,6,1,2,3,4};

		int rotationIndex=RotateCheck(A);
		System.out.println(rotationIndex);
	}
}

package Arrays_2;

public class RotateArrayRight {
	public static void RotateArr(int arr[],char dir, int rotateby){
		int len=arr.length;
		int B[]=new int[len];

		switch (dir) {
			case 'L':
				for (int i = 0; i < arr.length; i++) {
					B[(i-rotateby+len)%len]=arr[i];
				}
				
				break;
			
			case 'R':
				for (int i = 0; i < arr.length; i++) {
					B[(i+rotateby)%len]=arr[i];
				}
				
				break;
			default:
				System.out.println("Array is the same.");
				break;
		}

		System.out.println();
		System.out.println("Rotated Array is :");
		for (int i : B) {
			System.out.print(i+" ");
		}

	}
	public static void main(String[] args) {
		int A[]={6,2,4,8,9,1,5};
		char dir='L';
		int rotateby=2;

		System.out.println("Rotating array right!");
		System.out.println();
		System.out.println("Original Array is: ");

		for (int i : A) {
			System.out.print(i+" ");
		}

		RotateArr(A, dir, rotateby);
	}
}

package Pattens;

//    *
//   ***
//  *****
// *******


public class Pyramid101 {
	public static void main(String[] args) {
		int n=4;

		for(int i=1;i<=n;i++){
			//i-th row

			//print spaces (n=i)
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}

			//print pattern (2i-1)
			for(int j=1;j<=2*i-1;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

package Pattens;

// 1 
// 2 2
// 3 3 3

public class NumberTriangle4 {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

package Pattens;

// 1
// 2 3
// 3 4 5
// 4 5 6 7

public class Numbertriangle3 {
	public static void main(String[] args) {
		int n=4;
		//int count=1;
		for(int i=0;i<=n;i++){
			int	count=i;
			for(int j=1;j<=i;j++){
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}

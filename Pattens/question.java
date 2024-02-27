package Pattens;
//import java.util.Scanner;

public class question {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int N =5;
		int start=5;
		
		for(int i=0;i<N;i++){
			if (i%2==0) start=1;
			else start =0;
			for(int j=0;j<=i;j++){
				System.out.print(start);
				start=1-start;
		}
		System.out.println();
//		sc.close();
	}
}
}
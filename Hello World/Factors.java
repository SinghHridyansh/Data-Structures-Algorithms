// import java.util.Scanner;
// public class Factors {
// 	public static void main(String[] args) {
// 		Scanner sc =new Scanner(System.in);
// 		int number= sc.nextInt();
// 		boolean hasfactors=false;

// 		for(int i=2;i<number/2;i++){
// 			if (number%i==0) {
// 				if (hasfactors) {
// 					System.out.print(" ");
// 				}
//                 System.out.print(i);
// 				hasfactors=true;
// 			}
// 		}
// 		if (!hasfactors) {
// 			System.out.print(-1);
// 		}

// 		sc.close();
// 	}
// }
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number 'n'
        int n = scanner.nextInt();

        // Check for factors and print them (excluding 1 and n)
        //System.out.print("Factors of " + n + " excluding 1 and " + n + ": ");
        boolean hasFactors = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                if (hasFactors) {
                    System.out.print(" ");
                }
                System.out.print(i);
                hasFactors = true;
            }
        }

        if (!hasFactors) {
            System.out.print(-1);
        }

        scanner.close();
    }
}

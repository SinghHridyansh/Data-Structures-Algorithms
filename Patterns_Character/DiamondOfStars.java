package Patterns_Character;

import java.util.Scanner;

public class DiamondOfStars {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n/2+1;i++){

            for(int j=i;j<=n/2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

        for (int i = n/2; i >= 1; i--) {

            for (int j = n/2+1; j > i; j--) {
                System.out.print(" ");
            }

        
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}

//    *
//   ***
//  *****
// *******
// *********

// // Upper part of the pattern
// for (int i = 1; i <= n; i++) {
//     // Print spaces before stars
//     for (int j = i; j < n; j++) {
//         System.out.print(" ");
//     }

//     // Print stars
//     for (int j = 1; j <= 2 * i - 1; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }

// // Lower part of the pattern
// for (int i = n - 1; i >= 1; i--) {
//     // Print spaces before stars
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }

//     // Print stars
//     for (int j = 1; j <= 2 * i - 1; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
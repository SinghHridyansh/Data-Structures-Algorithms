package Pattens;

import java.util.Scanner;

 public class Squarenumberrotate {
// 	public static void main(String[] args) {
// 		Scanner sc =new Scanner(System.in);
// 		int rows=sc.nextInt();

// 		for (int i = 1; i <= rows; i++) {
//             int num = i;

//             for (int j = 0; j < rows; j++) {
//                 System.out.print(num);


//                 num++;
//                 if (num > rows) {
//                     num = 1;
//                 }
//             }

//             System.out.println();
//         }
// 		sc.close();
// 	}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt(); // Input the number of rows

        for (int i = 1; i <= rows; i++) {
            // Print numbers for each row
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 ) {
                    System.out.print(j);
                } else if (i >= 2 && i <= rows - 1 && j == rows) {
                    System.out.print("2");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after printing each row
            System.out.println();
        }

        scanner.close();
    }
}


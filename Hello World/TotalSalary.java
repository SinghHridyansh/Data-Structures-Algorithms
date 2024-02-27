import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int basicSalary = scanner.nextInt();
        char grade = scanner.next().charAt(0);

        int hra = (20 * basicSalary) / 100;
        int da = (50 * basicSalary) / 100;
        int allow;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double pf = (11 * basicSalary) / 100.0;
        double totalSalary = basicSalary + hra + da + allow - pf;


        int roundedTotalSalary = (int) Math.round(totalSalary);
        System.out.println(roundedTotalSalary);

        scanner.close();
    }
}

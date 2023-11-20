package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class RefactorSpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int ch = 1; ch <= number; ch++) {
            int sum = 0;
            int digit = ch;
            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10;
            }
            ch = digit;
            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum) {
                System.out.printf("%d -> True%n", digit);
            } else {
                System.out.printf("%d -> False%n", digit);
            }
        }
    }
}

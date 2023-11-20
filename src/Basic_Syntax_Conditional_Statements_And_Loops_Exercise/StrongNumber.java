package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] digits = num.split("");

        int sum = 0;
        int factorial = 1;

        for (int i = 0; i <= num.length() - 1; i++) {
            for (int j = 1; j <= Integer.parseInt(digits[i]); j++) {
                factorial *= j;
            }
            sum += factorial;
            factorial = 1;
        }
        if (sum == Integer.parseInt(num)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}


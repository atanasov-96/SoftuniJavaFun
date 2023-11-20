package Methods_Exercises;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int n = 1; n <= number; n++) {

            boolean digitSumIsDivisibleBy8 = checkIsDivisibleBy8(n);
            boolean hasOddNumber = checkHasOddNumber(n);

            if (digitSumIsDivisibleBy8 && hasOddNumber) {
                System.out.println(n);
            }
        }
    }

    public static boolean checkIsDivisibleBy8(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkHasOddNumber(int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num /= 10;
            }
        }
        return false;
    }
}

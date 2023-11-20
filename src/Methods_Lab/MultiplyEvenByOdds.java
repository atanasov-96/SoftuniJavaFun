package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(multiplier(number));
    }

    public static int multiplier(int num) {
        int evenSum = 0;
        int oddSum = 0;
        String number = String.valueOf(num);
        for (int i = 0; i <= number.length() - 1; i++) {
            char digitChar = number.charAt(i);
            int digitValue = Character.getNumericValue(digitChar);
            if (digitValue % 2 == 0) {
                evenSum += digitValue;
            } else {
                oddSum += digitValue;
            }
        }
        return evenSum * oddSum;
    }
}

package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int sumOfDigits = 0;
            int digit = i;
            while (digit > 0) {
                sumOfDigits += digit % 10;
                digit = digit / 10;
            }
            switch (sumOfDigits) {
                case 5: case 7: case 11:
                    System.out.println(i + " -> True");
                    break;
                default:
                    System.out.println(i + " -> False");
                    break;
            }
        }
    }
}

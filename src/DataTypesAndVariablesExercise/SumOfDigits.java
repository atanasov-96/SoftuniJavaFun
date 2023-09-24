package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int result = 0;
        for (int i = 0; i <= num.length() - 1; i++) {
            result = result + Integer.parseInt(String.valueOf(num.charAt(i)));

        }
        System.out.println(result);
    }
}

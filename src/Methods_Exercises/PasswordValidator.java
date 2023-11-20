package Methods_Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        isValidPassword(password);
    }

    private static void isValidPassword(String pass) {
        if (hasValidDigits(pass) && hasValidLength(pass) && hasValidChars(pass)) {
            System.out.println("Password is valid");
        } else {

            if (!hasValidLength(pass)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!hasValidChars(pass)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!hasValidDigits(pass)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    private static boolean hasValidChars(String pass) {
        for (int i = 0; i < pass.length(); i++) {

            char ch = pass.charAt(i);
            boolean isValidChars = Character.isDigit(ch) || Character.isLetter(ch);
            if (!isValidChars) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasValidLength(String pass) {
        return 6 <= pass.length() && pass.length() <= 10; // if 6 <= N <= 10 true
    }

    private static boolean hasValidDigits(String pass) {
        int digitsCount = 0;
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                digitsCount++;
            }
        }
        return digitsCount >= 2; // if >= 2 true
    }
}

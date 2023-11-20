package Methods_Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        middleChars(str);
    }

    private static void middleChars(String str) {
        String chars = "";

        int mid = str.length() / 2;
        if (str.length() % 2 != 0) {
            chars = String.valueOf(str.charAt(mid));
        } else {
            chars += String.valueOf(str.charAt(mid - 1));
            chars += String.valueOf(str.charAt(mid));
        }

        System.out.println(chars);
    }
}

package Text_Processing_Exercises;

import java.util.Scanner;

public class CaesarsCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) + 3);
            encrypted.append(ch);
        }
        System.out.printf(String.valueOf(encrypted));
    }
}

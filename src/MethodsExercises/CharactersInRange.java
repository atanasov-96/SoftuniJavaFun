package MethodsExercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        charsInRange(firstChar,secondChar);

    }
    public static void charsInRange(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (int i = firstChar; i < secondChar - 1; i++) {
                System.out.print((char) (i + 1) + " ");
            }
        } else {
            for (int i = secondChar; i < firstChar - 1; i++) {
                System.out.print((char) (i + 1) + " ");
            }
        }
    }
}

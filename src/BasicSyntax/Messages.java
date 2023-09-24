package BasicSyntax;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        String ch = "";
        int numOfDigits = 0;
        int mainDigit = 0;
        int offset = 0;
        int index = 0;
        String result = "";
        for (int i = 0; i < lines; i++) {
            String letter = scanner.nextLine();
            numOfDigits = letter.length();
            mainDigit = letter.charAt(0);
            offset = (mainDigit - 2) * 3;
            index = (offset + numOfDigits) - 1;

        }
        System.out.println(result);
    }
}

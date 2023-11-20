package Basic_Syntax_Conditional_Statements_And_Loops_More_Exercises;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int index;
        String str = "";

        for (int i = 0; i < lines; i++) {
            String letter = scanner.nextLine();
            int mainDigit = letter.charAt(0);
            int digitLength = letter.length();

            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 48) {                           // 48 == 0
                index = 32;                                  // 32 == space
            } else if (mainDigit == 56 || mainDigit == 57) { // 56 == 8 | 57 == 9
                index = (offset + digitLength - 1) - 46;
            } else {
                index = (offset + digitLength - 1) - 47;
            }
            str += (char) index;
        }
        System.out.println(str);
    }
}

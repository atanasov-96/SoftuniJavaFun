package Text_Processing_Exercises;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder(String.valueOf(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.charAt(i) != input.charAt(i - 1)) {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

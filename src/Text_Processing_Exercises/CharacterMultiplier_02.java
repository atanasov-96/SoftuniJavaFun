package Text_Processing_Exercises;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        int result = 0;

        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            result += first.charAt(i) * second.charAt(i);
        }

        for (int j = Math.min(first.length(), second.length()); j < Math.max(first.length(), second.length()); j++) {
            result += (first.length() > second.length()) ? first.charAt(j) : second.charAt(j);
        }
        System.out.println(result);
    }
}

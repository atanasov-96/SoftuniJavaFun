package Text_Processing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            String redacted = redact(word, word.length());
            text = text.replace(word, redacted);
        }
        System.out.println(text);
    }


    public static String redact(String bannedWord, int repetitions) {
        String[] repeated = new String[repetitions];
        for (int i = 0; i < repetitions; i++) {
            repeated[i] = "*";
        }
        return String.join("", repeated);
    }
}

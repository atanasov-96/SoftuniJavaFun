package Final_Exam_Prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern emojiPattern = Pattern.compile("(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})(\\1)");
        Matcher emojiMatcher = emojiPattern.matcher(text);

        List<String> coolEmojis = new ArrayList<>();

        long coolThreshold = thresholdCounter(text);
        int emojiCount = 0;

        while (emojiMatcher.find()) {
            emojiCount++;
            String currEmoji = emojiMatcher.group("emoji");
            long currThreshold = currEmoji.chars().sum();

            if (currThreshold >= coolThreshold) {
                coolEmojis.add(emojiMatcher.group());
            }
        }

        System.out.printf("Cool threshold: %d%n",coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCount);
        for (String emoji : coolEmojis) {
            System.out.println(emoji);
        }
    }

    public static long thresholdCounter(String text) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(text);
        long threshold = 1;
        while (matcher.find()) {
            threshold *= Integer.parseInt(matcher.group());
        }
        return threshold;
    }
}

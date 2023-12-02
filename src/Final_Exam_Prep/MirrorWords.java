package Final_Exam_Prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@#])(?<word>[A-Za-z]{3,})\\1\\1(?<reverseWord>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(words);

        List<String> mirroredWords = new ArrayList<>();

        int count = 0;

        while (matcher.find()) {
            count++;
            String word = matcher.group("word");
            StringBuilder reverseWord = new StringBuilder(matcher.group("reverseWord")).reverse();
            if (word.contentEquals(reverseWord)) {
                mirroredWords.add(String.format("%s <=> %s", word, reverseWord.reverse()));
            }
        }
        if (count == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!\n", count);
        }
        if (mirroredWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ",mirroredWords));

        }
    }
}

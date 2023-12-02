package Text_Processing_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.nextLine();

        double totalSum = 0.0;
        Pattern pattern = Pattern.compile("(?<startLetter>[A-Za-z])(?<number>[0-9]+)(?<endLetter>[A-Za-z])");
        Matcher matcher = pattern.matcher(strings);

        while (matcher.find()){
            double currentSum;
            char startLetter  = matcher.group("startLetter").charAt(0);
            char endLetter  = matcher.group("endLetter").charAt(0);
            int number = Integer.parseInt(matcher.group("number"));

            if (startLetter == Character.toUpperCase(startLetter)){
                currentSum = number / position(startLetter);
            } else {
                currentSum = number * position(startLetter);
            }
            if (endLetter == Character.toUpperCase(endLetter)) {
                currentSum = currentSum - position(endLetter);
            } else {
                currentSum = currentSum + position(endLetter);
            }
            totalSum += currentSum;
        }
        System.out.printf("%.2f", totalSum);
    }
    public static double position(char letter) {
        char toUpperCase = Character.toUpperCase(letter);
        return toUpperCase - 'A' + 1;
    }
}
